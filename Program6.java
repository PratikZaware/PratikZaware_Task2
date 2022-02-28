// Q.6] Write a program in Java to print Diamond Pattern.

import java.util.*;

class Program6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int row;
		System.out.print("\nEnter the number of rows in pattern : ");
		row = sc.nextInt();
			
		System.out.println();
		
		//to print first half of pattern
		for(int i=1; i<=row; i++)
		{
			for(int s=i; s<=(row-1); s++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print('*');
			}
			for(int k=(i-1); k>=1; k--)
			{
				System.out.print('*');
			}
			System.out.println();				//for new line
		}
		//to print remaining half of pattern
		for(int i=(row-1); i>=1; i--)
		{
			for(int s=(row-1); s>=i; s--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print('*');
			}
			for(int k=(i-1); k>=1; k--)
			{
				System.out.print('*');
			}
			System.out.println();				//for new line
		}		
	}
}