package cz.cvut.fit.mi_dpo.mvc.presenter;

import java.util.Observable;

import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

import cz.cvut.fit.mi_dpo.mvc.view.TableShapeView;

public class TableShapePresenter extends AbstractPresenter<TableShapeView> {

	public TableShapePresenter(TableShapeView view) {
		super(view);
	}

	@Override
	protected void addListeners() {
		for (JTable table : getView().getTables()) {
			addListeners(table);
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		getView().repaint();
	}

	private void addListeners(JTable table) {
		table.getModel().addTableModelListener(new TableModelListener() {

			@Override
			public void tableChanged(TableModelEvent e) {
				e.getSource();
			}
		});

	}
}
