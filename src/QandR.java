import java.util.Scanner;

public class QandR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter divident number:");
	    float num1=sc.nextFloat();
	    System.out.println("Enter divisor number:");
	    float num2=sc.nextFloat();
	    System.out.println("Quotient is "+(num1/num2));
	    System.out.println("Remainder is "+(num1%num2));
	}

}
