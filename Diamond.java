import java.util.Scanner;
public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		
		//ask user to enter int for diamond pattern
		System.out.print("Enter an integer for the pattern: ");
		int num = kb.nextInt();
		
		//methods for the upper and lower half of the diamond
		upperHalf(num);
		lowerHalf(num);
		
		kb.close();
	}
	
	//method for the upper half
	public static void upperHalf(int num)	{
		for (int i = 1; i <= num; i++)	{
			for (int j = i; j < num; j++)	{
				System.out.print(" ");	// prints spaces so the X line up even
			}
			//to print the X's
			for (int x = 1; x <= (2 * i - 1); x++)	{
				System.out.print("X");
			}
			//to move to the next line
			System.out.println();
		}
	}
	
	//method for the lower half
	public static void lowerHalf(int num)	{
		for (int i = num - 1; i >= 1; i--)	{
			//for the spaces
			for (int j =num; j > i; j--)	{
				System.out.print(" ");
			}
			//to print the X's
			for (int x = 1; x <= (2 * i - 1); x++)	{
				System.out.print("X");
			}
			//to go to the next line
			System.out.println();
		}
	}
	
	
	
}

