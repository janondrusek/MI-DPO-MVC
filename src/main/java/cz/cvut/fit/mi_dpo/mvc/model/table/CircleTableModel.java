package cz.cvut.fit.mi_dpo.mvc.model.table;

import cz.cvut.fit.mi_dpo.mvc.model.Circle;
import cz.cvut.fit.mi_dpo.mvc.service.ShapeStorageService;

public class CircleTableModel extends AbstractShapeTableModel {

	private static final long serialVersionUID = 3849409360925265002L;

	@Override
	protected String[] getColumnNames() {
		return new String[] { "ID", "X", "Y", "r" };
	}

	@Override
	public int getRowCount() {
		return ShapeStorageService.getInstance().getCircles().size();
	}

	@Override
	public void setValueAt(Object aValue, int row, int column) {
		update(ShapeStorageService.getInstance().getCircles().get(row), aValue, column);
		super.setValueAt(aValue, row, column);
	}

	private void update(Circle circle, Object aValue, int column) {
		updateColumn(circle, aValue, column);
		ShapeStorageService.getInstance().save(circle);
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return getValue(ShapeStorageService.getInstance().getCircles().get(rowIndex), columnIndex);
	}

}
