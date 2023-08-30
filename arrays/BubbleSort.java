package com.jsp.arrays;

public class BubbleSort {
    public static int bubbleSort(int a[]){
    	for(int i=0;i<a.length;i++) {
    		for(int j=0;j<a.length-1;j++) {
    			if(a[j]>a[j+1]) {
    				int temp=a[j];
    				a[j]=a[j+1];
    				a[j+1]=temp;
    		}
    		}
    			}
    	return a;
    	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {7,8,1,3,5,6};
     int res[]=bubbleSort[a];
     for(int i=0;i<res.length;i++) {
  System.out.print(res[i]+" ");
	}
	}

