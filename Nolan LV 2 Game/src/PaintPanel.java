import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PaintPanel extends JPanel {
	
	private int gameState = 0;
	private Color menuColor = Color.BLUE;
	private Color gameColor = Color.BLACK;
	private Color endColor = Color.RED;
	
	public void paintComponent(Graphics g) {
		if (gameState == 0) {
			g.setColor(menuColor);
			g.fillRect( 0, 0, 1000, 1000);
		} else

		if (gameState == 1) {
			
		} else
		
		if (gameState == 2) {
			
		}
	}
	
	public int getGameState() {
		return gameState;
	}
	
	public void setGameState(int gameState) {
		this.gameState = gameState;
	}
}
