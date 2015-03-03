//	MCCLogin_Client_Side_Services by Kyle Wolff and Brandon VanderMey on 3/2/2015

public class MCCLogin_Client_Side_Services 
{
	//	Needs variables userName, password, firstName, lastName.  This is for issue #4 which is your part.
	//	For the sake of seeing no errors, I will declare the variables and you do the set and gets.
	private String firstName;
	private String lastName;
	private StringBuilder username;
	private StringBuilder password;
	private StringBuilder message;
	private int studentNumber;
	
	
	
	
	//	I added set and get methods for the username and password just incase we want to use them by themselves.  
	//	Otherwise, they would just be buried into the "message" variable.
	public StringBuilder getUserName()
	{
		return username;
	}
	
	public void setUserName()
	{
		username = new StringBuilder();

		username.append(firstName.toLowerCase());
		username.append(lastName.toLowerCase());
		
		//	First parameter is the index number to where it inserts the string.  length() gives us the number of elements in firstName.
		//	Since indexes start at 0, we don't need to increment the first parameter.
		username.insert(firstName.length(), ".");
		
	}
	
	public StringBuilder getPassword()
	{
		return password;
	}
	
	public void setPassword()
	{
		password = new StringBuilder();
		
		password.append(firstName.toLowerCase().charAt(0));
		password.append(lastName.toLowerCase().charAt(0));
		password.append(studentNumber);
		password.append("!");
	}
	
	public StringBuilder getMessage()
	{
		message = new StringBuilder();
		
		message.append("Your user name is ");
		message.append(username);
		message.append(" and your password is ");
		message.append(password);
		
		return message;
	}
}
