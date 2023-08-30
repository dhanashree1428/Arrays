package com.jsp.arrays;

public class Sum {
   public static int sumOfArray(int a[]) {
	int sum=0; 
	   for(int i=0;i<a.length;i++) {
		   sum=sum+a[i];}
	   return sum;
	   }
	   
	   
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[]= {10,20,30,40,50,60};
   System.out.println(sumOfArray(a));
   }
	}


