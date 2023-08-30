package com.jsp.arrays;

public class Search {
//    public static int searchElement(int a[],int key) {
//    	for(int i=0;i<a.length;i++) {
//    		if (a[i]==key) {
//    			return i;
//    		}
//    	}
//    	return -1;
//    }
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//    int a[]= {23,27,20,28,17,16,2};
//	System.out.println(searchElement(a,16));
//	}
//}


public static void searchElement(int a[],int key) {
	for(int i=0;i<a.length;i++) {
		if (a[i]==key) {
			System.out.println(i);
		}
	}
	
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
int a[]= {23,27,20,28,17,16,2};
searchElement(a,16);
}
}
