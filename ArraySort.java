package unit7;

public class ArraySort 
{

	public static void main(String[] args)
	{
		double ArraySort[] = {49.6, 93.4, 25.8, 64.5, 74.2, 39.4, 38.8, 103.7, 
				93.6, 45.6, 52.6, 88.1, 26.5, 99.9, 85.3, 44.9, 11.5, 37.3, 80.8, 
				115.3, 122.4, 15.6, 61.7, 8.4, 53.1};
		
		System.out.println("Unsorted: ");
		printArr(ArraySort);
		
		sort(ArraySort);
		
		System.out.println("Sorted: ");
		printArr(ArraySort);
		
	}
	
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
	
	public static void printArr(double arr[])
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + ", ");
		}
		System.out.println(arr[arr.length - 1]);
	}

}
