package co.grandcircus;

import java.util.Scanner;

//Prompt the user to enter a radius
//Validate that radius (return an error if radius is invalid)
//Calculate area and circumference of the circle using the radius data entered
//Ask if user wants to continue
//When the user quits, sysout"You entered X Circles. Goodbye"
//========================================================================
//BUILD SPECIFICATIONS
//**Create a "Circle" class, containing the following Constructors and methods
//**public Circle (double radius) --(This is a constructor)
//**public Double Double getCircumference
//**public Double getArea
//public static String formatNumber(double x)
//public String getFormattedCircumference
//public String getFormattedArea
//**for pi, use the pi constant of the java.lang.math class
//**Create a class named CircleApp that gets the user input, creates the Circle object, and displays circumference and area (inside that class right now!)

public class CircleApp {

	public static void main(String[] args) {

		String userCont = "yes"; //For 'while' loop
		Scanner scan = new Scanner(System.in);
		int circlesEntered = 0; //This is a counter

		Circle inputCircle = new Circle();

		do {
			System.out.println("Welcome to 'Fun With Circles.' Please enter a radius");

			while (!scan.hasNextDouble()){ //Only scans for whether input is a number. Other validation in Circle Class
				System.out.println("Invalid input\n Radius must be a number greater than 0. Please enter radius: ");
				scan.next();
			}
			double inputRadius = scan.nextDouble();

			inputCircle.setRadius(inputRadius);

			// System.out.println("Area of your circle is " + inputCircle.getArea());
			inputCircle.getArea();

			// System.out.println("Circumference of your circle is " +
			// inputCircle.getCircumference());
			inputCircle.getCircumference();

			System.out.println(inputCircle.toString());

			// run methods here
			circlesEntered++;

			System.out.println("Would you like to continue? yes/no");
			userCont = scan.next();

		} while (userCont.equalsIgnoreCase("yes"));

		System.out.println(
				"You have collected crucial data pertaining to " + circlesEntered + " circles. Goodbye forever!");
		scan.close();// best practice to close scanner

	}

}
