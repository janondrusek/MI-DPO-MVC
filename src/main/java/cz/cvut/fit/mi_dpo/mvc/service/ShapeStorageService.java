package cz.cvut.fit.mi_dpo.mvc.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;

import cz.cvut.fit.mi_dpo.mvc.model.Circle;
import cz.cvut.fit.mi_dpo.mvc.model.Shape;
import cz.cvut.fit.mi_dpo.mvc.model.Square;

public enum ShapeStorageService {
	INSTANCE;

	private Set<String> circles = new TreeSet<String>();

	private Set<String> squares = new TreeSet<String>();

	private Map<String, Shape> shapes = new HashMap<String, Shape>();

	public Map<String, Shape> getShapes() {
		return shapes;
	}

	public void save(Circle circle) {
		store(store(circle), circles);
	}

	public void save(Square square) {
		store(store(square), squares);
	}

	private void store(String id, Set<String> shapes) {
		shapes.add(id);
	}

	private String store(Shape shape) {
		if (shape.getId().equals(StringUtils.EMPTY)) {
			shape.setId(generateId());
		}
		shapes.put(shape.getId(), shape);
		return shape.getId();
	}

	public void deleteAll() {
		circles.clear();
		shapes.clear();
		squares.clear();
	}

	private String generateId() {
		return UUID.randomUUID().toString();
	}

}
