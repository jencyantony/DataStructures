package com.dsa.sortAlgorithms;

public class BubbleSort {

	public static void main(String args[]){
		int[] arr = {56,78,34,12,4,90,23};
		int temp;
		boolean sorted = false;
		
		System.out.println("Bubble sort Algorithm");
		while(!sorted){
			sorted = true;
			for(int i =0;i<arr.length-1;i++){
				if(arr[i]>arr[i+1]){
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					sorted = false;
				}
			}
		}
		
		System.out.println("Sorted array: ");
		for(int i =0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
