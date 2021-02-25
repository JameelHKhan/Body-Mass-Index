/* 
 * Jameel H. Khan 
 * Module 2 Assignment
 * EN.605.201.83.SP21 
 */ 

// import required package
import java.util.Scanner;

public class Original
{
	public static void main( String [] args)
	{
	// Define and initialize variables for values to be input
    int v1 = 0;      // First value to be input
    int v2 = 0;      // Second value to be input
    int v3 = 0;      // Third value to be input
    int v4 = 0;      // Fourth value to be input
    int v5 = 0;      // Fifth value to be input
    int v6 = 0;      // Sixth value to be input
    
    // Use a Scanner to input integer values
    Scanner input = new Scanner( System.in );
    System.out.println( "\n\n" );
    System.out.print( "Enter 6 integers separated by a blank space:" );
    v1 = input.nextInt();     // Input first value
    v2 = input.nextInt();     // Input second value
    v3 = input.nextInt();     // Input third value
    v4 = input.nextInt();     // Input fourth value
    v5 = input.nextInt();     // Input fifth value
    v6 = input.nextInt();     // Input sixth value
    
    // Calculations for total column and total row
    int t1 = v1 + v2;         // column 3, row 2 output
    int t2 = v3 + v4;         // column 3, row 3 output
    int t3 = v5 + v6;         // column 3, row 3 output
    int t4 = v1 + v3 + v5;    // column 1, row 5 output
    int t5 = v2 + v4 + v6;    // column 2, row 5 output
    int t6 = t4 + t5;         // column 3, row 5 output, grand total
    
    // Output using System.out.println()
    System.out.println( "\n\n" );
    System.out.println( "\t" + "Value" + "\t" + "Value" + "\t" + "Total" );
    System.out.println( "\t" + v1 + "\t" + v2 + "\t" + t1 );
    System.out.println( "\t" + v3 + "\t" + v4 + "\t" + t2 );
    System.out.println( "\t" + v5 + "\t" + v6 + "\t" + t3 );
    System.out.println( "\t" + "----" + "\t" + "----" + "\t" + "----" );
    System.out.println( "Total" + "\t" + t4 + "\t" + t5 + "\t" + t6 );
    System.out.println( "\n\n" );
	} // end of main method
} // end of class Original
