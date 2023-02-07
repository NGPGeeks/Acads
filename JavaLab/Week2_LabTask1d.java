package week2;

import java.util.Scanner;

public class Task1d {
    public  static void main(String[] args)
    {
        int rows;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        rows = scan.nextInt();
        for (int i = 1; i <= rows; i++)
        {
            System.out.println(" ".repeat(rows - i) + "*".repeat(2*i-1));
        }

    }
}
