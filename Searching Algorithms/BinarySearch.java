package com.jsp.SearchingAlgorithms;

public class BinarySearch {
	
	public static void binarySearch(int arr[], int key) {
		
		int low = 0; 
		int high = arr.length-1;
		
		while(low <= high) {
			int mid = (low+high)/2;
			
			if(arr[mid]==key) {
				System.out.println("Element is found at index " + mid);
				break;
			}else if(arr[mid]>key) {
					high = mid-1;
			}else if(arr[mid]<key) {
						low = mid+1;
			}if(low>high) {
				System.out.println("Element not found");
			}
		}
	}
	
	
	public static void main(String[] args) {
		int arr[] = {7, 27, 4, 18, 2, 16, 25};
		binarySearch(arr, 18);
	}
}

