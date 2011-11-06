package cz.cvut.fit.mi_dpo.mvc.view;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableModel;

import cz.cvut.fit.mi_dpo.mvc.presenter.TableShapePresenter;

public class TableShapeView extends AbstractShapeView<TableShapePresenter> {

	private List<JTable> tables;

	private JPanel panel;

	public TableShapeView(TableModel... tableModels) {
		setPresenter(new TableShapePresenter(this));
		initPanel();
		initTables(tableModels);
	}

	private void initPanel() {
		panel = new JPanel();
	}

	private void initTables(TableModel[] tableModels) {
		tables = new ArrayList<JTable>();
		for (TableModel tableModel : tableModels) {
			JTable table = new JTable(tableModel);
			panel.add(table);
			tables.add(table);
		}
	}

	@Override
	public void repaint() {
		for (JTable table : tables) {
			table.repaint();
		}
	}

	@Override
	public Component getComponent() {
		return panel;
	}

}
