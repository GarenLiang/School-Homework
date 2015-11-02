
import java.util.Scanner;
import java.time.LocalDate;

public class TestCertOfDeposit {
   public static CertOfDeposit getNewCertOfDeposit(){
       Scanner input= new Scanner(System.in);
       System.out.print("Enter Certificate Number: ");
       int num = input.nextInt();
       System.out.print("Enter Last Name: ");
       String name = input.next();
       System.out.print("Enter Balance: ");
       double balance = input.nextDouble();
       System.out.print("Enter Date: ");
       int dayOfMonth = input.nextInt();
       System.out.print("Enter Month: ");
       int month = input.nextInt();
       System.out.print("Enter Year: ");
       int year = input.nextInt();
       return new CertOfDeposit(num, name, balance, LocalDate.of(year, month, dayOfMonth));
   }
   public static void displayInformation(CertOfDeposit a){
       System.out.println("Certificate Number: " + a.getCertificateNumber());
       System.out.println("Name: " + a.getLastName());
       System.out.println("Balance: " + a.getBalance());
       System.out.println("Issue Date: " + a.getIssueDate());
       System.out.println("Maturity Date: " + a.getMaturityDate());
   }

   
  
   public static void main(String args[]){
       CertOfDeposit a1 = getNewCertOfDeposit(), a2 = getNewCertOfDeposit();
       System.out.println("First CertOfDeposit");
       displayInformation(a1);
       System.out.println();
       System.out.print("Second CertOfDeposit");
       displayInformation(a2);
       System.out.println();
   }
}
