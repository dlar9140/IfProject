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
	
}
	
	

	/**
	 * Better constructor when I know information for the Run object.
	 * @param the amount of materials.
	 */
