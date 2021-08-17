package unit7;
import java.util.Scanner;
public class Magic15Square 
{
	public static void main(String args[])
	{
		//declare scanner
		Scanner sc = new Scanner(System.in);
		//declare variables
		int r1, r2, r3, c1, c2, c3, d1, d2;
		boolean bad;
		//loop until solution is found
		do
		{
			System.out.println("\n\n");
			r1 = 0; r2 = 0; r3 = 0; c1 = 0; c2 = 0; c3 = 0; d1 = 0; d2 = 0;
			//set up char arr for display
			char dispGrid[][] = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};
			//set up num arr for sums
			int numGrid[][] = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
			bad = false;
			for(int i = 0; i < 9; i++)
			{
				//print the display grid
				printGrid(dispGrid);
				//prompt user for where to put the current num
				System.out.print("Please choose a place to put " + (i+1) + ": ");
				char choice = sc.nextLine().charAt(0);
				//assign (i+1) to the correct position
				int num = i+1;
				switch(choice)
				{
				case 'a':
					dispGrid[0][0] = (char) (num + 48);
					numGrid[0][0] = num;
					break;
				case 'b':
					dispGrid[0][1] = (char) (num + 48);
					numGrid[0][1] = num;
					break;
				case 'c':
					dispGrid[0][2] = (char) (num + 48);
					numGrid[0][2] = num;
					break;
				case 'd':
					dispGrid[1][0] = (char) (num + 48);
					numGrid[1][0] = num;
					break;
				case 'e':
					dispGrid[1][1] = (char) (num + 48);
					numGrid[1][1] = num;
					break;
				case 'f':
					dispGrid[1][2] = (char) (num + 48);
					numGrid[1][2] = num;
					break;
				case 'g':
					dispGrid[2][0] = (char) (num + 48);
					numGrid[2][0] = num;
					break;
				case 'h':
					dispGrid[2][1] = (char) (num + 48);
					numGrid[2][1] = num;
					break;
				case 'i':
					dispGrid[2][2] = (char) (num + 48);
					numGrid[2][2] = num;
					break;
				default:
					r1 = 15;
					System.out.println("Invalid choice! Game Over!");
					bad = true;
				}
				if(bad)
				{
					break;
				}
				//sum up r1, r2, r3, c1, c2, c3, d1, and d2
				r1 = sum(numGrid,1);
				r2 = sum(numGrid,2);
				r3 = sum(numGrid,3);
				c1 = sum(numGrid,4);
				c2 = sum(numGrid,5);
				c3 = sum(numGrid,6);
				d1 = sum(numGrid,7);
				d2 = sum(numGrid,8);
				
			}
		}while(r1 != 15 && r2 != 15 && r3 != 15 && c1 != 15 && c2 != 15 && c3 != 15 && d1 != 15 && d2 != 15);
		if(!bad)
		{
			System.out.println("Congrats You've figured it out!");
		}
		//close scanner
		sc.close();
	}
	
	public static int sum(int arr[][], int x)
	{
		int sum = 0;
		switch(x)
		{
		case 1:
			//r1
			sum = arr[0][0] + arr[0][1] + arr[0][2];
			break;
		case 2:
			//r2
			sum = arr[1][0] + arr[1][2] + arr[1][2];
			break;
		case 3:
			//r3
			sum = arr[2][0] + arr[2][1] + arr[2][2];
			break;
		case 4:
			//c1
			sum = arr[0][0] + arr[1][0] + arr[2][0];
			break;
		case 5:
			//c2
			sum = arr[0][1] + arr[1][1] + arr[2][1];
			break;
		case 6:
			//c3
			sum = arr[0][2] + arr[1][2] + arr[2][2];
			break;
		case 7:
			//d1
			sum = arr[0][0] + arr[1][1] + arr[2][2];
			break;
		case 8:
			//d2
			sum = arr[0][2] + arr[1][1] + arr[2][0];
			break;
		}
		
		
		return sum;
	}
	
	public static void printGrid(char grid[][])
	{
		for(int i = 0; i < grid.length; i++)
		{
			for(int j = 0; j < grid[0].length; j++)
			{
				System.out.print(grid[i][j] + "    ");
			}
			System.out.println();
		}
	}

}