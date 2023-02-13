
import java.util.Scanner;

public class Main {

    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);  // keyboard input

        String output = "";           // output string

        double degrees = 0;          // angle in degrees
        double radians = 0;          // angle in radians

        double num1 = 0;
        double num2 = 0;

        
        // Demonstrate use of tan
        

        // get user input
        System.out.println("Enter an angle in degrees (between 0 and 90): ");
        degrees = in.nextDouble();

        // converts degrees to radians
        // NOTE: trig functions require input in radians
        radians = Math.toRadians(degrees);
 
        // calculate the tan of the angle and add to output
        output = "tan(" + degrees + ") = " + Math.tan(radians) + "\n";

        // print output 
        System.out.println(output);


        // Demonstrate use of max
        // ----------------------

        // get user input
        System.out.println("Enter a number: ");
        num1 = in.nextDouble();
        System.out.println("Enter another number: ");
        num2 = in.nextDouble();

        // send max of the two numbers to output
        output = "Max of " + num1 + " and " + num2 + " = " + Math.max(num1, num2) + "\n";

        // print output to screen
        System.out.println(output);


        // Demonstrate use of sqrt
        // -----------------------

        // get user input
        System.out.println("Enter a number: ");
        num1 = in.nextDouble();

        // send square root of the number to output
        output = "Square root of " + num1 + " = " + Math.sqrt(num1);

        // print output to screen
        System.out.println(output);
       

        // Self Discovery:  Add code to demonstrate the use of sin, cos, min and round.
        System.out.println("Please enter a number: ");
        degrees = in.nextDouble();
        
        radians = Math.toRadians(degrees);
        
        output = "sin(" + degrees + ") = " + Math.sin(radians) + "\n";
        System.out.println(output);
        in.next();
        
        // This is cos
        System.out.println("Please enter a number: ");
        degrees = in.nextDouble();
        
        radians = Math.toRadians(degrees);
        System.out.println(radians);
        
        output = "cos(" + degrees + ") = " + Math.cos(radians) + "\n";
        System.out.print(output);
        
        
        // Don't forget to look up these functions at the Java API first!!!!

        System.exit(0);
    } // main
    
} // MathClassSampler