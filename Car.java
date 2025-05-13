package vehicleRelated;

public class Car extends Vehicle
{
	//Attribute
	private int maxPassengers;

	//Default constructor
	public Car()
	{
		this.maxPassengers = 0;
	}
	
	//Parameterized constructor
	public Car(String make, String model, int yearOfProduction, int maxPassengers)
	{
		super(make, model, yearOfProduction);
		this.maxPassengers = maxPassengers;
	}
	
	//Copy constructor
	public Car(Car otherCar)
	{
		super(otherCar);
		this.maxPassengers = otherCar.maxPassengers;	
	}
	
	//Setter car maximum passengers
	public void setMaxPassengers(int maxPassengers)
	{
		this.maxPassengers = maxPassengers;
	}
	
	//Getter car maximum passengers
	public int getMaxPassengers()
	{
		return(this.maxPassengers);
	}
	
	@Override
	public String toString()
	{
		return(super.toString() + "\nThe car has a maximum number of passengers of: " + maxPassengers);
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
			Car otherCar = (Car)otherObject;
			return(maxPassengers == otherCar.maxPassengers && super.equals(otherObject)) ;
		}
			
	}
	
	
}
