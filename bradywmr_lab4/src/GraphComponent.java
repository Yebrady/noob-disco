import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.*;
import java.awt.Color;

/*
 * a component for drawing a graph
 */
public class GraphComponent extends JComponent{
	

	public void paintComponent(Graphics g){

		Graphics2D g2 = (Graphics2D) g;
		
		Point2D p1 = new Point2D.Double(210,0);
		Point2D p2 = new Point2D.Double(10,100);
		Point2D p3 = new Point2D.Double(410,100);
		
		Line2D l1 = new Line2D.Double(p1,p2);
		Line2D l2 = new Line2D.Double(p1,p3);
		
		Rectangle2D.Double r1 = new Rectangle2D.Double(10,100,400,250);
		
		Ellipse2D e1 = new Ellipse2D.Double(45,125,125,45);
		Ellipse2D e2 = new Ellipse2D.Double(245,125,125,45);
		Ellipse2D e3 = new Ellipse2D.Double(85,125,45,45);
		Ellipse2D e4 = new Ellipse2D.Double(285,125,45,45);
		
		Arc2D a1 = new Arc2D.Double(162.5,200,100,100,135,90,Arc2D.PIE);
		Arc2D a2 = new Arc2D.Double(162.5,200,100,100,225,90,Arc2D.PIE);
		Arc2D a3 = new Arc2D.Double(162.5,200,100,100,315,90,Arc2D.PIE);
		Arc2D a4 = new Arc2D.Double(162.5,200,100,100,45,90,Arc2D.PIE);

		g2.draw(l1);
		g2.draw(l2);
		g2.draw(r1);
		g2.draw(e1);
		g2.draw(e2);

		g2.setColor(Color.CYAN);
		g2.fill(e3);
		g2.fill(e4);	
		
		g2.setColor(Color.GREEN);
		g2.fill(a1);
		g2.setColor(Color.BLUE);
		g2.fill(a2);
		g2.setColor(Color.RED);
		g2.fill(a3);
		g2.setColor(Color.YELLOW);
		g2.fill(a4);
		
		g2.setColor(Color.BLACK);
		g2.draw(a1);
		g2.draw(a2);
		g2.draw(a3);
		g2.draw(a4);

	}
	
	

	private static final long serialVersionUID = 1L;

}
