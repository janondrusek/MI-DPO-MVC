package cz.cvut.fit.mi_dpo.mvc.model.table;

import cz.cvut.fit.mi_dpo.mvc.model.Square;
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
	public void setValueAt(Object aValue, int row, int column) {
		update(ShapeStorageService.getInstance().getSquares().get(row), aValue, column);
		super.setValueAt(aValue, row, column);
	}

	private void update(Square square, Object aValue, int column) {
		updateColumn(square, aValue, column);
		ShapeStorageService.getInstance().save(square);
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return getValue(ShapeStorageService.getInstance().getSquares().get(rowIndex), columnIndex);
	}
}
