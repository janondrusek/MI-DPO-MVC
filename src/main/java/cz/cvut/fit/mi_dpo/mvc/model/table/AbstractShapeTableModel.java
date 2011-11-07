package cz.cvut.fit.mi_dpo.mvc.model.table;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import cz.cvut.fit.mi_dpo.mvc.model.ModelException;
import cz.cvut.fit.mi_dpo.mvc.model.Shape;

public abstract class AbstractShapeTableModel extends DefaultTableModel {

	private static final long serialVersionUID = -8411333191087351065L;

	abstract protected String[] getColumnNames();

	public AbstractShapeTableModel() {
		setDataVector(null, convertToVector(getColumnNames()));
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return columnIndex > 0;
	}

	@Override
	public void setValueAt(Object aValue, int row, int column) {
		fireTableCellUpdated(row, column);
	}

	protected void updateColumn(Shape shape, Object aValue, int column) {
		try {
			switch (column) {
			case 1:
				shape.getPosition().x = getInt(aValue);
				break;
			case 2:
				shape.getPosition().y = getInt(aValue);
				break;
			case 3:
				shape.setSize(getSize(getInt(aValue)));
				break;
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getClass().getName() + ": " + e.getMessage(), "Error",
					JOptionPane.ERROR_MESSAGE);
		}

	}

	private int getSize(int size) throws ModelException {
		if (size <= 0) {
			throw new ModelException("Must be a positive interger.");
		}
		return size;
	}

	private int getInt(Object aValue) {
		return Integer.parseInt(aValue.toString());
	}

	protected Object getValue(Shape shape, int columnIndex) {
		Object value = null;
		switch (columnIndex) {
		case 0:
			value = shape.getId();
			break;
		case 1:
			value = shape.getPosition().x;
			break;
		case 2:
			value = shape.getPosition().y;
			break;
		case 3:
			value = shape.getSize();
			break;
		}
		return value;
	}

}
