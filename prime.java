package test;

import java.util.*;


public class prime {

	public static void main(String[] args) {
		boolean isPrime=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int x=sc.nextInt();
		for(int i=2;i<=x/2;i++)
		{
			int n=x%i;
			if(n==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
			System.out.println("the number is prime");
		else
			System.out.println("The number is not prime");

	}

}
