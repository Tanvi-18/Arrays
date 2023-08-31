package com.jsp.SortingAlgorithms;

public class BubbleSort {
	
	public static int[] sortedArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					  arr[j] = arr[j+1];
					  arr[j+1] = temp;
				}
			}
		}
		return arr;
	}

		
	public static void main(String[] args) {
		int arr[] = {7, 4, 1, 5, 2, 6, 3, 8};
		int res[] = sortedArray(arr);
		for(int i =0; i<res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}
	
}

