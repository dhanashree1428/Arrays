package com.jsp.arrays;

public class Largest {
   public static int largestElement(int a[]) {
    int largest=a[0];
    for(int i=1;i<a.length;i++) {
    	if(largest<a[i]) {
    		largest=a[i];
    	}
    }
    return largest;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a[]= {100,20,200,30,110};
  System.out.println(largestElement(a));
	}

}
