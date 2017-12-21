package com.dsa.arrays;

import java.util.Scanner;

public class ArrayDeletion {

	public static void main(String[] args){
		Scanner scanInput = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int size = scanInput.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Please enter the array elements: ");
		for(int i=0;i<size;i++){
			arr[i] = scanInput.nextInt();
		}
		
		System.out.println("Please enter the element to delete: ");
		int elementToDelete = scanInput.nextInt();
		
		//print original array
		System.out.println("Original array:");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		//delete the item
		for(int i=0;i<size;i++){
			if(arr[i] == elementToDelete){
				for(int j=i;j<arr.length;j++){
					if(j == arr.length-1)
						arr[j] = 0;
					else
						arr[j] = arr[j+1];
				}
				break;
			}
		}
		//print after deletion
		System.out.println("After Deletion:");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		scanInput.close();
	}
}
