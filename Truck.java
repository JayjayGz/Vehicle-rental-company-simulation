package vehicleRelated;

public class Truck extends Vehicle
{
	//Attribute
	private double weightCapacity;
	
	//Default constructor
	public Truck()
	{
		this.weightCapacity = 0.0;
	}
	
	//Parameterized constructor
	public Truck(String make, String model, int yearOfProduction, double weightCapacity)
	{
		super(make, model, yearOfProduction);
		this.weightCapacity = weightCapacity;
	}
	
	//Copy constructor
	public Truck(Truck otherTruck)
	{
		super(otherTruck);
		this.weightCapacity = otherTruck.weightCapacity;	
	}
	
	//Setter truck maximum capacity
	public void setWeightCapacity(double weightCapacity)
	{
		this.weightCapacity = weightCapacity;
	}
	
	//Getter truck maximum capacity
	public double getWeightCapacity()
	{
		return(this.weightCapacity);
	}
	
	@Override
	public String toString()
	{
		return(super.toString() + "\nThe truck has a maximum capacity (maximum weight it can transport, in kilograms) of: " + weightCapacity);
	}
	
	@Override
	public boolean equals(Object otherObject)
	{
		if(otherObject == null)
			return(false);
		else if(getClass() != otherObject.getClass())
			return(false);
		else
		{
			Truck otherTruck = (Truck)otherObject;
			return(weightCapacity == otherTruck.weightCapacity) ;
		}
			
	}

	
	
	
}
