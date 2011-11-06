package cz.cvut.fit.mi_dpo.mvc.model;

import java.awt.Graphics;
import java.awt.Point;

public class Square extends AbstractShape {

	public Square(Point position) {
		super(position);
	}

	@Override
	public void paint(Graphics g) {
		g.drawRect((int) getPosition().getX(), (int) getPosition().getY(), getSize(), getSize());
	}

}
