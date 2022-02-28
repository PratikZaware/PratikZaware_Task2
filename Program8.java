// Q.8] Write a Java Program to check whether the given array is Mirror Inverse or not.

import java.util.*;

class Program8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("\nHow many elements? ");
		n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("\nEnter array elements");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		//check if array is mirror-inverse or not
		int flag = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			//at any point if the condition fails, then array is not mirror-inverse
			if (arr[arr[i]] != i)
			{
				flag = 1; 
				break;
			}
		}
		
		if (flag == 0)
			System.out.println("YES, given array is Mirror Inverse");
		else
			System.out.println("No, given array is not Mirror Inverse");
	}
}
