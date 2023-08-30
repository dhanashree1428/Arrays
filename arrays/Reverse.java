package com.jsp.arrays;

public class Reverse {
   public static void reverseOfArray(int a[]) {
	   for(int i=a.length-1;i>=0;i--) {
		   System.out.print(a[i]+" ");
	   }
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[]= {10,20,30,40,50};
   reverseOfArray(a);
	}

}
