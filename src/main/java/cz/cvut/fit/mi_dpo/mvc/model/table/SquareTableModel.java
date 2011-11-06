package cz.cvut.fit.mi_dpo.mvc.model.table;

import cz.cvut.fit.mi_dpo.mvc.service.ShapeStorageService;

public class SquareTableModel extends AbstractShapeTableModel {

	private static final long serialVersionUID = 5479831356906203866L;

	@Override
	protected String[] getColumnNames() {
		return new String[] { "ID", "X", "Y", "a" };
	}

	@Override
	public int getRowCount() {
		return ShapeStorageService.getInstance().getSquares().size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return getValue(ShapeStorageService.getInstance().getSquares().get(rowIndex), columnIndex);
	}
}
