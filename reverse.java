package test;
import java.util.*;
public class reverse {

	public static void main(String[] args) {
		Scanner st=new Scanner(System.in);
		System.out.println("enter the string");
		String s=st.nextLine();
		String reversed=reverseString(s);
		System.out.println("the reversed string is:"+reversed);
	}
		
		public static String reverseString(String s)
		{
			if(s.isEmpty())
				return s;
			return reverseString(s.substring(1))+s.charAt(0);
		}
		

	}



