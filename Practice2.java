package basicProgram;
import java.util.Scanner;

public class Practice2 {
	
	@SuppressWarnings("unused")
	private Scanner s1;
	
	public void sorting()
	{
		int n, count = 0, a, b, c, sum = 0;

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		System.out.print("Enter any integer you want to check:");

		n = s.nextInt();

		a = n;

		c = n;

		while(a > 0)

		{

		a = a / 10;

		count++;

		}

		while(n > 0)

		{

		b = n % 10;

		sum = (int) (sum+Math.pow(b, count));

		n = n / 10;

		}

		if(sum == c)

		{

		System.out.println("Given number is Armstrong");

		}

		else

		{

		System.out.println("Given number is not Armstrong");

		}

		}
	

	public static void main(String[] args) {
		Practice2 p = new Practice2();
		p.sorting();

	}

}
