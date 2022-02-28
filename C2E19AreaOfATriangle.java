import java.util.Scanner; 

public class C2E19AreaOfATriangle {
	public static void main(String[] args) {
		System.out.println("This program calculates the area of a triangle when given three points (x1, y1), (x2, y2), and (x3, y3)."); 
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Please enter x1 and y1 separated by a space and no parentheses. Then press enter."); 
		double x1 = input.nextDouble(); 
		double y1 = input.nextDouble(); 
		
		System.out.println("Please enter x2 and y2 separated by a space and no parentheses. Then press enter."); 
		double x2 = input.nextDouble(); 
		double y2 = input.nextDouble(); 
		
		System.out.println("Please enter x3 and y3 separated by a space and no parentheses. Then press enter."); 
		double x3 = input.nextDouble(); 
		double y3 = input.nextDouble(); 
		
		double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		double side2 = Math.pow(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2), 0.5);
		double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
		
		double s = (side1 + side2 + side3)/2; 
		
		double triangleArea = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5); 
		
		System.out.println("The area of the triangle is " + triangleArea + "."); 
	}
}
