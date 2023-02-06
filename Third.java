import java.util.Scanner;

public class Third{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the subtotal and gratuity rate: ");
		double total = sc.nextDouble();
		double grate = sc.nextDouble();	
		double gratuity = (grate/100)*total;
		total += gratuity;
		System.out.println("The gratuity is $"+gratuity+" and total is $"+total);
	}
}