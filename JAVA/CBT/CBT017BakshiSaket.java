import java.util.Scanner;

public class CBT017BakshiSaket
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);

		int age = 22;
		boolean onGuestList = false;
		double attractiveness = 7.5;
		String gender = "F";

		if(onGuestList || age>=21 || (gender.equals("F") && attractiveness >=8))
		{
			System.out.println("You are allowed to enter the club.");
		}
		else
		{
			System.out.println("You are not allowed to enter the club.");
		}
	}
}