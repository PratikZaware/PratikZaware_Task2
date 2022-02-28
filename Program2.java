// Q.2] Write a Java program to calculate Fibonacci Series up to n numbers.

import java.util.*;

class Program2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("\nEnter the number : ");
		num = sc.nextInt();
		
		System.out.println("\nFibonacci Series");
		int t1=0, t2=1, t3=0;
		for(int i=0; i<=num; i++)
		{
			System.out.print("  " + t1);
			t3 = t1 + t2;
			t1 = t2;
			t2 = t3;
		}
		System.out.println();
	}
}