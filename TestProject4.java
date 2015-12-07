import java.util.Date;
//Main Class
public class Test {
//Main Class
public static void main (String[] args) {
//create an account object with Id of 1122 and balance of $20000
Account account = new Account(1122, 20000);
//set annual interest rate of 4.5
account.setAnnualInterestRate(4.5);
//Withdraw Method method $2500  
account.withdraw(2500);
//deposit method is used to deposit $3000 
account.deposit(3000);
//Display the outcome
System.out.println("The balance is " + account.getBalance());

System.out.println("The monthly interest is " + account.getMonthlyInterestRate());

System.out.println("The account was created at " + account.getDateCreated());

}

}
//Create Class
class Account {
// Variables
   private int id;
   private double balance;
   private double annualInterestRate;
   private Date dateCreated;
  //Constructor
   Account()
   {   //A private Int data field name id for account,default value with 0
       this.id = 0;
       //A private double data filed name balance for the account
       this.balance = 0.0;
       //A private annualInterestRate that store the current interest rate,default value with 0
       this.annualInterestRate = 0.0;
       //A private Date data dateCreated that store the date when the account was created
       this.dateCreated = new Date();
   }
   //Parameterized the Constructor,A constructor that creates an account with id and initial balance
   
   public Account(int id, double balance) {
       super();
       this.id = id;
       this.balance = balance;
       this.dateCreated = new Date();
   }
  //Get method for Id
   public int getId() {
       return id;
   }
  //Set method for Id
   public void setId(int id) {
       this.id = id;
   }
  //Get method for balance
   public double getBalance() {
       return balance;
   }
  //Set method for balance
   public void setBalance(double balance) {
       this.balance = balance;
   }
  //Get method for AnnualInterestRate
   public double getAnnualInterestRate() {
       return annualInterestRate;
   }
  //Set method for AmnualInterstRate
   public void setAnnualInterestRate(double annualInterestRate) {
       this.annualInterestRate = annualInterestRate;
   }
  //The Get method for dateCreated
   public Date getDateCreated() {
       return dateCreated;
   }
  //Method that return the monthly interest rate
   public double getMonthlyInterestRate()
   {
       return this.annualInterestRate / 12;
   }
  //A method that a specified amount from the account 
   public void withdraw(double amount)
   {
       this.balance = this.balance - amount;
   }
  //A Method that deposits a specified amount to the account
   public void deposit(double amount)
   {
       this.balance = this.balance + amount;
   }
}
