package java_proj1_drawSmiley;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class MyFrameWin extends JFrame{
	private static final long serialVersionUID = 1L;
	public MyFrameWin(MyPanelPaint myPainting, String title, int WIDTH, int HEIGHT) {
		super();
		JFrame gui = new JFrame();
		gui.setTitle(title);
		gui.setSize(WIDTH, HEIGHT);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container myPane = gui.getContentPane();
		myPane.setLayout(new GridLayout(1,1));
		
		myPane.add(myPainting);
		gui.setVisible(true);
	}
}
