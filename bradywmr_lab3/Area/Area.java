/**
 * This is class contains methods to compute area of different shapes. 
 * @author 
 */
public class Area {

	
	/**
	 * This method computes the area of a circle
	 * @param r
	 * @return the value of the area of circle
	 */
	public  double circleArea (double r){
		
		return Math.PI * r * r;
	}
	
	/**
	 * This method computes the area of a triangle
	 * @param b, h
	 * @return the value of the area of triangle
	 */
	public double triangleArea (double b, double h){
		
		return b * h / 2;
	}
	
	
	/**
	 * This method computes the area of a square
	 * @param l
	 * @return the value of the area of square
	 */
	public double squareArea (double l){
		
		return l * l;
	}
	
	/**
	 * This method computes the area of a rectangle
	 * @param l, w
	 * @return the value of the area of rectangle
	 */
	public double rectangleArea (double rl, double w){
		
		return rl * w;
	}
	
	
}
