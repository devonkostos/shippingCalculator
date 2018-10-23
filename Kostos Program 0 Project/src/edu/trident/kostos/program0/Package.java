/*
 * Class to hold user
 * information of package.
 * 
 * @author Devon Kostos
 */

package edu.trident.kostos.program0;

public class Package 
{
	private String itemName;
	private double price = 0.0;
	private int weight = 0;
	
	public Package(String name, double price, int weight)
	{
		itemName = name;
		this.price = price;
		this.weight = weight;
	}
	
	public String getItemName()
	{
		return itemName;
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	public double getPrice()
	{
		return price;
	}

}//END class Package
