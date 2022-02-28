// Q.3] Write a Java program to calculate a Factorial of a number.

import java.util.*;

class Program3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("\nEnter the number : ");
		num = sc.nextInt();
		
		int fact=1;
		for(int i=1; i<=num; i++)
		{
			fact = fact * i;
		}
		
		System.out.println("\nFactorial of " + num + " = " + fact);
	}
}