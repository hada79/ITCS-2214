package test;
public class SelectionSort
{
	public static void main(String[] args)
	{
		int[] myNumbers = {5,2,4,1,9};

		for (int arrayPos = 0; arrayPos < myNumbers.length; arrayPos++)
			System.out.print(myNumbers[arrayPos] + " ");
			
		sortArray(myNumbers);
		System.out.println();
		
		for (int index = 0; index < myNumbers.length; index++)
			System.out.print(myNumbers[index] + " ");
	}
	public static int[] sortArray(int[] array)
	{
		int lowestValPos; // keeps track of lowest number found while looping
		int tempValHolder; // temp holding place for swapping of numbers (lowest to front, swapping)
		for (int arrayPos = 0; arrayPos < array.length; arrayPos++)
		{
			lowestValPos = arrayPos;
			
			for (int index = arrayPos; index < (array.length-1); index++)
			{
				if(array[index + 1] < array[lowestValPos]) // is next number less than the current position?
				{
					lowestValPos = (index + 1); // if so, it's the current winner of lowest num contest
				}
			}
			tempValHolder = array[arrayPos]; // number at position comparing and moves it to temp location
			array[arrayPos] = array[lowestValPos]; // lowest number found that iteration moved to comparing position
			array[lowestValPos] = tempValHolder; //move value back from temp to where the lowest num was found
		}
		return array;
	}
}
