package cz.cvut.fit.mi_dpo.mvc.model.table;

import javax.swing.table.AbstractTableModel;

import cz.cvut.fit.mi_dpo.mvc.model.Shape;

public abstract class AbstractShapeTableModel extends AbstractTableModel {

	private static final long serialVersionUID = -8411333191087351065L;

	abstract protected String[] getColumnNames();

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return columnIndex > 0;
	}

	@Override
	public String getColumnName(int column) {
		return getColumnNames()[column];
	}

	@Override
	public int getColumnCount() {
		return getColumnNames().length;
	}

	protected Object getValue(Shape shape, int columnIndex) {
		Object value = null;
		switch (columnIndex) {
		case 0:
			value = shape.getId();
			break;
		case 1:
			value = shape.getPosition().getX();
		case 2:
			value = shape.getPosition().getY();
		case 3:
			value = shape.getSize();
		default:
			break;
		}
		return value;
	}

}
