import java.util.Scanner;

public class Quadratic {
	public static void rootCalculation1(double a,double b,double c)
	{
		double d =b * b - 4 * a * c;
		double root1 = ((-b + d)/(2*a));
		double root2 = ((-b - d)/(2*a));
		System.out.print("The two roots of equation are :"+root1+" and "+root2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of a b and c for equation a*x*x + b*x + c");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		Quadratic.rootCalculation1(a, b, c);
	}

}
