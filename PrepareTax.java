import java.util.Scanner;

public class PrepareTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create object for Scanner
		Scanner input=new Scanner(System.in);
		//prompt user of social security number
		System.out.print("Enter the soical security number in the format of 999-99-9999:");
		String ssn=input.next();
		/*verify valid or invalid*/
		while(!isValidNumber(ssn)){
			System.out.print("Enter the valid social security number:");
			ssn=input.next();
			
		}//end while
		//prompt the user of the last name
		System.out.print("Enter the last name:");
		String last=input.next();
		//prompt the user of the first name
		System.out.print("Enter the first name:");
		String first=input.next();
		//prompt the user of street name
		System.out.print("Enter the street name:");
		String strt=input.next();
		//prompt the user of city name
		System.out.print("Enter the city name:");
		String cty=input.next();
		//prompt the state name
		System.out.print("Enter the state name:");
		String st=input.next();
		//prompt the Zip code
		System.out.print("Enter the zip code:");
		int zipCode=input.nextInt();
		//verify the zip code
		while(zipCode<10000||zipCode>99999){
			System.out.print("Enter the valid zip code:");
			zipCode=input.nextInt();
		}//end while
		System.out.print("Enter the annual income:$");
		double income=input.nextDouble();
		//verify annual income
		while(income<0){
			System.out.print("Enter the valid annual income:$");
			income=input.nextDouble();
		}//end while
		//prompt the user for the marital status
		System.out.print("Enter the marital status:");
		char ms=input.next().charAt(0);
		//verify marital status
		while(ms!='S'&&ms!='s'&&ms!='M'&&ms!='m'){
			System.out.print("Enter the valid marital status:");
			ms=input.next().charAt(0);
		}//end while
		//create object for TaxReturn class
		TaxReturn tr=new TaxReturn(ssn,last,first,strt,cty,st,zipCode,income,ms);
		//call to displayData method
		tr.displayData();
	}//end of main method
	//isValidNumber
	private static boolean isValidNumber(String ssn){
		//verify the length
		if(ssn.length()!=11)
			return false;
		else{
			/*repeat loop*/
			for(int i=0;i<ssn.length();i++){
				/*return false if the character'-’is not at the proper place*/
				if((i==3||i==6)&&ssn.charAt(i)!='-')
					return false;
				/*return false if any of the character in not the digit*/
				if(i!=3&&i!=6&&!Character.isDigit(ssn.charAt(i)))
					return false;
			}//end
		//return true if the number is valid
			return true;
		}//end if/else
	}//end isValidNumber method
}//end of PreTax class
