package test;

import java.util.Scanner;

public class whitespaces {

	public static void main(String[] args) {
		Scanner st=new Scanner(System.in);
		System.out.println("enter the string");
		String s=st.nextLine();
		s=s.replace(" ", "");
		System.out.println(s);
}
}
