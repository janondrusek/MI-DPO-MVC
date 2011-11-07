package cz.cvut.fit.mi_dpo.mvc.model;

import java.awt.Point;

public abstract class AbstractShape implements Shape {

	private String id;

	private int size;

	private Point position;

	protected AbstractShape() {
		id = "";
	}

	protected AbstractShape(int size, Point position) {
		this();
		this.size = size;
		this.position = position;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
