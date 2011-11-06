package cz.cvut.fit.mi_dpo.mvc.model;

import java.awt.Point;

import org.apache.commons.lang3.StringUtils;

public abstract class AbstractShape implements Shape {

	private static final int DEFAULT_SIZE = 10;

	private String id;

	private int size;

	private Point position;

	protected AbstractShape() {
		id = StringUtils.EMPTY;
		size = DEFAULT_SIZE;
	}

	protected AbstractShape(Point position) {
		this();
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
