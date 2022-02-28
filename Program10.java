// Q.10] Write a Java Program to find the Transpose of a given Matrix.

import java.util.*;

class Program10
{
	public static void scanMatrix(int mat[][])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter elements for " + mat.length + "X" + mat[0].length + " matrix");
		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat[i].length; j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
	}
	
	public static void printMatrix(int mat[][])
	{
		for(int x[] : mat)
		{
			for(int y : x)
			{
				System.out.print(" "+y);
			}
			System.out.println();
		}
	}
	
	public static void transposeMatrix(int mat[][], int trans[][])
	{
		//NOTE:- for transpose of matrix, rows & columns are interchanged
		for(int i=0; i<mat.length; i++)
		{
			for(int j=0; j<mat[i].length; j++)
			{
				trans[j][i] = mat[i][j];
			}
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int row, col;
		System.out.print("\nEnter rows and columns : ");
		row = sc.nextInt();
		col = sc.nextInt();
		
		//creating matrix
		int mat[][] = new int[row][col];
		int trans[][] = new int[col][row]; 
		
		scanMatrix(mat);
		
		System.out.println("\nOriginal Matrix");
		printMatrix(mat);
		
		//findig transpose of givem matrix
		transposeMatrix(mat, trans);
		
		System.out.println("\nTranspose Matrix");
		printMatrix(trans);
	}
}