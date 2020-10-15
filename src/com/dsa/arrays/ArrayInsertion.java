package com.dsa.arrays;

public class ArrayInsertion {

	 public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int arrlength = input.nextInt();
		int[] arr = new int[arrlength];
		
		for(int i=0;i<arrlength;i++){
		    arr[i] = input.nextInt();
		}
        
        System.out.println("Original array:");	
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		int indexToInsert = input.nextInt();
	    int dataToInsert = input.nextInt();
		
		
		System.out.println("Insertion:");	
		System.out.println("indexToInsert:" + indexToInsert);	
		System.out.println("dataToInsert:" + dataToInsert);	
		
		for(int i=arr.length-1;i>=indexToInsert;i--){
		    if(i>indexToInsert)
		        arr[i] = arr[i-1];
		     if(i == indexToInsert)
		        arr[i] = dataToInsert;
		}
		
		//print after insertion
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
