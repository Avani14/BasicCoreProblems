import java.util.*;

public class FlipAcoin {
	public static void flipCoin(int n)
	{
		float num ;
		int temp = n;
		int tailsCount=0;
		int headsCount = 0;
		while(n>0)
		{
			num = (float)(Math.random());
		
			if(num < 0.5)
			{
				tailsCount++;
			}
			else
			{
				headsCount++;
			}
			n--;
		}
		System.out.println("The winner is :"+(tailsCount>headsCount?" Tails ":" Heads"));
		float tailsPercent = ((float)tailsCount/temp)*100;
		float headsPercent = ((float)headsCount/temp)*100;
		System.out.println("Percent of tails is : "+tailsPercent+"% and percent of heads is : "+headsPercent+"%");

		}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of times you want to flip a coin");
	int times = sc.nextInt();
	FlipAcoin.flipCoin(times);
}
}
