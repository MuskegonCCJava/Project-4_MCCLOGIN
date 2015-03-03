/*MCCLogin_Client_Side_Services by Kyle Wolff 3/2/2015*/


public class MCCLogin_Client_Side_Services {

	private String firstName; 
	private String lastName;
	private int studentNumber; 
	
	public MCCLogin_Client_Side_Services(){
		
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
	public void setlastName(String Lirst_Name){
		
		lastName = Lirst_Name;
	}
	public int getStudentNumber() {
		
		return studentNumber;
	}
	public void setStudentNumber(int Student_Number) {
		
		studentNumber = Student_Number;
	}
}
