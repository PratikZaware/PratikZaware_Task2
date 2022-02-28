// Q.7] Write a Java Program to reverse the letters present in the given String.

import java.util.*;

class Program7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String inputStr;
		System.out.print("\nEnter the string : ");
		inputStr = sc.nextLine();
		
		String reverseStr = "";
		//reversing each letter in inputStr & storing it in reverseStr
		for(int i=inputStr.length()-1; i>=0; i--)
		{
			reverseStr = reverseStr + inputStr.charAt(i);
		}
		
		System.out.println("\nReverse string = " + reverseStr);
	}
}