public class C4E3EstimateAreas {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program calculates the area enclosed by the points of 4 cities' GPS locations:"); 
		System.out.println("Atlanta, Georgia: 33.7490, 84.3880"); 
		System.out.println("Orlando, Florida: 28.5384, 81.3789");
		System.out.println("Savannah, Georgia: 32.0809, 81.0912");
		System.out.println("Charolette, North Carolina: 35.2271, 80.8431");
		
		System.out.println(" ");
		
		double atlantaX = 33.7490;
		double atlantaY = 84.3880; 
		double orlandoX = 28.5384; 
		double orlandoY = 81.3789; 
		double savannahX = 32.0809;
		double savannahY = 81.0912; 
		double charoletteX = 35.2271; 
		double charoletteY = 80.8431; 
		
		// Convert to Radians
		atlantaX = Math.toRadians(atlantaX); 
		atlantaY = Math.toRadians(atlantaY); 
		orlandoX = Math.toRadians(orlandoX); 
		orlandoY = Math.toRadians(orlandoY); 
		savannahX = Math.toRadians(savannahX); 
		savannahY = Math.toRadians(savannahY); 
		charoletteX = Math.toRadians(charoletteX); 
		charoletteY = Math.toRadians(charoletteY); 
		
		double radius = 6371.01; // radius of earth
		
		double charoletteToSavannah = radius * Math.acos(Math.sin(charoletteX) * Math.sin(savannahX) + Math.cos(charoletteX) * Math.cos(savannahX) * Math.cos(charoletteY - savannahY)); 
		double savannahToOrlando = radius * Math.acos(Math.sin(savannahX) * Math.sin(orlandoX) + Math.cos(savannahX) * Math.cos(orlandoX) * Math.cos(savannahY - orlandoY)); 
		double orlandoToAtlanta = radius * Math.acos(Math.sin(orlandoX) * Math.sin(atlantaX) + Math.cos(orlandoX) * Math.cos(atlantaX) * Math.cos(orlandoY - atlantaY)); 
		double atlantaToCharolette = radius * Math.acos(Math.sin(atlantaX) * Math.sin(charoletteX) + Math.cos(atlantaX) * Math.cos(charoletteX) * Math.cos(atlantaY - charoletteY));
		double atlantaToSavannah = radius * Math.acos(Math.sin(atlantaX) * Math.sin(savannahX) + Math.cos(atlantaX) * Math.cos(savannahX) * Math.cos(atlantaY - savannahY)); 
		
		System.out.println("First we can find the distance between each city: ");
		System.out.println("The distance between Charolette, North Carolina and Savannah, Georgia is " + charoletteToSavannah + " km.");
		System.out.println("The distance between Savannah, Georgia and Orlando, Florida is " + savannahToOrlando + " km.");
		System.out.println("The distance between Orlando, Florida and Atlanta, Georgia is " + orlandoToAtlanta + " km.");
		System.out.println("The distance between Atlanta, Georgia and Charolette, North Carolina is " + atlantaToCharolette + " km.");
		System.out.println("The distance between Atlanta, Georgia and Savannah, Georgia is " + atlantaToSavannah + " km.");
		
		System.out.println(" ");
		
		System.out.println("We can divide the polygon between the four cities into two triangles.");
		
		// Triangle1
		double triangle1S = (charoletteToSavannah + atlantaToSavannah + atlantaToCharolette)/2; 
		double triangle1Area = Math.pow(triangle1S * (triangle1S - charoletteToSavannah) * (triangle1S - atlantaToSavannah) * (triangle1S - atlantaToCharolette), 0.5); 
		System.out.println("The area of the first triangle created by Charolette, Savannah, and Atlanta is " + triangle1Area + " km^2.");
		
		// Triangle2
		double triangle2S = (savannahToOrlando + orlandoToAtlanta + atlantaToSavannah)/2; 
		double triangle2Area = Math.pow(triangle2S * (triangle2S - savannahToOrlando) * (triangle2S - orlandoToAtlanta) * (triangle2S - atlantaToSavannah), 0.5);
		System.out.println("The area of the second triangle created by Savannah, Orlando, and Atlanta is " + triangle2Area + " km^2.");
		
		// Final area 
		double finalArea = triangle1Area + triangle2Area; 
		System.out.println(" ");
		
		System.out.println("Therefore, the estimated total area enclosed by these four cities is " + finalArea + " km^2."); 
	}

}
