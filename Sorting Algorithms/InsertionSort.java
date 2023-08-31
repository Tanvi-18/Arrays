package com.jsp.SortingAlgorithms;

public class InsertionSort {
	
	public static void sortedArray(int arr[]) {
		for(int i=1; i<arr.length; i++) {
			int current=arr[i];
			int j=i-1;
			
			while(j>=0 && current<arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]=current;
		}
	}

		
	public static void main(String[] args) {
		int arr[] = {7, 4, 1, 5, 2, 6, 3, 8};
		sortedArray(arr);
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
}

