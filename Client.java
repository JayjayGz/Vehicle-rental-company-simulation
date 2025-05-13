package clientRelated;

public class Client 
{
	private String firstName;
	private String lastName;
	private int age;
	static public int count = 0;;
	
	//default constructor
	public Client()
	{
		this.firstName = "";
		this.lastName = "";
		this.age = 0;
		++count;
	}
	
	//parameterized constructor
	public Client(String firstName, String lastName, int age)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		++count;
	}
	
	//copy constructor
	public Client(Client otherClient)
	{
		this.firstName = otherClient.firstName;
		this.lastName = otherClient.lastName;
		this.age = otherClient.age;
		++count;
	}
	
	//setter first name
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	//getter first name
	public String getFirstName()
	{
		return(this.firstName);
	}
	
	//setter last name
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	//getter last name
	public String getLastName()
	{
		return(this.lastName);
	}
	
	//setter months of subscription
	public void setAge(int age)
	{
		this.age = age;
	}
	
	//getter months of subscription
	public int getAge()
	{
		return(this.age);
	}
	
	//toString method
	public String toString()
	{
		return("\nCLIENT # "+ count+ "\nClient first name: " + firstName + "\nClient last name: " + lastName + "\nClient age: " + age);
	}
	
	//equals method
	public boolean equals(Object otherObject)
	{
		if(otherObject == null)
			return(false);
		else if (getClass() != otherObject.getClass())
			return(false);
		else 
		{
			Client otherClient = (Client)otherObject;
			return(firstName.equalsIgnoreCase(otherClient.firstName) && lastName.equalsIgnoreCase(otherClient.lastName) && age == otherClient.age);
		}
		
	}

}                         
