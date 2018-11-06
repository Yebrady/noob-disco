package src;

import java.awt.Graphics;

import javax.swing.JComponent;

/*
 * a component for drawing a graph
 */
public class GraphComponent extends JComponent{
	

	public void paintComponent(Graphics g){
		
		Point2D p1 = new Point2D(100,0);
		Point2D p2 = new Point2D(0,50);
		Point2D p3 = new Point2D(150,50);
		
		draw(p3);
		
	}
	
	

	private static final long serialVersionUID = 1L;

}
