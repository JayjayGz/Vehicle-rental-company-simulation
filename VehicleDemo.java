package driver;

//Vehicle related classes
import java.util.Scanner;
import vehicleRelated.Vehicle;
import vehicleRelated.Car;
import vehicleRelated.Truck;
import vehicleRelated.DieselTruck;
import vehicleRelated.ElectricTruck;
import vehicleRelated.GasolineCar;
import vehicleRelated.ElectricCar;
import clientRelated.Client;


public class VehicleDemo 
{ 
	
	
	
	//Object Arrays
	static Vehicle[] vehicles = new Vehicle[40];
	static DieselTruck[] dieselTrucks = new DieselTruck[10];
	static ElectricTruck[] electricTrucks = new ElectricTruck[10];
	static GasolineCar[] gasolineCars = new GasolineCar[10];
	static ElectricCar[] electricCars = new ElectricCar[10];
	static Client[] clients = new Client[40];
	
	//Attribute
	static double largestCapacity = 0.0;

	public static void main(String[] args) 
	{     
		//Scanner creation
		Scanner keyin = new Scanner(System.in);
		
		//Do-while loop selection attributes
		int choice0 = 0;
		int choice1 = 0;
		int choice2 = 0;
		
		//Welcome message
		System.out.println("Welcome to RoyalRentals!!! (Enter a number, ie. 1 or 2)");
		System.out.println("1. Do you want to access a menu-driven interface to interact with the program ? ");
		System.out.println("2. Do you want to access a predefined/hard-coded scenario for testing?");
		
		choice0 = keyin.nextInt();
		
		switch(choice0)
		{
	        //Menu-driven interface to interact with the program
			case 1:
			{
				do 
				{
						
					System.out.println("***** Welcome to the menu-driven interface of RoyalRentals!!! *****");
					System.out.println("	\n   -----What operation do you wish to perform ???-----");
					System.out.println("\n");
					System.out.println("1. Vehicle Management");
					System.out.println("2. Client Management");
					System.out.println("3. Leasing Operations");
					System.out.println("4. Additional Operations");
					System.out.println("5. Exit");
					
					choice1 = keyin.nextInt();
					
					switch(choice1)
					{
						//Vehicle Management
						case 1:
						{
							do
							{	
								System.out.println("Vehicle Management menu");
								System.out.println("Select an option...");
								System.out.println("\n");
								System.out.println("	1. Add a vehicle");
								System.out.println("	2. Delete a vehicle");
								System.out.println("	3. Update vehicle information");
								System.out.println("	4. List all vehicles by category  (electric trucks, diesel trucks, etc.)");
								System.out.println("	5. Main menu");
								
								choice2 = keyin.nextInt();
								
									switch(choice2)
									{
										//Add a vehicle
										case 1:
											
											addVehicle(keyin);
											break;
					
										//Delete a vehicle
										case 2:
											deleteVehicle(keyin);
											break;
											
										//Update vehicle information 	
										case 3:	
											updateVehicle(keyin);
											break;
										
										//List all vehicles by category (electric trucks, diesel trucks, etc.)
										case 4:
										
											listVehicles();
											break;
											
										//Main menu	
										case 5:
											break;	
									}
								
							}
							while(choice2 != 5);
								
								break;
						}
						
						//Client Management
						case 2:
						{
							do
							{
								System.out.println("Client management menu");
								System.out.println("Select an option...");
								System.out.println("\n");
								System.out.println("	1. Add a client");
								System.out.println("	2. Edit a cleint");
								System.out.println("	3. Delete a client");
								System.out.println("	4. Main menu");
								
								choice2 = keyin.nextInt();
								
									switch(choice2)
									{
										//Add a client
										case 1:
											addClient(keyin);
											break;
										
										//Edit a client
										case 2:
											editClient(keyin);
											break;
										
										//Delete a client
										case 3:
											deleteClient(keyin);
											break;
										
										//Main menu
										case 4:	
											break;
									}	
							}
							while(choice2 !=4);
								break;
						}	
						
						//Leasing Operations
						case 3:
						{	
							do
							{
								System.out.println("Leasing Operations menu");
								System.out.println("Select an option...");
								System.out.println("\n");
								System.out.println("	1. Lease a vehicle to a client");
								System.out.println("	2. Return a vehicle from a client");
								System.out.println("	3. Show all vehicles leased by a client ");
								System.out.println("	4. Show all leased vehicles (by all clients)");
								System.out.println("	5. Main menu");
								
								choice2 = keyin.nextInt();
								
									switch(choice2)
									{
										//Lease a vehicle to a client
										case 1:
											leaseVehicle(keyin);
											break;
										
										//Return a vehicle from a client
										case 2:
											returnVehicle(keyin);
											break;
											
										//Show all vehicles leased by a client	
										case 3:
											clientLeasedVehicles(keyin);
											break;
											
										//Show all leased vehicles (by all clients)
										case 4:
											allLeasedVehicles(keyin);
											break;
										
										//Main menu
										case 5:
											break;						
									}				
							}
							while(choice2 !=5);
								break;
						}	
						
						//Additional Operations
						case 4:
						{	
							
							do
							{
								System.out.println("Additional Operations menu");
								System.out.println("Select an option...");
								System.out.println("\n");
								System.out.println("	1. Display the truck with the largest capacity");
								System.out.println("	2. Create a copy of the electric trucks array (see below)");
								System.out.println("	3. Main menu");
								
								choice2 = keyin.nextInt();
								
									switch(choice2)
									{
										//Display the truck with the largest capacity
										case 1:
											getLargestTruck();
											break;
											
										//Create a copy of the electric trucks array
										case 2:
											copyVehicles(electricTrucks);
											break;
											
										//Main menu
										case 3:		
											break;		
									}	
							}
							while(choice2 != 3);
								break;
						}
						
						//End program
						case 5:
						{
							System.exit(0);
							break;
						}	
					}		
				} 
				while (choice1 != 5);
				break;
			}
			
			//Predefined/hard-coded scenario for testing
			case 2:
			{
				dieselTrucks[0] = new DieselTruck("Ford", "Duty", 2010, 1000, 110);
				System.out.println(dieselTrucks[0].toString());
				
				dieselTrucks[1] = new DieselTruck("Ram", "Crew", 2015, 1250, 130);
				System.out.println(dieselTrucks[1].toString());
				 
				dieselTrucks[2] = new DieselTruck("GMC", "Sierrea", 1500, 7, 115);
				System.out.println(dieselTrucks[2].toString());
				
				 electricTrucks[0] = new ElectricTruck("Chevrolet", "Silverado", 2015, 1100, 350);
				System.out.println(electricTrucks[0].toString());
				
				electricTrucks[1] = new ElectricTruck("Chevrolet", "Silverado", 2015, 1100, 350);
				System.out.println(electricTrucks[1].toString());
				
				electricTrucks[2] = new ElectricTruck("ISUZU", "NRR", 2025, 1050, 500);
				System.out.println(electricTrucks[2].toString());
				
				gasolineCars[0] = new GasolineCar("Toyota", "Corolla", 2015, 5, 60);
				System.out.println(gasolineCars[0].toString());
				
				gasolineCars[1] = new GasolineCar("Hyundai", "Elantra", 2008, 5, 70);
				System.out.println(gasolineCars[1].toString());
				
				gasolineCars[2] = new GasolineCar("Mitsubishi", "Mirage", 2010, 5, 80);
				System.out.println(gasolineCars[2].toString());
				
				 electricCars[0] = new ElectricCar("Chevrolet", "Equinox", 2025, 5, 250);
				System.out.println( electricCars[0].toString());
				
				 electricCars[1] = new ElectricCar("Volkswagen", "ID", 2025, 5, 240);
				System.out.println(electricCars[1].toString());
				
				 electricCars[2] = new ElectricCar("Volvo", "EX40", 2025, 5, 300);
				System.out.println(electricCars[2].toString());
				
				
				Client client1 = new Client("Aiden", "Yasuo", 19);
				System.out.println(client1.toString());
				
				Client client2 = new Client("Yuva", "Yasuo", 18);
				System.out.println(client2.toString());
				
				Client client3 = new Client("Math", "Gym", 20);
				System.out.println(client3.toString());
				
				System.out.println();
				
				
				System.out.println("Compare two objects from different classes.");
				System.out.println(dieselTrucks[0].equals(electricCars[0]));
				System.out.println();
				
				System.out.println("Compare two objects of the same class with different attribute values.");
				System.out.println(gasolineCars[0].equals(gasolineCars[1]));
				System.out.println();
				
				System.out.println("Compare two objects of the same class with identical attribute values.");
				System.out.println(electricTrucks[0].equals(electricTrucks[1]));
				System.out.println();
				
				
				new DieselTruck();
				new ElectricTruck();
				new GasolineCar();
				new ElectricCar();
				new Vehicle();
				
				getLargestTruck();
				copyVehicles(electricTrucks);
				
				break;
			}
		}
		keyin.close();
	}	
	
	private static void addVehicle(Scanner keyin)
	{	
		System.out.println("What type of vehicle do you want to add? (truck or car)");
		String vehicleType = keyin.next();
		
		if(vehicleType.equalsIgnoreCase("truck"))
		{
			System.out.println("What type of truck do you want to add? (diesel or electric)");
			String truckType = keyin.next();
			
			if(truckType.equalsIgnoreCase("diesel"))
			{
				System.out.println("Enter the make, model, year of production, weight capacity, and tank capacity of the diesel truck.");
				
				String make = keyin.next();
				String model = keyin.next();
				int yearOfProduction = keyin.nextInt();
				double weightCapacity = keyin.nextDouble();
				double tankCapacity = keyin.nextDouble();
				
				DieselTruck newDieselTruck = new DieselTruck(make, model, yearOfProduction, weightCapacity, tankCapacity); 
				
				 for (int i = 0; i < dieselTrucks.length; i++) 
				 {
		                if (dieselTrucks[i] == null) 
		                {
		                    dieselTrucks[i] = newDieselTruck;
		                    System.out.println("Diesel truck added successfully.");
		                    return;
		                }
		         }
			}
			
			if(truckType.equalsIgnoreCase("electric"))
			{
				
				System.out.println("Enter the make, model, year of production, weight capacity, and autonomy range of the electric truck.");
				
				String make = keyin.next();
				String model = keyin.next();
				int yearOfProduction = keyin.nextInt();
				double weightCapacity = keyin.nextDouble();
				double autonomyRange = keyin.nextDouble();
				
				ElectricTruck newElectricTruck = new ElectricTruck(make, model, yearOfProduction, weightCapacity, autonomyRange);
				
				 for (int i = 0; i < electricTrucks.length; i++) 
				 {
		                if (electricTrucks[i] == null)
		                {
		                	electricTrucks[i] = newElectricTruck;
		                    System.out.println("Electric truck added successfully.");
		                    return;
		                }
		         }
			}
		}
		
		if(vehicleType.equalsIgnoreCase("car"))
		{
			System.out.println("What type of car do you want to add? (gasoline or electric)");
			String carType = keyin.next();
			
			if(carType.equalsIgnoreCase("gasoline"))
			{	
				
				System.out.println("Enter the make, model, year of production, number of maximum passengers, and tank capacity of the gasoline car.");
				
				String make = keyin.next();
				String model = keyin.next();
				int yearOfProduction = keyin.nextInt();
				int maxPassengers = keyin.nextInt();
				double tankCapacity = keyin.nextDouble();
				
				GasolineCar newGasolineCar = new GasolineCar(make, model, yearOfProduction, maxPassengers, tankCapacity); 
				
				 for (int i = 0; i < gasolineCars.length; i++) 
				 {
		               if (gasolineCars[i] == null) 
		               {
		            	   gasolineCars[i] = newGasolineCar;
		                   System.out.println("Gasoline car added successfully.");
		                   return;
		               }
		          }
			}
			
			if(carType.equalsIgnoreCase("electric"))
			{
				
				System.out.println("Enter the make, model, year of production, number of maximum passengers, and autonomy range of the electric car.");
				
				String make = keyin.next();
				String model = keyin.next();
				int yearOfProduction = keyin.nextInt();
				int maxPassengers = keyin.nextInt();
				double autonomyRange = keyin.nextDouble();
				
				ElectricCar newElectricCar = new ElectricCar(make, model, yearOfProduction, maxPassengers, autonomyRange); 		
				
				 for (int i = 0; i < electricCars.length; i++) 
				 {
		               if (electricCars[i] == null)
		               {
		            	   electricCars[i] = newElectricCar;
		                   System.out.println("Electric car added successfully.");
		                   return;
		               }
		          }
			}		
		}				
	}
	
	private static void deleteVehicle(Scanner keyin)
	{
		System.out.println("What type of vehicle do you want to delete? (truck or car)");
		String vehicleType = keyin.next();
		
		if(vehicleType.equalsIgnoreCase("truck"))
		{
			System.out.println("What type of truck do you want to delete? (diesel or electric)");
			String truckType = keyin.next();
			
			if(truckType.equalsIgnoreCase("diesel"))
			{	
				System.out.println("Enter the make, model, year of production, weight capacity, and tank capacity of the diesel truck.");
				
				String make = keyin.next();
				String model = keyin.next();
				int yearOfProduction = keyin.nextInt();
				double weightCapacity = keyin.nextDouble();
				double tankCapacity = keyin.nextDouble();
				
				
					for(int i = 0; i < dieselTrucks.length; i++)
					{
						if(dieselTrucks[i] != null)
							if(dieselTrucks[i].getMake().equalsIgnoreCase(make) 
									&& dieselTrucks[i].getModel().equalsIgnoreCase(model)
									&& dieselTrucks[i].getYearOfProduction() == yearOfProduction 
									&& dieselTrucks[i].getWeightCapacity() == weightCapacity
									&& dieselTrucks[i].getTankCapacity() == tankCapacity)
							{	
								dieselTrucks[i] = null;	
							}
							else
							System.out.println("This vehicle does not exist.");	
					}
			}
			
			if(truckType.equalsIgnoreCase("electric"))
			{
				System.out.println("Enter the make, model, year of production, weight capacity, and autonomy range of the electric truck.");
				
				String make = keyin.next();
				String model = keyin.next();
				int yearOfProduction = keyin.nextInt();
				double weightCapacity = keyin.nextDouble();
				double autonomyRange = keyin.nextDouble();
				
					for(int i = 0; i < electricTrucks.length; i++)
					{ 	
						if(electricTrucks[i] != null)
							if(electricTrucks[i].getMake().equalsIgnoreCase(make) 
									&& electricTrucks[i].getModel().equalsIgnoreCase(model)
									&& electricTrucks[i].getYearOfProduction() == yearOfProduction 
									&& electricTrucks[i].getWeightCapacity() == weightCapacity
									&& electricTrucks[i].getAutonomyRange() == autonomyRange)
							{	
								electricTrucks[i] = null;	
							}	
							else
							System.out.println("This vehicle does not exist.");
					}
			}	
		}
		
		if(vehicleType.equalsIgnoreCase("car"))
		{
			System.out.println("What type of car do you want to add? (gasoline or electric)");
			String carType = keyin.next();
			
			if(carType.equalsIgnoreCase("gasoline"))
			{	
				
				System.out.println("Enter the make, model, year of production, number of maximum passengers, and tank capacity of the gasoline car.");
				
				String make = keyin.next();
				String model = keyin.next();
				int yearOfProduction = keyin.nextInt();
				int maxPassengers = keyin.nextInt();
				double tankCapacity = keyin.nextDouble();
				
					for(int i = 0; i < gasolineCars.length; i++)
					{
						if(gasolineCars[i] != null)
							if(gasolineCars[i].getMake().equalsIgnoreCase(make) 
									&& gasolineCars[i].getModel().equalsIgnoreCase(model)
									&& gasolineCars[i].getYearOfProduction() == yearOfProduction 
									&& gasolineCars[i].getMaxPassengers() == maxPassengers
									&& gasolineCars[i].getTankCapacity() == tankCapacity)
							{	
								gasolineCars[i] = null;	
							}	
							else
							System.out.println("This vehicle does not exist.");	
					} 
			}
			
			if(carType.equalsIgnoreCase("electric"))
			{
					
				System.out.println("Enter the make, model, year of production, number of maximum passengers, and autonomy range of the electric car.");
					
				String make = keyin.next();
				String model = keyin.next();
				int yearOfProduction = keyin.nextInt();
				int maxPassengers = keyin.nextInt();
				double autonomyRange = keyin.nextDouble(); 	
				
					for(int i = 0; i < electricCars.length; i++)
					{
						if(electricCars[i] != null)
							if(electricCars[i].getMake().equalsIgnoreCase(make) 
									&& electricCars[i].getModel().equalsIgnoreCase(model)
									&& electricCars[i].getYearOfProduction() == yearOfProduction 
									&& electricCars[i].getMaxPassengers() == maxPassengers
									&& electricCars[i].getAutonomyRange() == autonomyRange)
							{	
								electricCars[i] = null;	
							}		
							else
							System.out.println("This vehicle does not exist.");	
					}
			}	
		 }
	}
	
	private static void updateVehicle(Scanner keyin)
	{
		System.out.println("What type of vehicle do you want to delete? (truck or car)");
		String vehicleType = keyin.next();
		
		if(vehicleType.equalsIgnoreCase("truck"))
		{
			System.out.println("What type of truck do you want to delete? (diesel or electric)");
			String truckType = keyin.next();
			
			if(truckType.equalsIgnoreCase("diesel"))
			{	
				System.out.println("Enter the make, model, year of production, weight capacity, and tank capacity of the diesel truck.");
				
				String make = keyin.next();
				String model = keyin.next();
				int yearOfProduction = keyin.nextInt();
				double weightCapacity = keyin.nextDouble();
				double tankCapacity = keyin.nextDouble();
				
				
					for(int i = 0; i < dieselTrucks.length; i++)
					{
						if(dieselTrucks[i] != null)
							if(dieselTrucks[i].getMake().equalsIgnoreCase(make) 
									&& dieselTrucks[i].getModel().equalsIgnoreCase(model)
									&& dieselTrucks[i].getYearOfProduction() == yearOfProduction 
									&& dieselTrucks[i].getWeightCapacity() == weightCapacity
									&& dieselTrucks[i].getTankCapacity() == tankCapacity)
							{	
								System.out.println("What information do you want to edit? (make, model, year of production, weight capacity, tank capacity)");
								String information1 = keyin.nextLine();
								String information = keyin.nextLine();
								
									if(information.equalsIgnoreCase("make"))
									{
									  System.out.println("Enter the new make.");
									  String newInfo = keyin.next();
									  dieselTrucks[i].setMake(newInfo);
									}
									
									if(information.equalsIgnoreCase("model"))
									{
									  System.out.println("Enter the new model.");
									  String newInfo = keyin.next();
									  dieselTrucks[i].setModel(newInfo);
									}
									
									if(information.equalsIgnoreCase("year of production"))
									{
									  System.out.println("Enter the new year of production.");
									  int newInfo = keyin.nextInt();
									  dieselTrucks[i].setYearOfProduction( newInfo);
									}
									
									if(information.equalsIgnoreCase("weight capacity"))
									{
									  System.out.println("Enter the new weight capacity.");
									  double newInfo = keyin.nextDouble();
									  dieselTrucks[i].setWeightCapacity(newInfo);
									}
									
									if(information.equalsIgnoreCase("tank capacity"))
									{
									  System.out.println("Enter the new tank capacity.");
									  double newInfo = keyin.nextDouble();
									  dieselTrucks[i].setTankCapacity(keyin.nextDouble());
									}
							}
							else
							System.out.println("This vehicle does not exist.");
						}		
			}
			
			if(truckType.equalsIgnoreCase("electric"))
			{
				System.out.println("Enter the make, model, year of production, weight capacity, and autonomy range of the electric truck.");
				
				String make = keyin.next();
				String model = keyin.next();
				int yearOfProduction = keyin.nextInt();
				double weightCapacity = keyin.nextDouble();
				double autonomyRange = keyin.nextDouble();
				
					for(int i = 0; i < electricTrucks.length; i++)
					{
						if(electricTrucks[i] != null)
							if(electricTrucks[i].getMake().equalsIgnoreCase(make) 
									&& electricTrucks[i].getModel().equalsIgnoreCase(model)
									&& electricTrucks[i].getYearOfProduction() == yearOfProduction 
									&& electricTrucks[i].getWeightCapacity() == weightCapacity
									&& electricTrucks[i].getAutonomyRange() == autonomyRange)
							{	
								System.out.println("What information do you want to edit? (make, model, year of production, weight capacity, autonomy range)");
								String information1 = keyin.nextLine();
								String information = keyin.nextLine();
								
									if(information.equalsIgnoreCase("make"))
									{
									  System.out.println("Enter the new make.");
									  String newInfo = keyin.next();
									  electricTrucks[i].setMake(newInfo);
									}
									
									if(information.equalsIgnoreCase("model"))
									{
									  System.out.println("Enter the new model.");
									  String newInfo = keyin.next();
									  electricTrucks[i].setModel(newInfo);
									}
									
									if(information.equalsIgnoreCase("year of production"))
									{
									  System.out.println("Enter the new year of production.");
									  int newInfo = keyin.nextInt();
									  electricTrucks[i].setYearOfProduction(newInfo);
									}
									
									if(information.equalsIgnoreCase("weight capacity"))
									{
									  System.out.println("Enter the new weight capacity.");
									  double newInfo = keyin.nextDouble();
									  electricTrucks[i].setWeightCapacity(newInfo);
									}
									
									if(information.equalsIgnoreCase("tank capacity"))
									{
									  System.out.println("Enter the new autonomy range.");
									  double newInfo = keyin.nextDouble();
									  electricTrucks[i].setAutonomyRange(newInfo);
									}	
							}
							else
								System.out.println("This vehicle does not exist.");
						}
			}	
		}
		
		if(vehicleType.equalsIgnoreCase("car"))
		{
			System.out.println("What type of car do you want to add? (gasoline or electric)");
			String carType = keyin.next();
			
			if(carType.equalsIgnoreCase("gasoline"))
			{	
				
				System.out.println("Enter the make, model, year of production, number of maximum passengers, and tank capacity of the gasoline car.");
				
				String make = keyin.next();
				String model = keyin.next();
				int yearOfProduction = keyin.nextInt();
				int maxPassengers = keyin.nextInt();
				double tankCapacity = keyin.nextDouble();
				
					for(int i = 0; i < gasolineCars.length; i++)
					{
						if(gasolineCars[i] != null)
							if(gasolineCars[i].getMake().equalsIgnoreCase(make) 
									&& gasolineCars[i].getModel().equalsIgnoreCase(model)
									&& gasolineCars[i].getYearOfProduction() == yearOfProduction 
									&& gasolineCars[i].getMaxPassengers() == maxPassengers
									&& gasolineCars[i].getTankCapacity() == tankCapacity)
							{	
								System.out.println("What information do you want to edit? (make, model, year of production, number of maximum passengers, tank capacity)");
								String information1 = keyin.nextLine();
								String information = keyin.nextLine();
								
									if(information.equalsIgnoreCase("make"))
									{
									  System.out.println("Enter the new make.");
									  String newInfo = keyin.next();
									  gasolineCars[i].setMake(newInfo);
									}
									
									if(information.equalsIgnoreCase("model"))
									{
									  System.out.println("Enter the new model.");
									  String newInfo = keyin.next();
									  gasolineCars[i].setModel(newInfo);
									}
									
									if(information.equalsIgnoreCase("year of production"))
									{
									  System.out.println("Enter the new year of production.");
									  int newInfo = keyin.nextInt();
									  gasolineCars[i].setYearOfProduction(newInfo);
									}
									
									if(information.equalsIgnoreCase("weight capacity"))
									{
									  System.out.println("Enter the new number of maximum passengers.");
									  int newInfo = keyin.nextInt();
									  gasolineCars[i].setMaxPassengers(newInfo);
									}
									
									if(information.equalsIgnoreCase("tank capacity"))
									{
									  System.out.println("Enter the new tank capacity.");
									  double newInfo = keyin.nextDouble();
									  gasolineCars[i].setTankCapacity(newInfo);
									}	
						}	
							else
							System.out.println("This vehicle does not exist");
					}	 
			}
			
			if(carType.equalsIgnoreCase("electric"))
			{
					
				System.out.println("Enter the make, model, year of production, number of maximum passengers, and autonomy range of the electric car.");
					
				String make = keyin.next();
				String model = keyin.next();
				int yearOfProduction = keyin.nextInt();
				int maxPassengers = keyin.nextInt();
				double autonomyRange = keyin.nextDouble(); 	
				
					for(int i = 0; i < electricCars.length; i++)
					{
						if(electricCars[i] != null)
							if(electricCars[i].getMake().equalsIgnoreCase(make) 
									&& electricCars[i].getModel().equalsIgnoreCase(model)
									&& electricCars[i].getYearOfProduction() == yearOfProduction 
									&& electricCars[i].getMaxPassengers() == maxPassengers
									&& electricCars[i].getAutonomyRange() == autonomyRange)
							{	
								System.out.println("What information do you want to edit? (make, model, year of production, number of maximum passengers, autonomy range)");
								String information1 = keyin.nextLine();
								String information = keyin.nextLine();
								
									if(information.equalsIgnoreCase("make"))
									{
									  System.out.println("Enter the new make.");
									  String newInfo = keyin.next();
									  electricCars[i].setMake(newInfo);
									}
									
									if(information.equalsIgnoreCase("model"))
									{
									  System.out.println("Enter the new model.");
									  String newInfo = keyin.next();
									  electricCars[i].setModel(newInfo);
									}
									
									if(information.equalsIgnoreCase("year of production"))
									{
									  System.out.println("Enter the new year of production.");
									  int newInfo = keyin.nextInt();
									  electricCars[i].setYearOfProduction(newInfo);
									}
									
									if(information.equalsIgnoreCase("weight capacity"))
									{
									  System.out.println("Enter the new number of maximum passengers.");
									  int newInfo = keyin.nextInt();
									  electricCars[i].setMaxPassengers(newInfo);
									}
									
									if(information.equalsIgnoreCase("tank capacity"))
									{
									  System.out.println("Enter the new tank capacity.");
									  double newInfo = keyin.nextDouble();
									  electricCars[i].setAutonomyRange(newInfo);
									}	
							}	
							else
							System.out.println("This vehicle does not exist.");
					}
			}	
		 }	
	}

	private static void listVehicles()
	{
		System.out.println("Diesel trucks: ");
		for(int i = 0; i < dieselTrucks.length; i++)
		{
			if(dieselTrucks[i] != null)
			System.out.println(dieselTrucks[i].toString());
		}
		
		System.out.println("Electric trucks: ");
		for(int i = 0; i < electricTrucks.length; i++)
		{
			if(electricTrucks[i] != null)
			System.out.println(electricTrucks[i].toString());
		}
		
		System.out.println("Gasoline cars: ");
		for(int i = 0; i < gasolineCars.length; i++)
		{	
			if(gasolineCars[i] != null)
			System.out.println(gasolineCars[i].toString());
		}
		
		System.out.println("Electric cars: ");
		for(int i = 0; i < electricCars.length; i++)
		{
			if(electricCars[i] != null)
			System.out.println(electricCars[i].toString());
		}
	}
	
	private static void addClient(Scanner keyin)
	{
		System.out.println("What is the first name of the client");
		String firstName = keyin.next();
		
		System.out.println("What is the last name of the client");
		String lastName = keyin.next();
		
		System.out.println("What is the age of the client");
		int age = keyin.nextInt();
		
		Client newClient = new Client(firstName, lastName, age);
		
		for(int i = 0; i < clients.length; i++)
		{
			if (clients[i] == null)
            {
				clients[i] = newClient;
                System.out.println("Client added successfully.");
                return;
            }
			else
			continue;
			
		}
			
		
	}
	
	private static void editClient(Scanner keyin)
	{
		System.out.println("Enter the first name and last name of the client you want to edit.");
		String firstName = keyin.next();
		String lastName = keyin.next();
		
		for(int i  = 0; i < clients.length; i++)
		{
			if(clients[i] != null)
			
				if(clients[i].getFirstName().equalsIgnoreCase(firstName) && clients[i].getLastName().equalsIgnoreCase(lastName))
				{
					System.out.println("What information do you want to edit? (first name, last name, or age)");
					
					keyin.nextLine();
					
					String decision = keyin.nextLine();
					
					if(decision.equalsIgnoreCase("first name"))
					{
						System.out.println("Enter new first name.");
						String newInfo = keyin.next();
						clients[i].setFirstName(newInfo);
					}
					
					if(decision.equalsIgnoreCase("last name"))
					{
						System.out.println("Enter new last name.");
						String newInfo = keyin.next();
						clients[i].setLastName(newInfo);
					}
					
					if(decision.equalsIgnoreCase("age"))
					{
						System.out.println("Enter new first age.");
						int newInfo = keyin.nextInt();
						clients[i].setAge(newInfo);
					}
				}
			else
			System.out.println("This client does not exist.");
		}
	}
	
	private static void deleteClient(Scanner keyin)
	{
		System.out.println("What is the first name, last name, and age of the client you want to delete?");
		
		String firstName = keyin.next();
		String lastName = keyin.next();
		int age = keyin.nextInt();

		for(int i = 0; i < clients.length; i++)
		{
			if(clients[i] != null)
				if(clients[i].getFirstName().equalsIgnoreCase(firstName) && clients[i].getLastName().equalsIgnoreCase(lastName) && clients[i].getAge() == age)
					clients[i] = null;
				else
				System.out.println("This client does not exist.");
		}
	}
	
	private static void leaseVehicle(Scanner keyin)
	{
		System.out.println("What is the first name and last name of the client?"); 
		
		String firstName = keyin.next();
		String lastName = keyin.next();
		
		for(int i = 0; i < clients.length; i++)
		{
			if(clients[i] != null)
				if(clients[i].getFirstName().equalsIgnoreCase(firstName) && clients[i].getLastName().equalsIgnoreCase(lastName))
				{ 
					System.out.println("What type of vehicle do you want to lease (truck or car)");
					
					String vehicleType = keyin.next();
					
					if(vehicleType.equalsIgnoreCase("truck"))
					{
						
						System.out.println("What type of truck do you want to lease? (diesel or electric) ");
						String truckType = keyin.next();
						
						if(truckType.equalsIgnoreCase("diesel"))
						{
							System.out.println("Which diesel truck do you want to lease? (Enter make, model, and yearOfProduction)");
							
							for(int j = 0; j < dieselTrucks.length; j++)
							{
								if(dieselTrucks[j] != null)
									System.out.println(dieselTrucks[j].toString());
							}
							
							String make = keyin.next();
							String model = keyin.next();
							int yearOfProduction = keyin.nextInt();
							
							for(int j = 0; j < dieselTrucks.length; j++)
							{	if(dieselTrucks[j] != null)
									if(dieselTrucks[j].getMake().equalsIgnoreCase(make) && 
											dieselTrucks[j].getModel().equalsIgnoreCase(model) &&
											dieselTrucks[j].getYearOfProduction() == yearOfProduction)
									{
										dieselTrucks[j].setLeased("leasedBy" + firstName + lastName);
									}
									else
									System.out.println("This vehicle does not exist");
									
							}
						}
						
						if(truckType.equalsIgnoreCase("electric"))
						{
							System.out.println("Which electric truck do you want to lease? (Enter make, model, and yearOfProduction)");
							
							for(int j = 0; j < electricTrucks.length; j++)
							{
								if(electricTrucks[j] != null)
									System.out.println(electricTrucks[j].toString());
							}
							
							String make = keyin.next();
							String model = keyin.next();
							int yearOfProduction = keyin.nextInt();
							
							for(int j = 0; j < electricTrucks.length; j++)
							{
								if(electricTrucks[j] != null)
									if(electricTrucks[j].getMake().equalsIgnoreCase(make) && 
											electricTrucks[j].getModel().equalsIgnoreCase(model) &&
											electricTrucks[j].getYearOfProduction() == yearOfProduction)
									{
										electricTrucks[j].setLeased("leasedBy" + firstName + lastName);
									}
								else
								System.out.println("This vehicle does not exist.");	
							}	
						}
						
						if(vehicleType.equalsIgnoreCase("car"))
						{
							
							System.out.println("What type of car do you want to lease? (gasoline or electric) ");
							String carType = keyin.next();
							
							if(truckType.equalsIgnoreCase("gasoline"))
							{
								System.out.println("Which gasoline car do you want to lease? (Enter make, model, and yearOfProduction)");
								
								for(int j = 0; j < gasolineCars.length; j++)
								{
									if(gasolineCars[j] != null)
										System.out.println(gasolineCars[i].toString());
								}
								
								String make = keyin.next();
								String model = keyin.next();
								int yearOfProduction = keyin.nextInt();
								
								for(int j = 0; j < gasolineCars.length; j++)
								{
									if(gasolineCars[j] != null)
										if(gasolineCars[j].getMake().equalsIgnoreCase(make) && 
												gasolineCars[j].getModel().equalsIgnoreCase(model) &&
												gasolineCars[j].getYearOfProduction() == yearOfProduction)
										{
											gasolineCars[j].setLeased("leasedBy" + firstName + lastName);
										}
										else
										System.out.println("This vehicle does not exist.");
								}
								
							}
							
							if(truckType.equalsIgnoreCase("electric"))
							{
								System.out.println("Which electric car do you want to lease? (Enter make, model, and yearOfProduction)");
								
								for(int j = 0; j < electricCars.length; j++)
								{
									if(electricCars[j] != null)
										System.out.println(electricCars[j].toString());
								}
								
								String make = keyin.next();
								String model = keyin.next();
								int yearOfProduction = keyin.nextInt();
								
								for(int j = 0; j < electricCars.length; j++)
								{
									if(electricCars[j] != null)
										if(electricCars[j].getMake().equalsIgnoreCase(make) && 
												electricCars[j].getModel().equalsIgnoreCase(model) &&
												electricCars[j].getYearOfProduction() == yearOfProduction)
										{
											electricCars[j].setLeased("leasedBy" + firstName + lastName);
										}
										else
										System.out.println("This vehicle does not exist.");
								}	
							}
						}
					}
					
				}
				
			}
	}
	
	private static void returnVehicle(Scanner keyin)
	{
		System.out.println("What is the first name and last name of the client?"); 
		
		String firstName = keyin.next();
		String lastName = keyin.next();
		
		for(int i = 0; i < clients.length; i++)
		{
			if(clients[i] != null)
				if(clients[i].getFirstName().equalsIgnoreCase(firstName) && clients[i].getLastName().equalsIgnoreCase(lastName))
				{ 
					System.out.println("What type of vehicle do you want to return (truck or car)");
					
					String vehicleType = keyin.next();
					
					if(vehicleType.equalsIgnoreCase("truck"))
					{
						
						System.out.println("What type of truck do you want to return? (diesel or electric) ");
						String truckType = keyin.next();
						
						if(truckType.equalsIgnoreCase("diesel"))
						{
							System.out.println("Which diesel truck do you want to return? (Enter make, model, and yearOfProduction)");
							
							for(int j = 0; j < dieselTrucks.length; j++)
							{
								if(dieselTrucks[j] != null)
									System.out.println(dieselTrucks[j].toString());
							}
							
							String make = keyin.next();
							String model = keyin.next();
							int yearOfProduction = keyin.nextInt();
							
							for(int j = 0; j < dieselTrucks.length; j++)
							{
								if(dieselTrucks[j] != null)
									if(dieselTrucks[j].getMake().equalsIgnoreCase(make) && 
											dieselTrucks[j].getModel().equalsIgnoreCase(model) &&
											dieselTrucks[j].getYearOfProduction() == yearOfProduction)
									{
										dieselTrucks[j].setLeased("not leased");
									}
									else
									System.out.println("This vehicle does not exist.");
							}
							
						}
						
						if(truckType.equalsIgnoreCase("electric"))
						{
							System.out.println("Which electric do you want to return? (Enter make, model, and yearOfProduction)");
							
							for(int j = 0; j < electricTrucks.length; j++)
							{
								if(electricTrucks[j] != null)
									System.out.println(electricTrucks[j].toString());
							}
							
							String make = keyin.next();
							String model = keyin.next();
							int yearOfProduction = keyin.nextInt();
							
							for(int j = 0; j < electricTrucks.length; j++)
							{
								if(electricTrucks[j] != null)
									if(electricTrucks[j].getMake().equalsIgnoreCase(make) && 
											electricTrucks[j].getModel().equalsIgnoreCase(model) &&
											electricTrucks[j].getYearOfProduction() == yearOfProduction)
									{
										electricTrucks[j].setLeased("not leased");
									}
									else
									System.out.println("This vehicle does not exist.");
							}	
						}
						
						if(vehicleType.equalsIgnoreCase("car"))
						{
							
							System.out.println("What type of car do you want to return? (gasoline or electric) ");
							String carType = keyin.next();
							
							if(truckType.equalsIgnoreCase("gasoline"))
							{
								System.out.println("Which gasoline car do you want to return? (Enter make, model, and yearOfProduction)");
								
								for(int j = 0; j < gasolineCars.length; j++)
								{
									if(gasolineCars[j] != null)
										System.out.println(gasolineCars[j].toString());
								}
								
								String make = keyin.next();
								String model = keyin.next();
								int yearOfProduction = keyin.nextInt();
								
								for(int j = 0; j < gasolineCars.length; j++)
								{
									if(gasolineCars[j] != null)
										if(gasolineCars[j].getMake().equalsIgnoreCase(make) && 
												gasolineCars[j].getModel().equalsIgnoreCase(model) &&
												gasolineCars[j].getYearOfProduction() == yearOfProduction)
										{
											gasolineCars[j].setLeased("not leased");
										}
										else
										System.out.println("This vehicle does not exist.");
								}
								
							}
							
							if(truckType.equalsIgnoreCase("electric"))
							{
								System.out.println("Which electric car do you want to return (Enter make, model, and yearOfProduction)");
								
								for(int j = 0; j < electricCars.length; j++)
								{
									if(electricCars[j] != null)
										System.out.println(electricCars[j].toString());
								}
								
								String make = keyin.next();
								String model = keyin.next();
								int yearOfProduction = keyin.nextInt();
								
								for(int j = 0; j < electricCars.length; j++)
								{
									if(electricCars[j] != null)
										if(electricCars[j].getMake().equalsIgnoreCase(make) && 
												electricCars[j].getModel().equalsIgnoreCase(model) &&
												electricCars[j].getYearOfProduction() == yearOfProduction)
										{
											electricCars[j].setLeased("not leased");
										}
										else
										System.out.println("This vehicle does not exist");
								}	
							}
						}
					}	
				}	
				else
				System.out.println("This client does not exist.");
		}
	}
	
	private static void clientLeasedVehicles(Scanner keyin)
	{
		System.out.println("What is the first name and last name of the client?"); 
		
		String firstName = keyin.next();
		String lastName = keyin.next();
		
		for(int i = 0; i < dieselTrucks.length; i++)
		{
			if(dieselTrucks[i] != null)
				if(dieselTrucks[i].getLeased().equalsIgnoreCase("leasedBy" + firstName + lastName))
				{
					System.out.println(dieselTrucks[i].toString());
				}
		}
		
		for(int i = 0; i < electricTrucks.length; i++)
		{
			if(electricTrucks[i] != null)
				if(electricTrucks[i].getLeased().equalsIgnoreCase("leasedBy" + firstName + lastName))
				{
					System.out.println(electricTrucks[i].toString());
				}
		}
		
		for(int i = 0; i < gasolineCars.length; i++)
		{
			if(gasolineCars[i] != null)
				if(gasolineCars[i].getLeased().equalsIgnoreCase("leasedBy" + firstName + lastName))
				{
					System.out.println(gasolineCars[i].toString());
				}
		}
		
		for(int i = 0; i < electricCars.length; i++)
		{
			if(electricCars[i] != null)
				if(electricCars[i].getLeased().equalsIgnoreCase("leasedBy" + firstName + lastName))
				{
					System.out.println(electricCars[i].toString());
				}
		}
	}
	
	private static void allLeasedVehicles(Scanner keyin)
	{
		 
		
				for(int i = 0; i < dieselTrucks.length; i++)
					for(int j = 0; j < clients.length; j++)
					{
						if(dieselTrucks[i] != null)
							if(dieselTrucks[i].getLeased().equalsIgnoreCase("leasedBy" + clients[i].getFirstName() + clients[i].getLastName()))
							{
								System.out.println(dieselTrucks[i].toString());
								i++;
								
							}
					}
				
				for(int i = 0; i < electricTrucks.length; i++)
					for(int j = 0; j < clients.length; j++)
					{
						if(electricTrucks[i] != null)
							if(electricTrucks[i].getLeased().equalsIgnoreCase("leasedBy" + clients[i].getFirstName() + clients[i].getLastName()))
							{
								System.out.println(electricTrucks[i].toString());	
								i++;
							}
						
					}
				
				for(int i = 0; i < gasolineCars.length; i++)
					for(int j = 0; j < clients.length; j++)
					{
						if(gasolineCars[i] != null)
							if(gasolineCars[i].getLeased().equalsIgnoreCase("leasedBy" + clients[i].getFirstName() + clients[i].getLastName()))
							{
								System.out.println(gasolineCars[i].toString());
								i++;
							}
					}
				
				for(int i = 0; i < electricCars.length; i++)
					for(int j = 0; j < clients.length; j++)
					{
						if(electricCars[i] != null)
							if(electricCars[i].getLeased().equalsIgnoreCase("leasedBy" + clients[i].getFirstName() + clients[i].getLastName()))
							{
								System.out.println(electricCars[i].toString());
								i++;
							}
					}	
			}
	
	
	private static void getLargestTruck()
	{
		DieselTruck largestTruck = new DieselTruck();
		for(int i = 0; i < dieselTrucks.length ; i++)
		{	
			if(dieselTrucks[i] != null && dieselTrucks[i].getWeightCapacity() > largestCapacity)
			{	
				largestCapacity = dieselTrucks[i].getWeightCapacity();
				largestTruck = dieselTrucks[i];
			}
		}	
		System.out.println("\nLARGEST TRUCK");
		System.out.println(largestTruck);	
	}
	
	private static void copyVehicles(ElectricTruck[] electricTrucks)
	{
		ElectricTruck[] newElectricTruck = new ElectricTruck[electricTrucks.length];
		
	
			for(int i = 0; i < electricTrucks.length; i++)
			{
				if (electricTrucks[i] != null)
				newElectricTruck[i] = new ElectricTruck(electricTrucks[i]);
			}
			
			System.out.println("\nCOPIED ARRAY");
			
			for(int i = 0; i < newElectricTruck.length; i++)
			{
				if(newElectricTruck[i] != null)
				System.out.println("\n" + newElectricTruck[i].toString());
			}
		
	}
}
