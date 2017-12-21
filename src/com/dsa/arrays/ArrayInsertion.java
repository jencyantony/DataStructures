package com.dsa.arrays;

public class ArrayInsertion {

	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		
		int dataToInsert = 10;
		int indexToInsert = 0;
		
		//print original array
		System.out.println("Original array:");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		//insert the item
		for(int i=arr.length-1;i>=indexToInsert;i--){
			if(i < arr.length-1)
				arr[i+1] = arr[i];
			if(i == indexToInsert)
				arr[i] = dataToInsert;
		}
		
		//print after insertion
		System.out.println("After Insertion:");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
