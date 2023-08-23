package com.jsp.Array;

import java.util.Scanner;

public class SumOfElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[]= new int[5];
		
		for(int i=0; i<a.length; i++) {
			System.out.println("Enter an int value ");
			a[i] = sc.nextInt();
		}

		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum = sum+a[i];
		}
		
		System.out.println(sum);	
						
	}

}
