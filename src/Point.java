//David Jacoby
//29 August 2018
//Abstract data type for Point class

public abstract class Point {
	//instance variables
	private int xCoordinate;
	private int yCoordinate;
	
	public abstract DrawFigure drawFigure();
	
	//default constructor
	public Point() {
		xCoordinate = 0;
		yCoordinate = 0;
	}
	
	//full arg constructor
	public Point(int newX, int newY) {
		xCoordinate = newX;
		yCoordinate = newY;
	}
	
	//Mutator or "set" methods
	public void setX(int newX) {
		xCoordinate = newX;
	}
	
	public void setY(int newY) {
		yCoordinate = newY;
	}
	
	//Accessor or "get" methods
	public int getX() {
		return xCoordinate;
	}
	
	public int getY() {
		return yCoordinate;
	}
	
	//To String Method
	public String toString() {
		return "x = " + xCoordinate  + "   y = " + yCoordinate + "\n";
	}
	
	//Abstract calc area method
	public abstract int calcArea();
}
