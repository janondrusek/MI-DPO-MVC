package cz.cvut.fit.mi_dpo.mvc.view;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableModel;

import cz.cvut.fit.mi_dpo.mvc.presenter.TableShapePresenter;

public class TableShapeView extends AbstractShapeView<TableShapePresenter> {

	private List<JTable> tables;

	private JPanel panel;

	public TableShapeView(TableModel[] tableModels) {
		initPanel();
		initTables(tableModels);
		setPresenter(new TableShapePresenter(this));
	}

	private void initPanel() {
		panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel.setMinimumSize(new Dimension(300, 400));
		panel.setPreferredSize(new Dimension(300, 400));
	}

	private void initTables(TableModel[] tableModels) {
		tables = new ArrayList<JTable>();
		for (TableModel tableModel : tableModels) {
			JTable table = new JTable(tableModel);

			table.setMinimumSize(new Dimension(300, 400 / tableModels.length));
			table.setPreferredSize(new Dimension(300, 400 / tableModels.length));
			panel.add(table);
			tables.add(table);
		}
	}

	public List<JTable> getTables() {
		return tables;
	}

	@Override
	public void repaint() {
		for (JTable table : tables) {
			table.repaint();
		}
	}

	@Override
	public Component getComponent() {
		return panel;
	}

}
