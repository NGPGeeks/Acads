import java.util.*;
public class Sixth{
	public static void main(String[] args){
		double x, y, dist;
		final double RADIUS = 10;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		dist = Math.pow((x*x + y*y), 0.5);
		if(dist<RADIUS){
			System.out.println("Point is in the circle");
		}
		else{
			System.out.println("Point is not in the circle");
		}
	}
}