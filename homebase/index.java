import java.lang.Math;
import java.util.Scanner;

public class index {
		public static void main(String args[])
		{
			Scanner scan = new Scanner(System.in);
			//Lengths of triangle

			//This is the length (in miles) between the two receivers
			double aLength = 5;

			System.out.println("What is the angle detected by antenna A?");
			double bAngle = scan.nextDouble();

			System.out.println("\nWhat is the angle detected by antenna B?");
			double cAngle = scan.nextDouble();

			//these 3 lines all use basic trigonometry to calculate the
			//angle of the triangle created by the receivers and transmitter
			
			double aAngle = 180 - bAngle - cAngle;
			
			double bLength = aLength * Math.sin(Math.toRadians(bAngle))/Math.sin(Math.toRadians(aAngle));			
			
			double cLength = aLength * Math.sin(Math.toRadians(cAngle))/Math.sin(Math.toRadians(aAngle));

			//using Heron's Formula, we find the height (y)
			double s = (aLength + bLength + cLength)/2;

			double area = Math.sqrt(s * (s - aLength) * (s - bLength) * (s - cLength));

			double y = 2 * area/aLength;

			//using the height (y), we find it's  horizontal distance from C (0, 0)
			double x = cLength * Math.cos(Math.toRadians(bAngle));

			//report it's 
			System.out.println("\nCoordinates of home base: \nx: " + x + " y: " + y);
	    }
}
