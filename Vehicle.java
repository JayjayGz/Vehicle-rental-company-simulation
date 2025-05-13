package vehicleRelated;

public class Vehicle 
{
	//Attributes
	private String plateNumber; 
	private String make;
	private String model;
	private String leased;
	private int yearOfProduction;
	
	
	//Default constructor
	public Vehicle()
	{
		this.plateNumber = "";
		this.make = "";
		this.model = "";
		this.yearOfProduction = 0;
	}
	
	//Parameterized constructor
	public Vehicle(String make, String model, int yearOfProduction)
	{
		this.make = make;
		this.model = model;
		this.yearOfProduction = yearOfProduction;
	}
	
	//Copy constructor
	public Vehicle(Vehicle otherVehicle)
	{
		this.make = otherVehicle.make;
		this.model = otherVehicle.model;
		this.yearOfProduction = otherVehicle.yearOfProduction;
	}
	
	//Setter plate number
	public void setPlateNumber(String plateNumber)
	{
		this.plateNumber = plateNumber;
	}
	
	//Getter plate number
	public String getPlateNumber()
	{
		return(this.plateNumber);
	}
	
	//Setter make
	public void setMake(String make)
	{
		this.make = make;
	}
	
	//Getter make
	public String getMake()
	{
		return (this.make);
	}
	
	//Setter model
	public void setModel(String model)
	{
		this.model = model;
	}
	
	//Getter model
	public String getModel()
	{
		return(this.model);
	}
	
	//Setter leasing
	public void setLeased(String leased)
	{
		this.leased = leased;
	}
	
	//Getter leasing
	public String getLeased()
	{
		return(this.leased); 
	}
	
	//Setter year of production
	public void setYearOfProduction(int yearOfProduction)
	{
		this.yearOfProduction = yearOfProduction;
	}
	
	//Getter year of production
	public int getYearOfProduction()
	{
		return(this.yearOfProduction);
	}
	
	//Conversion of attributes into strings
	public String toString()
	{
		return("\nMake: " + make + "\nModel: " + model + "\nYear of production: " + yearOfProduction);
	}
	
	//Comparison of calling object to another object
	public boolean equals(Object otherObject)
	{
		if(otherObject == null)
			return(false);
		else if(getClass() != otherObject.getClass())
			return(false);
		else
		{
			Vehicle otherVehicle = (Vehicle)otherObject;
			return(make.equals(otherVehicle.make) && model.equals(otherVehicle.model) && yearOfProduction == otherVehicle.yearOfProduction);
		}
		
	}
	
	
}
