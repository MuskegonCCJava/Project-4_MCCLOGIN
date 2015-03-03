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
	private int studentID;
	
	
	
	
	//	I added set and get methods for the username and password just incase we want to use them by themselves.  
	//	Otherwise, they would just be burried into the "message" variable.
	public StringBuilder getUserName()
	{
		return username;
	}
	
	public void setUserName()
	{
		username = new StringBuilder();

		//	I don't know if this is how she wants it done.  What I did was use a StringBuilder method, and in 
		//	the parameters, I concatenated the whole thing.  Maybe we should do something like:
		//	username.append(firstName.toLowerCase());
		//	username.append(".");
		//	username.append(lastName.toLowerCase());
		//	
		//	Instead of the code below (same with setting the password and message):
		username.append(firstName.toLowerCase() + "." + lastName.toLowerCase());
	}
	
	public StringBuilder getPassword()
	{
		return password;
	}
	
	public void setPassword()
	{
		password = new StringBuilder();
		
		password.append(firstName.toLowerCase().charAt(0) + lastName.toLowerCase().charAt(0) + studentID + "!");
	}
	
	public StringBuilder getMessage()
	{
		message.append("Your user name is " + username + " and your password is " + password);
		
		return message;
	}
}
