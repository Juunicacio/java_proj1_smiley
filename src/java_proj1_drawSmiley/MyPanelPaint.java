package java_proj1_drawSmiley;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class MyPanelPaint extends JPanel{
	private static final long serialVersionUID = 1L;
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		// draw circle
		// stroke draw of the circle
		g2.setStroke(new BasicStroke(2));
		g.setColor(Color.black);
		g.drawOval(100, 100, 50, 50);
		g.setColor(Color.yellow);
		g.fillOval(100, 100, 50, 50);
		System.out.println("just got executed!");
		
		// draw the mouth
		g2.setStroke(new BasicStroke(1));
		g.setColor(Color.black);
		g.drawOval(110, 110, 30, 30);
		
		g2.setStroke(new BasicStroke(2));
		g.setColor(Color.yellow);
		//g.drawRect(107, 110, 36, 20);
		g.fillRect(107, 110, 36, 20);
		
		
		// draw the eyes
		g.setColor(Color.black);
		g.fillOval(115,115,5,5);		
		g.setColor(Color.black);
		g.fillOval(130,115,5,5);
	}
}
