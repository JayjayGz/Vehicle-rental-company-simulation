package vehicleRelated;

public class ElectricCar extends Car 
{
	//Attributes
	double autonomyRange;
	private String leased;
	public static int count = 0;
	
		//Default constructor
		public ElectricCar()
		{
			this.autonomyRange = 0.0;
			this.leased = "not leased";
			++count;
		}
		
		//Parameterized constructor
		public ElectricCar(String make, String model, int yearOfProduction, int maxPassengers, double autonomyRange)
		{
			super(make, model, yearOfProduction, maxPassengers);
			this.autonomyRange = autonomyRange;
			this.leased = "not leased";
			++count;
		}
		
		//Copy constructor
		public ElectricCar(ElectricCar otherElectricCar)
		{
			super(otherElectricCar);
			this.autonomyRange = otherElectricCar.autonomyRange;	
			this.leased = "not leased";
			++count;
		}
		
		//Setter electric car autonomy range
		public void setAutonomyRange(double autonomyRange)
		{
			this.autonomyRange = autonomyRange;
		}
		
		//Getter electric car maximum autonomy range
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
			return(super.toString() + "\nAutonomy range: " + autonomyRange + "\nPlate number: EC" + (count+1000) + "\n" + leased);
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
				ElectricCar otherElectricCar = (ElectricCar)otherObject;
				return(autonomyRange == otherElectricCar.autonomyRange) ;
			}
				
		}
	
	
}
