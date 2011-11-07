package cz.cvut.fit.mi_dpo.mvc.presenter;

import java.util.Observable;

import cz.cvut.fit.mi_dpo.mvc.view.TableShapeView;

public class TableShapePresenter extends AbstractPresenter<TableShapeView> {

	public TableShapePresenter(TableShapeView view) {
		super(view);
	}

	@Override
	protected void addListeners() {

	}

	@Override
	public void update(Observable o, Object arg) {
		getView().repaint();
	}

}
