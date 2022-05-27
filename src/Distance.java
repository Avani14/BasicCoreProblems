import java.util.Scanner;

public class Distance {
	public static void distanceCalculation(double x, double y)
	{
		System.out.println("The distance is "+(Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2))));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x co-ordinate:");
    	double x=sc.nextDouble();
    	System.out.println("Enter y co-ordinate:");
    	double y=sc.nextDouble();
    	Distance.distanceCalculation(x, y);
	}

}
