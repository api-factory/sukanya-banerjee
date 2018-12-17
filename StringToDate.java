package test;

import java.text.SimpleDateFormat;
import java.util.*;

public class StringToDate {

	public static void main(String[] args) throws Exception {
		Scanner st=new Scanner(System.in);
		System.out.println("enter the string");
		String s=st.nextLine();
		Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(s);
		System.out.println(s+"\t"+date1);

	}

}
