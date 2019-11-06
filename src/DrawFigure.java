//David Jacoby
//03 October 2018
//Class that draws shapes based on their 
//parameters onto a JPanel

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawFigure extends JPanel {
	
	int type;
	int length, width, height, radius;
	
	public DrawFigure() {
		super();
		type = 5;
	}
	
	public DrawFigure(int myType, int myWidth, int myLength, int myHeight) {
		super();
		type = myType;
		width = myWidth;
		height = myHeight;
		length = myLength;
	}
	
	public DrawFigure(int x, int y, int myType, int myWidth, int myLength, int myHeight) {
		super();
		type = myType;
		length = myLength;
		width = myWidth;
		height = myHeight;
	}
	
	public DrawFigure(int myType, int myRadius, int myHeight) {
		super();
		type = myType;
		height = myHeight;
		radius = myRadius;
	}
	
	public DrawFigure(int x, int y, int myType, int myRadius, int myHeight) {
		super();
		type = myType;
		radius = myRadius;
		height = myHeight;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		if (type == 1) { //draw rectangle
			g.drawRect(50, 110, width, length);
		}
		
		else if (type == 2) { //draw box
			g.drawRect(50, 110, width, height);
			g.drawLine(50, 110, width / 2 + 50, 110 - length);
			g.drawLine(50 + width, 110, (width / 2 + 50) * 2, 110 - length);
			g.drawLine(width / 2 + 50, 110 - length,(width / 2 + 50) * 2, 110 - length);
			g.drawLine((width / 2 + 50) * 2, 110 - length, (width / 2 + 50) * 2, 110 - length + height);
			g.drawLine((width / 2 + 50) * 2, 110 - length + height, 50 + width, 110 + height);
			
		}
		
		else if (type == 3) { //draw circle
			g.drawOval(50, 110, radius * 2 , radius * 2);
		}
		
		else if (type == 4) { //draw cylinder
			//draw two ovals and two lines
			g.drawOval(50, 110, radius * 2 , radius);
			g.drawLine(50, 110 + radius / 2, 50, height + 110 + radius / 2);
			g.drawLine(radius * 2 + 50, 110 + radius / 2, radius * 2 + 50, height + 110 + radius / 2);
			g.drawOval(50, 110 + height, radius * 2, radius);
		}
	}
}
