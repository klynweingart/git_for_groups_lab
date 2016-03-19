package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
		int temp;
    for (int i = 1; i < array.length-1;i++){
    	int j =i;
    	while(j<0 && array[i-1] > array[i]){
    		temp = array[i];
    		array[i] = array[i-1];
    		array[i-1] = temp;
    		j= i -1;
    		
    		
    	}
    	
    }

    return array;
	}
}
