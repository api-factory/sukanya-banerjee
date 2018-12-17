package test;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements in the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements in the array");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
