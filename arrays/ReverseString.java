package com.jsp.arrays;

public class ReverseString {

	 public static void reverseOfString(String a[]) {
		   for(int i=a.length-1;i>=0;i--) {
			   System.out.print(a[i]+"");
		   }
		   
	   }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	   String a[]= {"d","h","a","n","a","s","h","r","e","e"};
	   reverseOfString(a);
		}

	}


