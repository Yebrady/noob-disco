package bradywmr_hw2;

import javax.swing.JFrame;

public class TetrisViewer {
	public static void main(String[] args) {
		/**
		 * Creates game window
		 */
		JFrame tetris = new JFrame("Tetris");
		
		int WIDTH = 500;
		int HEIGHT = 1000;
		tetris.setSize(WIDTH, HEIGHT);
		tetris.setVisible(true);
		tetris.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//tetris.setResizable(false);
		/**
		 * Adds tetris component from the TetrisComponent class to the game window.
		 */
		TetrisComponent tetromino = new TetrisComponent();
		tetris.add(tetromino);
	}
	/**
	 * Randomizes a starting orientation for the tetromino.
	 * 
	 * @param startX
	 * @param startY
	 */

	
}
