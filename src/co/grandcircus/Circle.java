package co.grandcircus;
//public Circle (double radius)
	//public Double Double getCircumference
	//public Double getArea
	//public static String formatNumber(double x)
	//public String getFormattedCircumference
	//public String getFormattedArea
//for pi, use the pi constant of the java.lang.math class
//Calculate area and circumference of the circle using the radius data entered

public class Circle {
//WELCOME TO CLASS
	
	//private double diameter = 0;
	private double radius = 0;
	private double circumference = 0;
	private double area = 0;
	
	/*
	 * public Circle (Double radius) { diameter = radius*2;
	 * 
	 * }
	 */
	public Circle () { //Constructor
		radius = 0.0;
	}
	public void setRadius(Double rad) {
		//validate radius here. Must be a number. Must be above 0.
		if (rad <= 0) {			
			System.out.println("The radius you have entered is invalid! It must be a number above 0");
	} else {		
		radius = rad; //Could have used 'this' to reuse 'radius' variable
	}
		
		
	}
	
	public Double getCircumference () {
		
		circumference = 2*radius*Math.PI;
		return circumference;
		}
	public Double getArea() { //pi*r^2
		area = Math.PI*radius*radius; //Could have calculated exponent differently
		return area;
	}

	/*
	 * public static String formatNumber(double x) { return null; } public String
	 * getFormattedCircumference () { return null; } public String
	 * getFormattedArea() { return null; }
	 */
	public String toString() {
		//return "Name: " + name + "Length: " + length + " Width: " + width + " Height: " + height;
		return String.format("Radius: %.2f Diameter: %.2f Area: %.2f Circumference: %.2f", radius, radius*2, area, circumference);
	}
}