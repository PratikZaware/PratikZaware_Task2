// Q.4] Write a Java program to find out whether the given String is Palindrome or not.

import java.util.*;
import java.lang.*;

class Program4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String inputString;
		System.out.print("\nEnter the string : ");
		inputString = sc.nextLine();
		
		//converting String class string into StringBuilder class string, bcz StringBuilder class has built-in method reverse()
		//to reverse a string.
		StringBuilder tempString = new StringBuilder(inputString);
		tempString.reverse();
		
		String reverseString = new String(tempString);
		
		if(inputString.equals(reverseString))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
	}
}