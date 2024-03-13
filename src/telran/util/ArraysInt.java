package telran.util;

import java.util.Arrays;

public class ArraysInt {
	public static	int[] addNumber(int[] array, int number) {
		int[] copy =Arrays.copyOf(array,array.length+1);
		copy[array.length] = number;
		
		return copy;
	}
	public static	int[] insertNumber(int[] array,  int index, int number) {
		int[] copy =Arrays.copyOf(array,array.length+1);
		System.arraycopy(copy,index, copy,index +1, copy.length-index - 1);
		copy[index] = number;
		return copy;
	}
	public static	int[] removeNumber(int[] array, int index) {
		int[] copy =Arrays.copyOf(array,array.length-1);
		System.arraycopy(array,index+1, copy,index, copy.length-index);
		return copy;
	}
	public static	int[] insertSorted(int[] sortedArray, int number) {
		int[] copy =Arrays.copyOf(sortedArray,sortedArray.length+1);
		int index = 0;
		while(index < sortedArray.length && sortedArray[index] < number) {
			index++;
		}
		System.arraycopy(sortedArray,index, copy,index+1,sortedArray.length-index);
		copy[index] =number ;
		return copy;
	}
}
