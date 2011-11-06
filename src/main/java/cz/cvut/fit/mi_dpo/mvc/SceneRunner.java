package cz.cvut.fit.mi_dpo.mvc;

import javax.swing.JFrame;

public class SceneRunner {

	public static void main(String[] args) {
		Scene scene = new Scene();

		scene.setSize(600, 400);
		scene.setResizable(true);
		scene.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		scene.setVisible(true);
		scene.setLocationRelativeTo(null);
	}
}
