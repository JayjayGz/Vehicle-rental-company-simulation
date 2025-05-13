package vehicleRelated;

public class GasolineCar extends Car
{
	//Attributes
	double tankCapacity;
	private String leased;
	public static int count = 0;
	
		//Default constructor
		public GasolineCar()
		{
			this.tankCapacity = 0.0;
			this.leased = "not leased";
			++count;
		}
		
		//Parameterized constructor
		public GasolineCar(String make, String model, int yearOfProduction, int maxPassengers, double tankCapacity)
		{
			super(make, model, yearOfProduction, maxPassengers);
			this.tankCapacity = tankCapacity;
			this.leased = "not leased";
			++count;
		}
		
		//Copy constructor
		public GasolineCar(GasolineCar otherGasolineCar)
		{
			super(otherGasolineCar);
			this.tankCapacity = otherGasolineCar.tankCapacity;
			this.leased = "not leased";
			++count;
		}
		
		//Setter gasoline car fuel tank capacity
		public void setTankCapacity(double tankCapacity)
		{
			this.tankCapacity = tankCapacity;
		}
		
		//Getter gasoline car fuel tank capacity
		public double getTankCapacity()
		{
			return(this.tankCapacity);
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
		
		@Override
		public String toString()
		{
			return(super.toString() + "\nTank capacity: " + tankCapacity + "\nPlate number: GC" + (count+1000) + "\n" + getLeased());
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
				GasolineCar otherGasolineCar = (GasolineCar)otherObject;
				return(tankCapacity == otherGasolineCar.tankCapacity && super.equals(otherObject)) ;
			}
				
		}
}
