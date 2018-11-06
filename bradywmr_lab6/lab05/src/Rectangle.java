/**
 * The Rectangle class represents a rectangle with a method to compute the area.
 */
public class Rectangle {
	
//	private instance variable, not accessible from outside this class
	protected double width;
	protected double length;
	
//	The default constructor with no argument.	
//	It sets the length and width to their default value.
	public Rectangle() {
		width = 1.0;
		length = 1.0;
	}
	
//	2nd constructor with given length, width
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

//	 A public method for retrieving the width 	
	public double getWidth() {
		return width;
	}
	
//	 A public method for retrieving the length
	public double getLength() {
		return length;
	}
	
//	 A public method for computing the area of Rectangle
	public double getArea() {
		return this.length * this.width;
	}
}
