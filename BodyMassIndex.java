/* 
 * Jameel H. Khan 
 * Module 2 Assignment
 * EN.605.201.83.SP21 
 */ 

// import required package
import java.util.Scanner;

public class BodyMassIndex
{
	public static void main( String [] args )
	{
		// Define and initialize variables for values to be input and for MBI calculation
		double weightPounds = 0;    // First value to be input
		double heightInches = 0;    // Second value to be input
		double weightKilo = 0;      // Variable for converted weight from pounds to kilograms
		double heightMeter = 0;     // Variable for converted height from inches to meters
		double bodyMassIndex = 0;   // Variable for BMI calculation
		
		// Use Scanner to input integer values
		Scanner input = new Scanner ( System.in );
		System.out.println( "\n" );
		System.out.print( "Enter your weight in pounds and height in inches separated by a blank space: " );
		weightPounds = input.nextDouble();     // Input first value
		heightInches = input.nextDouble();     // Input second value
		
		// Convert units from American to Metric and conduct BMI calculation
		weightKilo = weightPounds * 0.45359237;
		heightMeter = heightInches * 0.0254;
		bodyMassIndex = weightKilo / Math.pow(heightMeter, 2);
		
		// Output using System.out.println()
		System.out.print( "\n" );
		System.out.println( "Your BMI is: " + bodyMassIndex );
		System.out.print( "\n" );
		System.out.println( "Compare your BMI to the following BMI categories from the Department of Health \n& Human Services/National Institutes of Health: " );
		System.out.print( "\n" );
		System.out.println( "Underweight: less than 18.5" );
		System.out.println( "Normal: 18.5 - 24.9" );
		System.out.println( "Overweight: 25 - 29.9" );
		System.out.println( "Obese: 30 or greater" );
	} // end of main method
} // end of class BodyMassIndex
