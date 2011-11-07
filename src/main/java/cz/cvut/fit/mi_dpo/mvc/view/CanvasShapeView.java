package cz.cvut.fit.mi_dpo.mvc.view;

import java.awt.Component;
import java.awt.Dimension;
import java.util.List;

import cz.cvut.fit.mi_dpo.mvc.ShapeCanvas;
import cz.cvut.fit.mi_dpo.mvc.model.Shape;
import cz.cvut.fit.mi_dpo.mvc.presenter.CanvasShapePresenter;

public class CanvasShapeView extends AbstractShapeView<CanvasShapePresenter> {

	private ShapeCanvas canvas;

	public CanvasShapeView() {
		initCanvas();
		setPresenter(new CanvasShapePresenter(this));
	}

	private void initCanvas() {
		canvas = new ShapeCanvas();

		canvas.setPreferredSize(new Dimension(300, 400));
		canvas.setMaximumSize(new Dimension(300, Integer.MAX_VALUE));
	}

	public void setShapes(List<Shape> shapes) {
		canvas.setShapes(shapes);
	}

	@Override
	public void repaint() {
		canvas.repaint();
	}

	@Override
	public Component getComponent() {
		return canvas;
	}

}
