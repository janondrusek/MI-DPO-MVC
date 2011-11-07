package cz.cvut.fit.mi_dpo.mvc.view;

import cz.cvut.fit.mi_dpo.mvc.presenter.Presenter;

/**
 * Presenter - View relation is 1 : 1 
 */
abstract public class AbstractShapeView<T extends Presenter> implements ShapeView {

	private T presenter;

	protected void setPresenter(T presenter) {
		this.presenter = presenter;
	}

	public T getPresenter() {
		return presenter;
	}

}
