import javax.swing.JFrame;

import javax.swing.Timer;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * the frame contains a frogger game.
 */
public class FroggerFrame extends JFrame{
	
	private FroggerComponent component;
	
	/**
	 * construct the frame		
	 */
	public FroggerFrame() {
		
		component = new FroggerComponent();
		add(component);
		
		//Timer for game functions
		int timerCounter =50;
		new Timer(timerCounter, e -> {
			component.Move();
		}).start();
		
		//Key listener
		component.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				component.moveFrogLocation(e);
			}
			
			public void keyReleased(KeyEvent e ) {}
			
			public void keyTyped(KeyEvent e) {}
		});
	
		component.setFocusable(true);
		component.requestFocus();
	}	
}

