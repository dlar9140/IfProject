package models;

public class HouseModels
{
	public HouseModels()
	{
		// TODO Auto-generated constructor stub
	}

	//Declaration section
	//Data member section
	//Also called instance variables
	//These are special - they get a "default" value
	//All numbers => 0
	//boolean => false
	//Objects => null!!!
	
	private String name;
	private double material;
	private int amountMaterial;
	private int amountRooms;
	/**
	 * Default constructor for after the fact customization
	 * AKA I don't know the info yet about the Run.
	 * Initializing data members with "bad" values to be changed.
	 */
	public HouseModels(String name, double material, int amountMaterial, int amountRooms)
	{
		
		this.material = material;
		this.name = name;
		this.amountMaterial = amountMaterial;
		this.amountRooms = amountRooms;
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getmaterial()
	{
		return material;
	}
	
	public int getamountMaterial()
	{
		return amountMaterial;
	}

	public int getamountRooms()
	{
		return amountRooms;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setmaterial(double material)
	{
		this.material = material;
	}
	
	public void setamountMaterial(int amountMaterial)
	{
		this.amountMaterial = amountMaterial;
	}
	
	public void setamountRooms( int amountRooms)
	{
		this.amountRooms = amountRooms;
	}
	
	public String toString()
	{
		String description = "This is a house!";
		description += " It's called " + name;
		description += " it is made out of" + material + " and has" + amountMaterial + "of them.";
		description += " and it also has" + amountRooms + "rooms.";
		
		return description = "";
	}
	
}
	

	
	

	/**
	 * Better constructor when I know information for the Run object.
	 * @param the amount of materials.
	 */
