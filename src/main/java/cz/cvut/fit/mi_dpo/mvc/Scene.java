package cz.cvut.fit.mi_dpo.mvc;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import cz.cvut.fit.mi_dpo.mvc.model.table.CircleTableModel;
import cz.cvut.fit.mi_dpo.mvc.model.table.SquareTableModel;
import cz.cvut.fit.mi_dpo.mvc.view.CanvasShapeView;
import cz.cvut.fit.mi_dpo.mvc.view.ShapeView;
import cz.cvut.fit.mi_dpo.mvc.view.TableShapeView;

public class Scene extends JFrame {

	private static final long serialVersionUID = -1515143131211141973L;

	protected Scene() {
		super();
		init();
	}

	private void init() {
		setLayout(new BorderLayout());

		ShapeView canvasView = new CanvasShapeView();
		add(canvasView.getComponent(), BorderLayout.WEST);

		ShapeView tableView = new TableShapeView(new CircleTableModel(), new SquareTableModel());
		add(tableView.getComponent(), BorderLayout.EAST);
	}
}
