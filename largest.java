package test;
import java.util.*;
public class largest {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements in the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements in the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("the greatest number is"+arr[n-1]);
		
	}

}
