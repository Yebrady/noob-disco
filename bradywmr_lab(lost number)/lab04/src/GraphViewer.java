package src;

import javax.swing.JFrame;

/*
 * A tester for showing the graph on a frame
 */
public class GraphViewer {
	
	public static void main(String[] args) {
		
		int length = 800, width = 800;
		String title = "Simon";
		
		JFrame frame = new JFrame();
		frame.setSize(length, width);
		frame.setTitle(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GraphComponent component = new GraphComponent();
		
		frame.add(component);
		frame.setVisible(true);
		
	}
	

}
