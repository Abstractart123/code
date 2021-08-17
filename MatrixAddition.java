package unit7;
import java.util.Scanner;
public class MatrixAddition 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int rows, cols, choice; 
		System.out.println("How many rows in each matrx?");
		rows = sc.nextInt();
		System.out.println("How many columns in each matrx?");
		cols = sc.nextInt();
		int matA[][] = new int[rows][cols];
		int matB[][] = new int[rows][cols];
		
		for(int i = 0; i < rows; i++)
		{
			for (int j = 0; j<cols; j++)
			{
				System.out.print("Enter value in matrix A" + (i+1) + ", "+ (j+1));
				matA[1][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < rows; i++)
		{
			for (int j = 0; j<cols; j++)
			{
				System.out.print("Enter value in matrix A" + (i+1) + ", "+ (j+1));
				matB[1][j] = sc.nextInt();
			}
		}
	System.out.println("Matrix A: " );
	printGrid(matA);
;	System.out.println("\n\n Matrix B: " );
	printGrid(matB);
	System.out.println("Do you want to \n1. add\n2. or subtract?\n");
	choice = sc.nextInt();
	if(choice == 2)
	{
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
			{
				matB[i][j] *= -1; 
			}
		}
	}
	
	
		
	}

	
	public static void printGrid(int grid[][])
	{
		for(int i = 0; i < grid.length; i++)
		{
			for(int j = 0; j < grid[0].length; j++)
			{
				System.out.print(grid[i][j] + "   ");
			}
		}
	}
	
	
}
