package Week02;
import java.util.Scanner;

public class LabTask1b {
	public static void main(String[] args)
	{
		System.out.print("Enter the number of rows");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		for(int i=1; i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
}
