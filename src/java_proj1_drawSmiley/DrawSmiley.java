package java_proj1_drawSmiley;
/*
 * The package java.awt is not accessible and The type 
javax.swing.JFrame is not accessible. 
 You need to add requires java.desktop; to your 
module-info.java file.
 */
public class DrawSmiley {
	public static void main(String[] args) {
		String myWinTitle = "Test Title";
		int WIDTH = 400;
		int HEIGHT = 400;
		// use the code below to use the default values of the class
		//MyPanelPaint myPainting = new MyPanelPaint();
		MyPanelPaint myPainting = new MyPanelPaint(100,100,4);
		MyFrameWin win = new MyFrameWin(myPainting, myWinTitle, WIDTH, HEIGHT);
	}

}
