import java.util.Scanner; 

public class C4E2GreatCircleDistance {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in); 
		
		System.out.println("This program calculates the distance between two points on a sphere.");
		System.out.println("Let (x1, y1), and (x2, y2) be the geographical latitude and longitude of the two points.");
		
		System.out.println("Please enter x1 and y1, separated by a space with no parentheses. Then press enter: ");
		double x1 = input.nextDouble(); 
		double y1 = input.nextDouble(); 
		
		System.out.println("Please enter x2 and y2, separated by a space with no parentheses. Then press enter: ");
		double x2 = input.nextDouble(); 
		double y2 = input.nextDouble(); 
		
		// Convert to radians 
		x1 = Math.toRadians(x1); 
		y1 = Math.toRadians(y1); 
		x2 = Math.toRadians(x2); 
		y2 = Math.toRadians(y2); 
		
		double radius = 6371.01; 
		
		double d = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)); 
		
		System.out.println("The distance between the two points is " + d + " km.");
		
	}

}
