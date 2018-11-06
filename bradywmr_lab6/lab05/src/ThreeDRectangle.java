
/**
 * The ThreeDRectangle class represents a 3d rectangle with a method to compute the surface area.
 */
public class ThreeDRectangle extends Rectangle {	
	
	protected double width;
	protected double length;
	protected double height;
	
//	Default constuctor. Sets l, w , h to 1.0.
	public ThreeDRectangle() {
		width = 1.0;
		length = 1.0;
		height = 1.0;
	}
	
//	2nd constructor. Defines parameters width, length, and height.
	public ThreeDRectangle(double width, double length, double height) {
		super.width = width;
		super.length = length;
		this.height = height;
	}

//	Method for retrieving height.
	public double getHeight() {
		return height;
	}
	
//	A public method for computing the Surface of 3D Rectangle
//	use superclass method getArea() to get the area
	public double getSurfaceArea() {
		return 2 * (getArea() + getLength() * height + getWidth() * height);
	}
}
