/*
 * Class to calculate shipping rates  
 * and total costs of packages using
 * the Package class.
 * 
 * @author Devon Kostos
 */

package edu.trident.kostos.program0;

public class Shipper
{
	private String shippingType;
	private double weightOneCost;
	private double weightTwoCost;
	private double weightThreeCost;
	private double totalShipping;
	private int totalPackages = 0;
	
	public Shipper(String shippingType, double weightOneCost, double weightTwoCost, double weightThreeCost)
	{
		this.shippingType = shippingType;
		this.weightOneCost = weightOneCost;
		this.weightTwoCost = weightTwoCost;
		this.weightThreeCost = weightThreeCost;
	}
	
	public String getShippingType()
	{
		return shippingType;
	}
	
	public double getTotalShipping()
	{
		return totalShipping;
	}
	
	public double estimateShipping(Package pkg, int zone)
	{
		double shippingCost = 0.0;
		double zoneRate;
		
		if (zone == 1)
		{
			if (pkg.getWeight() > 0 && pkg.getWeight() < 9)
			{
				shippingCost = weightOneCost;
			}
			else if (pkg.getWeight() > 8 && pkg.getWeight() < 17)
			{
				shippingCost = weightTwoCost;
			}
			else if (pkg.getWeight() > 16)
			{
				shippingCost = weightThreeCost;
			}	
		}//END zone1
		
		if (zone == 2)
		{
			zoneRate = 1.10;
			
			if (pkg.getWeight() > 0 && pkg.getWeight() < 9)
			{
				shippingCost = weightOneCost * zoneRate;
			}
			else if (pkg.getWeight() > 8 && pkg.getWeight() < 17)
			{
				shippingCost = weightTwoCost * zoneRate;
			}
			else if (pkg.getWeight() > 16)
			{
				shippingCost = weightThreeCost * zoneRate;
			}	
		}//END zone2
		
		if (zone == 3)
		{
			zoneRate = 1.20;
			
			if (pkg.getWeight() > 0 && pkg.getWeight() < 9)
			{
				shippingCost = weightOneCost * zoneRate;
			}
			else if (pkg.getWeight() > 8 && pkg.getWeight() < 17)
			{
				shippingCost = weightTwoCost * zoneRate;
			}
			else if (pkg.getWeight() > 16)
			{
				shippingCost = weightThreeCost * zoneRate;
			}	
		}//END zone3
		
		if (zone == 4)
		{
			zoneRate = 1.30;
			
			if (pkg.getWeight() > 0 && pkg.getWeight() < 9)
			{
				shippingCost = weightOneCost * zoneRate;
			}
			else if (pkg.getWeight() > 8 && pkg.getWeight() < 17)
			{
				shippingCost = weightTwoCost * zoneRate;
			}
			else if (pkg.getWeight() > 16)
			{
				shippingCost = weightThreeCost * zoneRate;
			}	
		}//END zone4
		
		if (zone == 5)
		{
			zoneRate = 1.50;
			
			if (pkg.getWeight() > 0 && pkg.getWeight() < 9)
			{
				shippingCost = weightOneCost * zoneRate;
			}
			else if (pkg.getWeight() > 8 && pkg.getWeight() < 17)
			{
				shippingCost = weightTwoCost * zoneRate;
			}
			else if (pkg.getWeight() > 16)
			{
				shippingCost = weightThreeCost * zoneRate;
			}	
		}//END zone5
		
		return shippingCost;
	}
	
	public void addPackageShipping(Package pkg, int zone)
	{	
		double cost = 0.0;
		
		if (zone == 1)
		{
			if (pkg.getWeight() > 0 && pkg.getWeight() < 9)
			{
				cost = pkg.getPrice() + estimateShipping(pkg, zone);
			}
			else if (pkg.getWeight() > 8 && pkg.getWeight() < 17)
			{
				cost = pkg.getPrice() + estimateShipping(pkg, zone);
			}
			else if (pkg.getWeight() > 16)
			{
				cost = pkg.getPrice() + estimateShipping(pkg, zone);
			}	
		}//END zone1
		
		if (zone == 2)
		{
			if (pkg.getWeight() > 0 && pkg.getWeight() < 9)
			{
				cost = pkg.getPrice() + estimateShipping(pkg, zone);
			}
			else if (pkg.getWeight() > 8 && pkg.getWeight() < 17)
			{
				cost = pkg.getPrice() + estimateShipping(pkg, zone);
			}
			else if (pkg.getWeight() > 16)
			{
				cost = pkg.getPrice() + estimateShipping(pkg, zone);
			}	
		}//END zone2
		
		if (zone == 3)
		{
			if (pkg.getWeight() > 0 && pkg.getWeight() < 9)
			{
				cost = pkg.getPrice() + estimateShipping(pkg, zone);
			}
			else if (pkg.getWeight() > 8 && pkg.getWeight() < 17)
			{
				cost = pkg.getPrice() + estimateShipping(pkg, zone);
			}
			else if (pkg.getWeight() > 16)
			{
				cost = pkg.getPrice() + estimateShipping(pkg, zone);
			}	
		}//END zone3
		
		if (zone == 4)
		{
			if (pkg.getWeight() > 0 && pkg.getWeight() < 9)
			{
				cost = pkg.getPrice() + estimateShipping(pkg, zone);
			}
			else if (pkg.getWeight() > 8 && pkg.getWeight() < 17)
			{
				cost = pkg.getPrice() + estimateShipping(pkg, zone);
			}
			else if (pkg.getWeight() > 16)
			{
				cost = pkg.getPrice() + estimateShipping(pkg, zone);
			}	
		}//END zone4
		
		if (zone == 5)
		{
			if (pkg.getWeight() > 0 && pkg.getWeight() < 9)
			{
				cost = pkg.getPrice() + estimateShipping(pkg, zone);
			}
			else if (pkg.getWeight() > 8 && pkg.getWeight() < 17)
			{
				cost = pkg.getPrice() + estimateShipping(pkg, zone);
			}
			else if (pkg.getWeight() > 16)
			{
				cost = pkg.getPrice() + estimateShipping(pkg, zone);
			}	
		}//END zone5
		
		totalShipping += cost;
		
		totalPackages = totalPackages++;
	}
	
}//END class Shipper
