package vehicleRelated;

public class DieselTruck extends Truck
{
	//Attributes
	double tankCapacity;
	private String leased;
	public static int count = 0;
	
		//Default constructor
		public DieselTruck()
		{
			this.tankCapacity = 0.0;
			this.leased = "not leased";
			++count;
		}
		
		//Parameterized constructor
		public DieselTruck(String make, String model, int yearOfProduction, double weightCapacity, double tankCapacity)
		{
			super(make, model, yearOfProduction, weightCapacity);
			this.tankCapacity = tankCapacity;
			this.leased = "not leased";
			++count;
		}
		
		//Copy constructor
		public DieselTruck(DieselTruck otherDieselTruck)
		{
			super(otherDieselTruck);
			this.tankCapacity = otherDieselTruck.tankCapacity;	
			this.leased = "not leased";
			++count;
		}
		
		//Setter diesel truck fuel tank capacity
		public void setTankCapacity(double tankCapacity)
		{
			this.tankCapacity = tankCapacity;
		}
		
		//Getter diesel truck fuel tank capacity
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
			return(super.toString() + "\nTank capacity: " + tankCapacity + "\nPlate number: DT" + (count+1000) + "\n" + leased);
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
				DieselTruck otherDieselTruck = (DieselTruck)otherObject;
				return(tankCapacity == otherDieselTruck.tankCapacity) ;
			}
				
		}
		
		
}
