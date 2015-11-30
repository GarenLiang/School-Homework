# School-Homework
/*Creating the class*/
public class InsuredPackage extends Package{
/*Constructor to initialize the fields*/
public InsuredPackage (int weight,char shipping){
	/*calling the super constructor with weight and shipping as arguments*/
	super(weight,shipping);

	/*check the cost*/
	if(cost>0&&cost<=1){
		cost=cost+2.45;
	}
	else if(cost>1&&cost<=3){
		cost=cost+3.95;
		
	}
	else if(cost>3){
		cost=cost+5.55;
	}
}/*End of constructor*/
}/*End of class*/
