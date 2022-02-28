// Q.5] Write a Java program to calculate Permutation and Combination of 2 numbers.

import java.util.*;

class Program5
{
	//recursive function to find factorial of a number
	public static int fact(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		else
		{
			return n * fact(n-1);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n, r;
		//Note- for permutation & combination (n > r)
		do
		{
			System.out.print("\nEnter first number  : ");
			n = sc.nextInt();
			System.out.print("Enter second number : ");
			r = sc.nextInt();
			if(n < r)
			{
				System.out.println("second nummber must be smaller than first");
			}
		}while(n < r);
		
		int p, c;
		p = fact(n) / fact(n-r);
		c = fact(n) / (fact(r)*fact(n-r));
		
		System.out.println("\nPermutation = " + p);
		System.out.println("\nCombination = " + c);
	}
}