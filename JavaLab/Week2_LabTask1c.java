package Week02;
import java.util.Scanner;
public class LabTask1c {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int rows=input.nextInt();
		for(int i=1;i<=rows;i++)
		{
			System.out.println(" ".repeat(rows-i)+"*".repeat(i));
			
		}
	}

}
