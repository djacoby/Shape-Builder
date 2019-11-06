//David Jacoby 
//12 September 2018
//Circle class that is a sublcass of Point class

public class Circle extends Point {
	//instance variables
	private int radius;
	
	//Default constructor
	public Circle() {
		super();
		radius = 15;
	}
	//Full argument constructor
	public Circle(int newRadius) {
		super();
		radius = newRadius;
	}
	
	//Get and Set Methods
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int newRadius) {
		radius = newRadius;
	}
	
	//Calc area method
	public int calcArea() {
		int area = (int) (3.15 * radius * radius);
		return area;
	}
	//Override to string from Point
	public String toString() {
		return " radius = " + radius + " at location " + super.toString();
	}
	
	//Draw figure method
	public DrawFigure drawFigure() {
		DrawFigure figure = new DrawFigure(3, radius, 0);
		return figure;
	}
	

}
