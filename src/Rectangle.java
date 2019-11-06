//David Jacoby
//5 September 2018
//Rectangle class that is a subclass of the Point class

public class Rectangle extends Point{
	//Instance variables
	private int width;
	private int length;
	
	//Default constructor
	public Rectangle() {
		super();
		width = 15;
		length =15;
	}
	
	//Full argument constructor
	public Rectangle(int newWidth, int newLength) {
		super();
		width = newWidth;
		length = newLength;
	}
	
	public Rectangle(int newX, Integer newY, int newWidth, int newLength) {
		super(newX, newY);
		width = newWidth;
		length = newLength;
	}
	
	
	//Set methods
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	
	public void setHeight(int newLength) {
		length = newLength;
	}
	

	//Get methods
	public int getWidth() {
		return width;
	}
	
	public int getLength() {
		return length;
	}
	
	//Calculate area method
	public int calcArea() {
		int area = width * length;
		return area;
	}
	
	//To string methods
	public String toString() {
		return " width = " + width + " length = " + length + " at location " + super.toString();
	}
	
	//Draw figure method
	public DrawFigure drawFigure() {
		DrawFigure demo = new DrawFigure(1, width, length, 0);
		return demo;
	}
	
}
