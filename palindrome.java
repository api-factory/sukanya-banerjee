package test;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int r,sum=0;
		
		int temp;
		temp=num;
		while(num>0)
		{
		r=num%10;
		sum=(sum*10)+r;
		num=num/10;
		
	    }
		if(temp==sum)
			System.out.println("number is a palindrome");
		else
			System.out.println("number is not a palindrome");

}
}
