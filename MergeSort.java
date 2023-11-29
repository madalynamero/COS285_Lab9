package Lab9;

/**
 * A class that utilizes MergeSort to sort an array
 * @author Madalyn Amero
 * @version 29 November, 2023
 *
 */
public class MergeSort {
    
    /**
     * Sorts an array of integers
     * @param input array of integer values
     * @return sorted array
     */
    public static int[] sort(int[] input) {
        //calculate the midpoint of the array
    	int midpoint = input.length/2;
    	int[] first = new int[midpoint];
    	int[] second = new int[input.length - midpoint];
    	
    	//copy 0 to midpoint in first array
    	for (int i = 0; i <= midpoint, i++) {
    		first[i] = input[i];
    	}
    	
    	//copy midpoint+1 to end in second array
    	for (int i = input.length-midpoint; i <= input.length; i++) {
    		int count = 0;
    		second[count] input[i];
    		count++;
    	}
    	
    	//recursively sort each half
    	sort(first); //sort the first half
    	sort(second); //sort the second half
    	
    	//calls method to merge the two sorted halves and adjust the input array
    	int[] output = new int[input.length];
    	output = merge(first, second);

        return output;
    }
    
    /**
     * Merges two sorted arrays into one sorted array
     * @param first the first array to be merged
     * @param second the second array to be merged
     * @return a (sorted) merged array of the two arrays
     */
    public static int[] merge(int[] first, int[] second) {
    	int[] mergeArr = new int[first.length+second.length];
    	int f = 0; //keep track of index for first[]
    	int s = 0; //keep track of index for second[]
    	int m = 0; //keep track of index for mergeArr[]
    	
    	while ((f < first.length)&&(s < second.length)) {
    		if (first[f] < second[s]) {
    			//assign this slot at input to the element in first
    			mergeArr[m] = first[f];
    			//increment the index of input and first
    			m++;
    			f++;
    		}
    		else {
    			//assign this slot at input to the element in second
    			mergeArr[m] = second[s];
    			//increment the index of input and second
    			m++;
    			s++;
    		}
    	}
    	//add the rest of the elements in an array, if there are any elements left
    	//while loop to iterate through the rest of the first array
    	while (f < first.length) {
    		mergeArr[m] = first[f];
    		m++;
    		f++;
    	}
    	//while loop to iterate through the rest of the second array
    	while (s < second.length) {
    		mergeArr[m] = second[s];
    		m++;
    		s++;
    	}
    }
}
