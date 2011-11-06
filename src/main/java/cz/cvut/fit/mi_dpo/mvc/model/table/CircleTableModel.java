package cz.cvut.fit.mi_dpo.mvc.model.table;

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
	public Object getValueAt(int rowIndex, int columnIndex) {
		return getValue(ShapeStorageService.getInstance().getCircles().get(rowIndex), columnIndex);
	}

}
