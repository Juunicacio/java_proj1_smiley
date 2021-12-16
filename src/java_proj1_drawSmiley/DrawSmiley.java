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
		MyPanelPaint myPainting = new MyPanelPaint();
		MyFrameWin win = new MyFrameWin(myPainting, myWinTitle, WIDTH, HEIGHT);
	}

}
