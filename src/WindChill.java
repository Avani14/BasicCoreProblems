import java.util.Scanner;

public class WindChill {
	public static void effectiveTemp(double t,double v)
	{
		if(t>50 || v > 120 || v<3)
		{
			System.out.println("The formula is not valid in these conditions we may assume that the answer is in that range");
		}
		double w = 35.74+0.6215*t+(0.4275*t-37.75)*Math.pow(v, 0.16);
		System.out.println("The effective temperature is "+w);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of t");
		double t = sc.nextDouble();
		System.out.println("Enter the value of v");
		double v = sc.nextDouble();
		WindChill.effectiveTemp(t, v);
	}

}
