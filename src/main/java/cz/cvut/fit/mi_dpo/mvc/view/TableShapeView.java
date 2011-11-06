package cz.cvut.fit.mi_dpo.mvc.view;

import java.awt.Component;

import javax.swing.JPanel;

import cz.cvut.fit.mi_dpo.mvc.presenter.TableShapePresenter;

public class TableShapeView extends AbstractShapeView<TableShapePresenter> {

	public TableShapeView() {
		setPresenter(new TableShapePresenter(this));
	}

	@Override
	public void repaint() {

	}

	@Override
	public Component getComponent() {
		return new JPanel();
	}

}
