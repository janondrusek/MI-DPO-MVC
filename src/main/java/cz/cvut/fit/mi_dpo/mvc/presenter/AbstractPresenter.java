package cz.cvut.fit.mi_dpo.mvc.presenter;

import cz.cvut.fit.mi_dpo.mvc.model.Circle;
import cz.cvut.fit.mi_dpo.mvc.model.Square;
import cz.cvut.fit.mi_dpo.mvc.service.ShapeStorageService;
import cz.cvut.fit.mi_dpo.mvc.view.ShapeView;

public abstract class AbstractPresenter<T extends ShapeView> implements Presenter {

	private T view;

	protected AbstractPresenter(T view) {
		this.view = view;
		addListeners();
	}

	abstract protected void addListeners();

	protected void addCircle(Circle circle) {
		ShapeStorageService.getInstance().save(circle);
	}

	protected void addSquare(Square square) {
		ShapeStorageService.getInstance().save(square);
	}

	protected T getView() {
		return view;
	}

}
