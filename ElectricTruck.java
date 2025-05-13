package vehicleRelated;

public class ElectricTruck extends Truck
{
	//Attributes
	double autonomyRange;
	private String leased;
	public static int count = 0;
	
	
		//Default constructor
		public ElectricTruck()
		{
			this.autonomyRange = 0.0;
			this.leased = "not leased";
			++count; 
		}
		
		//Parameterized constructor
		public ElectricTruck(String make, String model, int yearOfProduction, double weightCapacity, double autonomyRange)
		{	
			super(make, model, yearOfProduction, weightCapacity);
			this.autonomyRange = autonomyRange;
			this.leased = "not leased";
			++count;	
		}
		
		//Copy constructor
		public ElectricTruck(ElectricTruck otherElectricTruck)
		{
			super(otherElectricTruck);
			this.autonomyRange = otherElectricTruck.autonomyRange;	
			this.leased = "not leased";
			++count;
		}
		
		//Setter electric truck autonomy range
		public void setAutonomyRange(double autonomyRange)
		{
			this.autonomyRange = autonomyRange;
		}
		
		//Getter electric truck maximum autonomy range
		public double getAutonomyRange()
		{
			return(this.autonomyRange);
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
			return(super.toString() + "\nAutonomy range: " + autonomyRange +"\nPlate number: ET" + (count+1000) + "\n" + leased);
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
				ElectricTruck otherElectricTruck = (ElectricTruck)otherObject;
				return(autonomyRange == otherElectricTruck.autonomyRange) ;
			}
				
		}
		 
		
}
