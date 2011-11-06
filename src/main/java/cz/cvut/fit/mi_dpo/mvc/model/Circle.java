package cz.cvut.fit.mi_dpo.mvc.model;

import java.awt.Graphics;
import java.awt.Point;

public class Circle extends AbstractShape {

	public Circle(Point position) {
		super(position);
	}

	@Override
	public void paint(Graphics g) {
		g.drawOval((int) getPosition().getX(), (int) getPosition().getY(), getSize(), getSize());

	}
}
