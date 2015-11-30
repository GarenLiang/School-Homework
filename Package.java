# School-Homework
public class Package {
          int weight;
          char shipping;
          double cost;
          public Package(int weight,char shipping){
        	  super();
        	  this.weight=weight;
        	  this.shipping=shipping;
        	  calculateCost();
          }
    private void calculateCost(){
    	if(weight>=1&&weight<=8){
    		if(shipping=='A'||shipping=='a'){
    			cost=2.00;
    		
    		}
    		else if (shipping=='T'||shipping=='t'){
    			cost=1.50;
    	}
    }
    	else if (weight>=9&&weight<=16){
    		if(shipping=='A'||shipping=='a'){
    			cost=3.00;
    		
    		}
    		else if (shipping=='T'||shipping=='t'){
    			cost=2.35;
    	}
    		else if (shipping=='M'||shipping=='m'){
    			cost=1.50;
}
    	}
    	else if (weight>=17){
    		if(shipping=='A'||shipping=='a'){
    			cost=4.50;
    		
    		}
    		else if (shipping=='T'||shipping=='t'){
    			cost=3.25;
    	}
    		else if (shipping=='M'||shipping=='m'){
    			cost=2.15;
    	}
    	}
    }
    public void display()
    {
    	System.out.println("Cost of your products shipping is:"+cost);
    }
}
