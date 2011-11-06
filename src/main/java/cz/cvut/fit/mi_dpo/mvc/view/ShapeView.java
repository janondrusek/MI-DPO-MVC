package cz.cvut.fit.mi_dpo.mvc.view;

import java.awt.Component;

import cz.cvut.fit.mi_dpo.mvc.presenter.Presenter;

public interface ShapeView {

	public Presenter getPresenter();

	public Component getComponent();

	public void repaint();
}
