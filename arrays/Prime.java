package com.jsp.arrays;

public class Prime {
	  public static int primeNumbers(int a[]) {
		    int count=0;
		    for(int i=0;i<a.length;i++) {
		    	if(i%2==0) {
		    		count++;//count the number of prime numbers
		    	}
		    }
		    return count;
		   }
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		  int a[]= {1,2,3,4,5,7,11};
		  System.out.println(primeNumbers(a));
			}
}
