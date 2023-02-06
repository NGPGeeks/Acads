
public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int popu = 312032486; 
		int yearSec = 365*24*60*60;
		int births = yearSec/7;
		int death = yearSec/13;
		int immi = yearSec/45;
		
		for(int i=0; i<5; i++) {
			popu = popu+births-death+immi;
			System.out.println("Population after "+(i+1)+" year: "+popu);	
		}
	}

}
