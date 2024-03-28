package studio7;
import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	
	//instance variables
	private double length;
	private double width;
	
	//constructor
	public Rectangle (double length, double width ) {
		
		this.length = length;
		this.width = width;
		
	}
	
	public double area () {
		return length * width;
	}
	
	public double perimeter () {
		
		return (2 * length) + (2 * width);
	}
	
	public boolean square () {
		
		if (length == width) {
			
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(2.0, 3.0);
		r1.area();
		System.out.println(r1.area());
		System.out.println(r1.square());

	}

}
