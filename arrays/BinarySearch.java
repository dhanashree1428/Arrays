package com.jsp.arrays;

public class BinarySearch {
    public static void binarySearch(int a[],int key) {
    	int low=0;
    	int high=a.length-1;
    	while(low<=high) {
    	int mid=(low+high)/2;
    		if(a[mid]==key) {
    		System.out.println("Element present at "+mid);		
    		break;
    		}
    		else
    			if(a[mid]>key) {
    				high=mid-1;
    			}
    			else 
    				if(a[mid]<key) {
    					low=mid+1;
    				}
    	}System.out.println("Element not found.");
    				}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {2,16,17,18,20,27};
    binarySearch(a,18);
	}

}
