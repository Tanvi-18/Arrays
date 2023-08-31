package com.jsp.SortingAlgorithms;

public class SelectionSort {
	
	public static int[] sortedArray(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					  arr[i] = arr[j];
					  arr[j] = temp;
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
