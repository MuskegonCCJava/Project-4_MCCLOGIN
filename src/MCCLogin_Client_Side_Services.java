import java.net.URI;
import java.net.URISyntaxException;

//	MCCLogin_Client_Side_Services by Kyle Wolff and Brandon VanderMey on 3/2/2015


public class MCCLogin_Client_Side_Services {

	private String firstName; 
	private String lastName;
	private int studentNumber;
	private StringBuilder username;
	private StringBuilder password;
	private StringBuilder message;
	
	final URI uri = new URI("https://mymcc.muskegoncc.edu/CookieAuth.dll?GetLogon?curl=Z2F&reason=0&formdir=1");
	
	public MCCLogin_Client_Side_Services() throws URISyntaxException {
		
		firstName = "MCC";
		lastName = "Login";
		studentNumber = 99999;
	}
	
	public String getfirstName(){
		
		return firstName;
	}
	public void setfirstName(String First_Name){
		
		firstName = First_Name;
	}
	public String getlastName(){
		
		return lastName;
	}
	public void setlastName(String Last_Name){
		
		lastName = Last_Name;
	}
	public int getStudentNumber() {
		
		return studentNumber;
	}
	public void setStudentNumber(int Student_Number) {
		
		studentNumber = Student_Number;
	}
	
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
