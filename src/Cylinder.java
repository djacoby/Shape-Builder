//David Jacoby
//12 September 2018
//Cylinder class which is a subclass of Circle

public class Cylinder extends Circle {
	//Instance variables
	private int height;
	
	//Default constructor
	public Cylinder() {
		super();
		height = 15;
	}
	
	//Full argument constructor
	public Cylinder(int newHeight, int newRadius) {
		super(newRadius);
		height = newHeight;
	}
	
	//Get and Set methods
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int newHeight) {
		height = newHeight;
	}
	
	//Override calculate area class from circle
	public int calcArea() {
		int area = (int) (2 * 3.14 * getRadius() * getRadius() + 2 * getRadius() * height);
		return area;
	}
	//Volume method
	public int volume() {
		int volume = (int) (3.14 * getRadius() * getRadius() * height);
		return volume;
	}
	
	//Override to string class from circle
	public String toString() {
		return "height = " + height + super.toString();
	}
	
	//Draw figure method
		public DrawFigure drawFigure() {
			DrawFigure figure = new DrawFigure(4, height, getRadius());
			return figure;
		}
}
