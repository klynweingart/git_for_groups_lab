package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		boolean unsorted = true;
		int j = 0;
		while(unsorted) {
			unsorted = false;
			for( int i = 0; i < unsortedArray.length() - 1; i++) {
				if(unsortedArray[i] > unsortedArray[i+1]) {
					unsorted = true;
					swap(unsortedArray, i, i+1);
				}
			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
