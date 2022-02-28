// Q.1] Write a Java program to perform basic Calculator operations.

import java.util.*;

class Program1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		double num1,num2;
		System.out.print("\nEnter first number : ");
		num1 = sc.nextDouble();
		System.out.print("Enter second number : ");
		num2 = sc.nextDouble();
		
		int ch = 0;
		do
		{
			System.out.println("\n__________OPERATIONS__________");
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Modulus");
			System.out.println("6. Exit");
			System.out.println("______________________________");
			System.out.print("\nWhich operation you want to perform? ");
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:
					System.out.println("Addition = " + (num1 + num2));
					break;
				
				case 2:
					System.out.println("Substraction = " + (num1 - num2));
					break;
					
				case 3:
					System.out.println("Multiplication = " + (num1 * num2));
					break;
					
				case 4:
					System.out.println("Division = " + (num1 / num2));
					break;
					
				case 5:
					System.out.println("Modulus = " + (num1 % num2));
					break;
					
				case 6:
					System.out.println("Exited");
					break;
				
				default:
					System.out.println("Not a valid operation, please select correct operation number");
					break;
			}
		}while(ch != 6);
	}
}