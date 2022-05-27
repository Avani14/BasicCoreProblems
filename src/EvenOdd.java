import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
	    int num=sc.nextInt();
	    if(num%2 == 0)
	    {
	    	System.out.println("The number "+num+" is even");
	    }
	    else
	    {
	    	System.out.println("The number "+num+" is odd");
	    }
	}

}
