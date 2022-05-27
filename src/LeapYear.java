import java.util.Scanner;


public class LeapYear {
	public static void leapYear(int n)
	{
		if(n%4==0)
		{
			if(n%100==0)
			{
				if(n%400==0)
				{
					System.out.println("Year is a leap year");
				}
			}
			else {
				System.out.println("Year is a leap year");
			}
		}
		else
		{
			System.out.println("Year is not a leap year");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the year to check if it is a leap year or not");
		int n = sc.nextInt();
		if(n<1000 || n>9999)
		{
			System.out.println("Please enter a number of 4 digits");
		}
		else
		{
			LeapYear.leapYear(n);
		}
	}

}
