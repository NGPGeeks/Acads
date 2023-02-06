import java.util.Scanner;

public class Fourth{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num between 0 and 1000: ");	
		int num = sc.nextInt();
		int digit;
		int sum = 0;
		while(num !=0){
			digit = num%10;
			sum += digit;
			num = num/10;
		}
		System.out.println("Sum of digits: "+sum);
	}
}