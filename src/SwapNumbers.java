import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
	    int num1=sc.nextInt();
	    System.out.println("Enter second number:");
	    int num2=sc.nextInt();
	    System.out.println("Before swapping the numbers, number 1 is: "+num1+" and number 2 is: "+num2);
	    int temp;
	    temp = num1;
	    num1 = num2;
	    num2 = temp;

	    System.out.println("After swapping the numbers, number 1 is: "+num1+" and number 2 is: "+num2);
	    
	}

}
