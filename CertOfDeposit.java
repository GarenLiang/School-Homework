
import java.time.LocalDate;
public class CertOfDeposit {


		//variables
	    private int certificateNumber;
		private String lastName;
		private double balance;
		private LocalDate issueDate;
		private LocalDate maturityDate;
		
        //Constructors
		
		
		public CertOfDeposit(int certificateNumber2,String lastName2,double balance2,LocalDate issueDate2){
			certificateNumber=certificateNumber2;
			lastName=lastName2;
			balance=balance2;
			issueDate=issueDate2;	
			this.maturityDate=LocalDate.of(issueDate.getYear()+1,issueDate.getMonth(),issueDate.getDayOfMonth());
		}
		
		
		//methods
		public int getCertificateNumber(){
		return certificateNumber;
		}
		public void setCertificateNumber(int newNumber){
			certificateNumber=newNumber;
		}
		public String getLastName(){
			return lastName;
			
		}
		public void setLastName(String newName){
			lastName=newName;
		}
        public double getBalance(){
        	return balance;
        }
        public void setBalance(int newBalance){
        	balance=newBalance;
        }
        public LocalDate getIssueDate(){
        	return issueDate;
        }
        public void setIssueDate(LocalDate newDate){
        	issueDate=newDate;
        }
        public LocalDate getMaturityDate(){
        	return maturityDate;
        }
        public void setMaturityDate(LocalDate newMDate){
        	maturityDate=newMDate;
        	
        }
       
         
}
