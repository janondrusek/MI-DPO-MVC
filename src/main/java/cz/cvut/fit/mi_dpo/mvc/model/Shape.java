package cz.cvut.fit.mi_dpo.mvc.model;

import java.awt.Graphics;
import java.awt.Point;

public interface Shape {

	public String getId();

	public void setId(String id);

	public int getSize();

	public Point getPosition();

	public void paint(Graphics g);

	public void setSize(int size);
}
