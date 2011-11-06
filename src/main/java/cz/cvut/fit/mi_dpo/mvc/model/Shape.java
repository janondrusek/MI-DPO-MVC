package cz.cvut.fit.mi_dpo.mvc.model;

import java.awt.Graphics;

public interface Shape {

	public String getId();

	public void setId(String id);

	public void paint(Graphics g);
}
