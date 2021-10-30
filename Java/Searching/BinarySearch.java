import java.io.*;
import java.util.*;
class BinarySearch{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		//Taking input for size of an array

		System.out.println("Enter the size of an array");
		int n = sc.nextInt();

		// Taking input elements in array

		int []arr = new int[n];		
		System.out.println("Enter "+n+" element in sorted order");

		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
	
		// Taking input for key to search

		System.out.println("Enter the key to search");
		int key = sc.nextInt();
		
		// Calling th e function Linear Search
		int low  = 0;
		int high = n;
		System.out.println("The "+key+" is found at index "+ binarySearch(arr,low , high, key));
		
	}

	public static int binarySearch(int [] arr, int low, int high, int key){

		int mid =0;
		if(high>=1){
			mid = (low + high-1)/2;
			if(arr[mid] == key){
				return mid;
			}
			else if(arr [mid]> key){
				return binarySearch(arr, low, mid-1,  key);
			}
			else{
				return binarySearch(arr, mid+1, high, key);
			}
		}
	return -1;
	}
}