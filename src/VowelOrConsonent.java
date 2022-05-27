import java.util.Scanner;

public class VowelOrConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = new String();
		System.out.println("Enter an alphabet:");
	    s=sc.next();
	    String str = new String();
	    str = s.toLowerCase();
	    if(str.equals("a")|| str.equals("e") || str.equals("i")|| str.equals("o")||str.equals("u"))
	    {
	    	System.out.println("The alphabet is vowel");
	    }
	    else
	    {
	    	System.out.println("The alphabet is consonent");
	    }
	}

}
