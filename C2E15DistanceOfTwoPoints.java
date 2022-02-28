import java.util.Scanner; 

public class C2E15DistanceOfTwoPoints {
	public static void main(String[] args) {
		System.out.println("This program calculates the distance between two points, (x1, y1) and (x2, y2).");
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Please enter x1 and y1, with a space separating them and no parentheses. Then press enter."); 
		double x1 = input.nextDouble(); 
		double y1 = input.nextDouble(); 
		
		System.out.println("Please enter x2 and y2, with a space separating them and no parentheses. Then press enter."); 
		double x2 = input.nextDouble(); 
		double y2 = input.nextDouble(); 
		
		double distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is "+ distance + "."); 
		
	}

}
