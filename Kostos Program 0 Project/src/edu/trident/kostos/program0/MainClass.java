/*
 * Simulate a simple shipping calculator 
 * using the classes Shipper and Package.
 * 
 * @author Devon Kostos
 */

package edu.trident.kostos.program0;

import java.util.Scanner;

public class MainClass 
{
	private static Scanner input;

	public static void main(String[] args) 
	{
		input = new Scanner(System.in);
		int zone;
		int shipChoice;
		int newPkg = 1;
		
		Shipper ship1 = new Shipper("standard", 1.50, 2.00, 3.50);
		Shipper ship2 = new Shipper("second day", 2.50, 4.00, 17.00);
		Shipper ship3 = new Shipper("express", 8.00, 17.00, 22.50);
		
		while (newPkg == 1)
		{
			Package pkg = getOrder(input);
		
			System.out.printf("\nThe following reflects your package information entry.\n");
		
			System.out.printf("\n%20s%25s", "PACKAGE NAME", "PACKAGE WEIGHT");
			System.out.printf("\n%17s%22d", pkg.getItemName(), pkg.getWeight());
		
			System.out.printf("\n\nPlease choose your package's destination zone (1-5): ");
			zone = input.nextInt();
		
			while (zone < 1 || zone > 5)
			{
				System.out.printf("\nThat zone does not exist.\nPlease choose your package's"
								  + " destination zone (1-5): ");
				zone = input.nextInt();
			}
	
			System.out.printf("\n%20s%25s", "SHIPPING TYPE", "SHIPPING COST");
			System.out.printf("\n%17s%23.2f", ship1.getShippingType(), ship1.estimateShipping(pkg, zone));
			System.out.printf("\n%18s%22.2f", ship2.getShippingType(), ship2.estimateShipping(pkg, zone));
			System.out.printf("\n%17s%23.2f", ship3.getShippingType(), ship3.estimateShipping(pkg, zone));
		
			System.out.printf("\n\nPlease choose desired shipping method: (1)Standard (2)Second Day (3)Express ");
			shipChoice = input.nextInt();
		
			while (shipChoice < 1 || shipChoice > 3)
			{
				System.out.printf("\nThat is not a valid shipping method.\nPlease choose desired shipping method:"
								  + " (1)Standard (2)Second Day (3)Express ");
				shipChoice = input.nextInt();
			}
		
			if (shipChoice == 1)
			{
				ship1.addPackageShipping(pkg, zone);
			
				System.out.printf("\n%20s%25s%25s%25s", "PACKAGE NAME", "PACKAGE PRICE", "SHIPPING COST", "TOTAL SHIPPING");
				System.out.printf("\n%17s%23.2f%26.2f%24.2f", pkg.getItemName(), pkg.getPrice(), ship1.estimateShipping(pkg, zone), 
								  ship1.getTotalShipping());
			}
			else if (shipChoice == 2)
			{
				ship2.addPackageShipping(pkg, zone);
			
				System.out.printf("\n%20s%25s%25s%25s", "PACKAGE NAME", "PACKAGE PRICE", "SHIPPING COST", "TOTAL SHIPPING");
				System.out.printf("\n%17s%23.2f%26.2f%24.2f", pkg.getItemName(), pkg.getPrice(), ship2.estimateShipping(pkg, zone), 
							  	  ship2.getTotalShipping());
			}
			else if (shipChoice == 3)
			{
				ship3.addPackageShipping(pkg, zone);
			
				System.out.printf("\n%20s%25s%25s%25s", "PACKAGE NAME", "PACKAGE PRICE", "SHIPPING COST", "TOTAL SHIPPING");
				System.out.printf("\n%17s%23.2f%26.2f%24.2f", pkg.getItemName(), pkg.getPrice(), ship3.estimateShipping(pkg, zone), 
							  	  ship3.getTotalShipping());
			}
			
			System.out.printf("\n\nWould you like to enter another package? (1)Yes (2)No ");
			newPkg = input.nextInt();
			input.nextLine();
		
			while (newPkg < 1 || newPkg > 2)
			{
				System.out.printf("\nThat is not a valid chioce.\nWould you like to enter"
								  + " another package? (1)Yes (2)No ");
				newPkg = input.nextInt();
			}
			
			if (newPkg == 2)
			{	
				System.out.printf("\n%20s%25s", "SHIPPING TYPE", "TOTAL SHIPPING");
				System.out.printf("\n%17s%23.2f", ship1.getShippingType(), ship1.getTotalShipping());
				System.out.printf("\n%18s%22.2f", ship2.getShippingType(), ship2.getTotalShipping());
				System.out.printf("\n%17s%23.2f", ship3.getShippingType(), ship3.getTotalShipping());
				
				System.exit(2);
			}
		
		}
		
			input.close();
	}
	
	private static Package getOrder(Scanner input)
	{
		String name;
		double price;
		int weight;
		
		System.out.printf("\nThank you for shipping with JavaShipper.\n\nPlease enter the"
						  + " name of your package to continue: ");
		name = input.nextLine();
		
		System.out.printf("\nNext, please enter the price of your package: $");
		price = input.nextDouble();
		
		System.out.printf("\nGreat! Lastly, please enter the weight of your package: ");
		weight = input.nextInt();
		
		Package pkg = new Package(name, price, weight);
		
		return pkg;
	}//END getOrder

}//END MainClass
