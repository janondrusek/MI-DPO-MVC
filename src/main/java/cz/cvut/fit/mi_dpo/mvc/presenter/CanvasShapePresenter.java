package cz.cvut.fit.mi_dpo.mvc.presenter;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import java.util.Observable;

import cz.cvut.fit.mi_dpo.mvc.model.Circle;
import cz.cvut.fit.mi_dpo.mvc.model.Shape;
import cz.cvut.fit.mi_dpo.mvc.model.Square;
import cz.cvut.fit.mi_dpo.mvc.service.ShapeStorageService;
import cz.cvut.fit.mi_dpo.mvc.view.CanvasShapeView;

public class CanvasShapePresenter extends AbstractPresenter<CanvasShapeView> {

	public CanvasShapePresenter(CanvasShapeView view) {
		super(view);
		addListeners();
	}

	@Override
	protected void addListeners() {
		getView().getComponent().addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == MouseEvent.BUTTON1) {
					addCircle(e.getPoint());
				} else if (e.getButton() == MouseEvent.BUTTON3) {
					addSquare(e.getPoint());
				}
			}

		});
	}

	@Override
	public void update(Observable o, Object arg) {
		getView().setShapes(getShapes());
		getView().repaint();
	}

	private List<Shape> getShapes() {
		return ShapeStorageService.getInstance().getShapes();
	}

	public void addCircle(Point point) {
		addCircle(new Circle(point));
	}

	public void addSquare(Point point) {
		addSquare(new Square(point));
	}

}
