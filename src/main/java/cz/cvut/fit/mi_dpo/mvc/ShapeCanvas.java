package cz.cvut.fit.mi_dpo.mvc;

import java.awt.Canvas;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import cz.cvut.fit.mi_dpo.mvc.model.Shape;

public class ShapeCanvas extends Canvas {

	private static final long serialVersionUID = -2088771921379912544L;

	private List<Shape> shapes = new ArrayList<Shape>();

	@Override
	public void paint(Graphics g) {
		for (Shape shape : getShapes()) {
			shape.paint(g);
		}
	}

	public List<Shape> getShapes() {
		return shapes;
	}

	public void setShapes(List<Shape> shapes) {
		this.shapes = shapes;
	}

}
