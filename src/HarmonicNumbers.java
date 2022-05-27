import java.util.Scanner;

public class HarmonicNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
        double num=sc.nextDouble();
        double ans = 0.0;
        for(int i = 1;i<num;i++)
        {
        	ans+=(1.0/i);
        }
        System.out.println(num+"th Harmonic value is : "+ans);
	}

}
