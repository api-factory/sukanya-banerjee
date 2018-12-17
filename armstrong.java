package test;
import java.util.*;
public class armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		int sum=0;
		int num=number;
		while(num>0){
		int r=num%10;
		num=num/10;
		sum=sum+(r*r*r);
		}
		if(sum==number)
		System.out.println("it is an armstrong number");
		else
			System.out.println("it is not an armstrong number");	

	}

}
