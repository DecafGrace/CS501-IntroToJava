import java.util.Scanner; 

public class C3E31CurrencyExchange {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in); 
		
		System.out.println("This program converts U.S. dollars to Chinese RMB.");
		
		System.out.println("Enter the exchange rate from dollars to RMB: ");
		double rate = input.nextDouble(); 
		
		System.out.println("Input 0 to convert from USD to RMB, or 1 to convert from RMB to USD.");
		System.out.println("Please input your choice, the press enter: ");
		
		int choice = input.nextInt();
		
		double conversion = 0; 
		
		if (choice == 0 ) {  // USD to RMB
			System.out.print("Enter USD amount, with no commas: ");
			double amount = input.nextDouble(); 
			conversion = amount * rate; 	
			// Display the result 
			System.out.println(amount +  " USD is " + (int)(conversion * 100) / 100.0 + " RMB."); 
		}  // choice 0
		else if (choice == 1) { //RMB to USD
			System.out.print("Enter RMB amount, with no commas: ");
			double amount = input.nextDouble(); 
			conversion = amount / rate; 
			// Display the result 
			System.out.println(amount +  " RMB is " + (int)(conversion * 100) / 100.0 + " USD"); 
		}
		else {
			System.out.println("Error: Incorrect Input"); 
			System.exit(1);
		}
		
	}
}
