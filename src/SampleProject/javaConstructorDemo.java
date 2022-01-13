package SampleProject;

public class javaConstructorDemo {
	
	private String Name ;
	private String Designation;
	
	public javaConstructorDemo(String Name,String Designation)
	{
		this.Name = Name;
		this.Designation = Designation;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		javaConstructorDemo jcd = new javaConstructorDemo("Shalini", " Salesforce Tester");
		System.out.println("Details: " +jcd.Name +  jcd.Designation);
		
	}

}
