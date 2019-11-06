//David Jacoby
//5 September 2018
//Box class that subclass of the Rectangle class

public class Box extends Rectangle {
	//Instance variables
	private int height;
	
	//Default constructor
	public Box() {
		super();
		height = 15;
	}
	//Full argument constructor
	public Box(int newHeight) {
		super();
		height = newHeight;
	}
	
	public Box(int newX, int newY, int newWidth, int newLength, int newHeight) {
		super(newX, newY, newWidth, newLength);
		height = newHeight;
	}
	
	//Get & set methods
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int newHeight) {
		height = newHeight;
	}
	
	//Override calculation method from Rectangle class
	public int calcArea() {
		int area = getLength() * getWidth()* 2 + getWidth() * height * 2 + getLength() * height * 2;
		return area;
	}
	
	//Calculate volume method
	public int calcVolume() {
		int volume = getLength() * getWidth() * height;
		return volume;
	}
	
	//Override toString from Rectangle class
	public String toString() {
		return "height = " + height + super.toString();
	}
	
	//Draw figure method
	public DrawFigure drawFigure() {
		DrawFigure figure = new DrawFigure(2, getWidth(), getLength(), height);
		return figure;
	}
		
}
