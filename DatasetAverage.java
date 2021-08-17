package unit7;
import java.util.Scanner;
public class DatasetAverage 
{

	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		
		int numValues; 
		double sum = 0, average = 0;
		
		// prompt user for size of array 
		System.out.print("Enter number of values in the dataset: ");
		numValues = sc.nextInt();
		
		//declare array 
		double dataset[] = new double[numValues];
		
		//loop through and get all values to add to sum 
		for(int i = 0; i<dataset.length; i++)
		{
			System.out.print("Enter value" + (i+1) + ":");
			dataset[i] = sc.nextDouble();
			sum += dataset[i];
		}
		
		//call to print array 
		printArr(dataset);
		
		//print average
		System.out.println("Average: " + average);
		

	}
	public static void printArr(double arr[])
	{
		for(int i = 0; i< arr.length; i++)
		{
			System.out.print(arr[i] + ",");
		}
	}

}
