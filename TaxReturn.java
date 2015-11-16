//TaxReturn class
public class TaxReturn {
//data fields
	private String sSN;
	private String lastName;
	private String firstName;
	private String street;
	private String city;
	private String state;
	private int zip;
	private double annualIncome;
	private char maritalStatus;
	private double taxLiability;
	//parameterized constructor
	public TaxReturn(String sSN,String lastName,String firstName,String street,String city,String state,int zip,double annualIncome,char maritalStatus){
		this.sSN=sSN;
		this.lastName=lastName;
		this.firstName=firstName;
		this.street=street;
		this.city=city;
		this.state=state;
		this.zip=zip;
		this.annualIncome=annualIncome;
		this.maritalStatus=maritalStatus;
		//call to calculate TaxLiability method
		 taxLiability=calculateTaxLiability();
	}//end constructor
	
	//displayData method implementation
	public void displayData(){
		System.out.println("The details of the taxpayer: ");
		System.out.println("Social Security Number: "+sSN);
		System.out.println("Last Name: "+lastName);
		System.out.println("First Name: "+firstName);
		System.out.println("Street: "+street);
		System.out.println("City: "+city);
		System.out.println("State: "+state);
		System.out.println("Zip: "+zip);
		System.out.println("Annual Income:$"+annualIncome);
		if(maritalStatus=='S'||maritalStatus=='s')
			System.out.println("Marital Status:Single");
		else
			System.out.println("Marital Status:Married");
		System.out.println("Tax liability:$"+taxLiability);
	}//end display data method
	private double calculateTaxLiability()
	{
		//verify whether the annualIncome<=20000
		if(annualIncome<=20000)
		{
			//verify whether maritialStatus is Single
			if(maritalStatus=='S'||maritalStatus=='s')
				return annualIncome*0.15;
			else
				return annualIncome*0.14;
			
		}
		//verify whether the annualIncome <=50000
		else if(annualIncome<=50000)
		{
			//verify whether maritalStatus is Single
			if(maritalStatus=='S'||maritalStatus=='s')
				return annualIncome*0.22;
			else
				return annualIncome*0.20;
		}
		//if the annualIncome>50000
		else
		{
			//verify whether maritalStatus is Single
			if(maritalStatus=='S'||maritalStatus=='s')
				return annualIncome*0.30;
			else
				return annualIncome*0.28;
		}//end if/else
	}//end calculate TaxLiability method
}//end TaxReturn class
