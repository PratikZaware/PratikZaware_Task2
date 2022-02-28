// Q.9] Write a Java program to remove elements from an ArrayList.

import java.util.*;

class Program9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
        ArrayList<Integer> myList = new ArrayList<>();
 
        // Adding elements to ArrayList
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(1);
        myList.add(2);
 
        System.out.println("\nArrayList before removing elements");
        System.out.println(myList);
 
        myList.remove(1);			//removes element at index 1. (20)
		//after removing 20, remaining elements will be shifted towards left.
		
        myList.remove(1);			//removes 30		
 
        System.out.println("\nArrayList after removing 2 elements");
        System.out.println(myList);
    }
}