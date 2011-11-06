package cz.cvut.fit.mi_dpo.mvc.service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;

import cz.cvut.fit.mi_dpo.mvc.model.Shape;

public enum ShapeStorageService {
	INSTANCE;

	private Map<String, Shape> shapes = new HashMap<String, Shape>();

	public Map<String, Shape> getShapes() {
		return shapes;
	}

	public void save(Shape shape) {
		if (shape.getId().equals(StringUtils.EMPTY)) {
			shape.setId(generateId());
		}
		store(shape);
	}

	private void store(Shape shape) {
		shapes.put(shape.getId(), shape);
	}

	public void deleteAll() {
		shapes.clear();
	}

	private String generateId() {
		return UUID.randomUUID().toString();
	}

}
