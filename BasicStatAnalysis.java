package unit7;
import java.util.Scanner;
public class BasicStatAnalysis 
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int numVals; 
		System.out.print("Enter number of values in the dataset: ");
		numVals = sc.nextInt();
		double dataset[] = new double[numVals];
		for(int i = 0; i < numVals - 1; i++)
		{
			System.out.print("Enter value" + (i +1) + ":");
			dataset[i] = sc.nextDouble();
			sc.close();
		}
	}
	
	//sort method
	public static void sort(double arr[])
	{
		for(int i = 0; i < arr.length - 1; i++)
		{
			for (int j = 0; j < arr.length - i - 1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					double temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}
	
	//print arr method
	public static void printArr(double arr[])
	{
		
	}
	
	//range method
	public static void range(double arr[])
	{
		sort(arr);
		double range = Math.abs(arr[arr.length - 1] - arr[0]);
		System.out.println("The range of the dataset is:" + range);
	}
	
	//mean method
	public static void mean(double arr[])
	{
		double sum = 0, avg; 
		for(int i =0; i< arr.length; i++)
		{
			sum += arr[i];
		}
		avg = sum/arr.length; 
		System.out.println("The mean of the dataset is:" + sum);
	
		
	}
	
	//median method
	public static void median(double arr[])
	{
		double median;
		if(arr.length % 2 == 0)
		{
			median = (arr[arr.length/2] + arr[arr.length/2 -1]/2);
		}
		else
		{
			median = arr[arr.length]/2;
		}
		System.out.println("The median of the dataset is:" + median);
		
	}
	
	//mode method
	public static void mode(double arr[])
	{
		//declare variables
		double mode = 0;
		int streak = 0, longestStreak = 0, numModes = 0;
		//loop through array
		for(int i = 0; i < arr.length - 1; i++)
		{
			if(arr[i] == arr[i + 1])
			{
				streak++;
				if(streak == longestStreak)
				{
					numModes++;
				}
				if(streak > longestStreak)
				{
					numModes = 1;
					longestStreak = streak;
					mode = arr[i];
				}
			}
			else
			{
				streak = 0;
			}
		}
		if(numModes == 1)
		{
			System.out.println("Mode: " + mode);
		}
		else
		{
			System.out.println("There is no mode.");
		}
	}
}