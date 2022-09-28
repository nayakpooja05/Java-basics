package javaBasics;

import java.util.Arrays;

public class String6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//defining an array of type string  
		String[] letters = {"Z", "S", "I", "A", "Y", " A", "D", "F"};  
		int size = letters.length;  
		//logic for sorting   
		for(int i = 0; i<size-1; i++)   
		{  
		for (int j = i+1; j<letters.length; j++)   
		{  
		//compares each elements of the array to all the remaining elements  
		if(letters[i].compareTo(letters[j])>0)   
		{  
		//swapping array elements  
		String temp = letters[i];  
		letters[i] = letters[j];  
		letters[j] = temp;  
		}  
		}  
		}  
		//prints the sorted array in ascending order  
		System.out.println(Arrays.toString(letters));  
	}

}
