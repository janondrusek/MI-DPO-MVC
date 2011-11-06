package cz.cvut.fit.mi_dpo.mvc.presenter;

import cz.cvut.fit.mi_dpo.mvc.model.Shape;
import cz.cvut.fit.mi_dpo.mvc.service.ShapeStorageService;
import cz.cvut.fit.mi_dpo.mvc.view.ShapeView;

public abstract class AbstractPresenter<T extends ShapeView> implements Presenter {

	private T view;

	protected AbstractPresenter(T view) {
		this.view = view;
	}

	protected void addShape(Shape shape) {
		ShapeStorageService.INSTANCE.save(shape);
	}

	protected T getView() {
		return view;
	}

}
