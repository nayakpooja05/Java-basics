package javaBasics;

public class String1 {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String str="Hello";
		System.out.println("Original word: " +str); 
		for (int i=str.length();i>0; i--) {
       char ch= str.charAt(i-1); 
        

		System.out.print(""+ch);
		}
}}