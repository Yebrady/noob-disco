package bradywmr_hw2;

import java.util.Random;

import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
/**
 * 
 * @author bradyreeder
 *
 */

public class TetrisComponent extends JComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1076071439952818333L;
	/**
	 * Creates a random x and y for which the tetromino to appear at.
	 */
	Random randomX = new Random();
	Random randomY = new Random();
	int startX = randomX.nextInt(460);
	int startY = randomY.nextInt(750);
	
	/**
	 * Creates the objects for each shape I,J,O,L,T,S, and Z.
	 */
	int[] xi = {startX,startX+40,startX+40,startX};
	int[] yi = {startY,startY,startY+10,startY+10};
	Polygon shapeI = new Polygon(xi,yi,4);
	
	int[] xj = {startX,startX+30,startX+30,startX+20,startX+20,startX};
	int[] yj = {startY,startY,startY+20,startY+20,startY+10,startY+10};
	Polygon shapeJ = new Polygon(xj,yj,6);
	
	int[] xo = {startX,startX+20,startX+20,startX};
	int[] yo = {startY,startY,startY+20,startY+20};
	Polygon shapeO = new Polygon(xo,yo,4);
	
	int[] xl = {startX,startX+30,startX+30,startX+10,startX+10,startX};
	int[] yl = {startY,startY,startY+10,startY+10,startY+20,startY+20};
	Polygon shapeL = new Polygon(xl,yl,6);
	
	int[] xt = {startX,startX+30,startX+30,startX+20,startX+20,startX+10,startX+10,startX};
	int[] yt = {startY,startY,startY+10,startY+10,startY+20,startY+20,startY+10,startY+10};
	Polygon shapeT = new Polygon(xt,yt,8);
	
	int[] xs = {startX,startX+10,startX+10,startX+30,startX+30,startX+20,startX+20,startX};
	int[] ys = {startY+10,startY+10,startY,startY,startY+10,startY+10,startY+20,startY+20};
	Polygon shapeS = new Polygon(xs,ys,8);
	
	int[] xz = {startX,startX+20,startX+20,startX+30,startX+30,startX+10,startX+10,startX};
	int[] yz = {startY,startY,startY+10,startY+10,startY+20,startY+20,startY+10,startY+10};
	Polygon shapeZ = new Polygon(xz,yz,8);
	/**
	 * Puts the tetromino objects into a list for use in randomizing.
	 */
	Polygon tetrominolist[] = {shapeI,shapeJ,shapeO,shapeL,shapeT,shapeS,shapeZ};
	
	/**
	 * Sets the random tetromino.
	 * 
	 * @param tetromino (current tetromino or empty polygon)
	 * @return tetromino (new randomized)
	 */
	public Polygon setTetromino(Polygon poly) {
		Random randomInt = new Random();
		Polygon tetromino = new Polygon();
		tetromino = tetrominolist[randomInt.nextInt(7)];
		return tetromino;
	}
	
	
	/**
	 * Colors the tetromino depending on which shape, and fills it.
	 */
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		/**
		 * Initializes the polygon to be colored, and sets it to the correct current tetromino.
		 */
		Polygon tetromino = new Polygon();
		tetromino = setTetromino(tetromino);
		
		if (tetromino == shapeI)
			g2.setColor(Color.CYAN);
		else if (tetromino == shapeJ)
			g2.setColor(Color.BLUE);
		else if (tetromino == shapeO)
			g2.setColor(Color.YELLOW);
		else if (tetromino == shapeL)
			g2.setColor(Color.ORANGE);
		else if (tetromino == shapeT)
			g2.setColor(Color.MAGENTA);
		else if (tetromino == shapeS)
			g2.setColor(Color.GREEN);
		else if (tetromino == shapeZ)
			g2.setColor(Color.RED);
		else 
			g2.setColor(Color.BLACK);
		
		g2.fill(tetromino);
		
		g2.setColor(Color.BLACK);
		g2.draw(tetromino);
	}
}
