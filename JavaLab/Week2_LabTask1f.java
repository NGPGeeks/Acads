 package week2;

import java.util.Scanner;

public class Task1f
{
    public  static void main(String[] args)
    {
        int rows;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        rows = scan.nextInt();
        for (int i = 1; i <= rows; i++)
        {
            System.out.print(" ".repeat(rows - i));
            for (int k = i; k >= 1; k--)
            {
                System.out.print(k);
            }
            for (int j = 2; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
