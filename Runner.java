package lab12;

import java.util.*;

public class Runner 
{
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
	
		System.out.print("\n Division Game: ");
		System.out.print("\n --------------\n");
		
		try 
		{
			System.out.print("\n Enter 1st Integer: ");
			int one = in.nextInt();
		
			System.out.print(" Enter 2nd Integer: ");
			int two = in.nextInt();
		
			if(one == 0 || two == 0)
			{
				throw new ArithmeticException();
			}	
			else
			{
				int result = one/two;
				System.out.print("\n Division Result: "+result);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.print("\n Can't take input as 0");
		}
		catch(InputMismatchException e)
		{
			System.out.print("\n input is invalid, only Integers can be input.");
		}
		
		System.out.print("\n\n Game is Finished..");
	}
}
