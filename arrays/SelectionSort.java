package com.jsp.arrays;

public class SelectionSort {
	//ascending order
//    public static void selectionSort(int a[]) {
//    	for(int i=0;i<=a.length-1;i++) {
//    		for(int j=i+1;j<a.length;j++) {
//    		if(a[i]>a[j]) {
//    			int temp=a[i];
//    			a[i]=a[j];
//    			a[j]=temp;
//    		}
//    		}
//    		System.out.print(a[i]+" ");
//    	}
//    }
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//    int a[]= {17,27,20,18,19,16,2};
//    selectionSort(a);
//    }
	
	//descending order
    public static void selectionSort(int a[]) {
    	for(int i=0;i<=a.length-1;i++) {
    		for(int j=i+1;j<a.length;j++) {
    		if(a[i]<a[j]) {
    			int temp=a[i];
    			a[i]=a[j];
    			a[j]=temp;
    		}
    		}
    		System.out.print(a[i]+", ");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {17,27,50,38,9,16,2};
    selectionSort(a);
    }
	}


