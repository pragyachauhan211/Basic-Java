package basicProgram;

public class armstrong {
	
	public void cube()
	{

int number = 234, originalNumber, remainder, result = 0;

originalNumber = number;

while (originalNumber != 0)
{
    remainder = originalNumber % 10;
    result = (int) (result+Math.pow(remainder, 3));
    originalNumber = originalNumber/ 10;
   
}

if(result == number)
    System.out.println(number + " is an Armstrong number.");
else
    System.out.println(number + " is not an Armstrong number.");

	}

	public static void main(String[] args) {
		
		armstrong p = new armstrong();
		p.cube();

	}

}
