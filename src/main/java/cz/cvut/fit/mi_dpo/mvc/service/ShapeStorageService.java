package cz.cvut.fit.mi_dpo.mvc.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.UUID;

import cz.cvut.fit.mi_dpo.mvc.model.Circle;
import cz.cvut.fit.mi_dpo.mvc.model.Shape;
import cz.cvut.fit.mi_dpo.mvc.model.Square;

/**
 * Singleton service is nothing more than a Shape storage Because I have to keep
 * Shape superclass, each superclass is stored in its own map
 * 
 * This is Observable model, triggers all Obervers to repaint when changed
 */
public class ShapeStorageService extends Observable {

	private Map<String, Circle> circles = new LinkedHashMap<String, Circle>();

	private Map<String, Square> squares = new LinkedHashMap<String, Square>();

	private static ShapeStorageService instance;

	private ShapeStorageService() {

	}

	public synchronized static ShapeStorageService getInstance() {
		if (instance == null) {
			instance = new ShapeStorageService();
		}
		return instance;
	}

	public List<Shape> getShapes() {
		List<Shape> shapes = new ArrayList<Shape>(circles.values());
		shapes.addAll(squares.values());

		return shapes;
	}

	public List<Circle> getCircles() {
		return new ArrayList<Circle>(circles.values());
	}

	public List<Square> getSquares() {
		return new ArrayList<Square>(squares.values());
	}

	public void save(Circle circle) {
		ensureId(circle);
		circles.put(circle.getId(), circle);

		notifyPresenters();
	}

	public void save(Square square) {
		ensureId(square);
		squares.put(square.getId(), square);

		notifyPresenters();
	}

	private void ensureId(Shape shape) {
		if (shape.getId().equals("")) {
			shape.setId(generateId());
		}
	}

	public void deleteAll() {
		circles.clear();
		squares.clear();

		notifyPresenters();
	}

	private void notifyPresenters() {
		setChanged();
		notifyObservers();
	}

	private String generateId() {
		return UUID.randomUUID().toString();
	}

}
