# School-Homework
/* creating class*/
public class UsePackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Main method*/
		/*initializing Year Package with the different package argument*/
		Package pack=new Package(3,'a');
		pack.display();/*displaying the result*/
		Package pack1=new Package(15,'t');
		pack1.display();/*displaying the result*/
		Package pack2=new Package(20,'m');
		pack2.display();/*displaying the result*/
		/*initializing Year InsurePackage with the different package argument*/
		InsuredPackage ipack=new InsuredPackage(3,'a');
		ipack.display();/*displaying the result*/
		InsuredPackage ipack1=new InsuredPackage(15,'t');
		ipack1.display();/*displaying the result*/
		InsuredPackage ipack2=new InsuredPackage(20,'m');
		ipack2.display();/*displaying the result*/
	}/*End of main method*/

}/*End of class*/
