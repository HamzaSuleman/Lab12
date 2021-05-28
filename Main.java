package lab12;

//Performed by 2019-SE-114

import java.util.Scanner;

public class Main 
{
	public static void main(String args[])
	{
		
		System.out.print("\n Exception Handling: ");
		System.out.print("\n -------------------\n\n");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		int Array[] = new int[10];
		
		for(int i = 0; i < Array.length; i++)
		{
			int element = (int)(1+Math.random()* 9);
			Array[i] = element;
		}
		
		for(int i = 0; i < Array.length; i++)
		{
			System.out.println(" "+(i+1)+". Array["+i+"]: "+Array[i]);
		}
		
		try {
			
		System.out.print("\n Enter index to Search: ");
		int search = in.nextInt();
		
		System.out.print("\n Element at index "+search+" =  "+Array[search]);
		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.print("\n  Index is out of bounds ");
		}
	
	}
}

