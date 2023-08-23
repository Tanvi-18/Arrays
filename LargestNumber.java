package com.jsp.Array;

public class LargestNumber {
	public static void main(String[] args) {
		int arr[]= {8, 15, 6, 22, 9};
		int max = arr[0];
		
		for(int i = 1; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println(max);
		
	}

}
