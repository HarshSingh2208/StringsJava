package Strings.java;

import java.util.Scanner;

public class allSubstring {

	
	public static void Printstr(String st) {
		 for(int i=0;i<st.length();i++)
	        {
	        	System.out.println(st.substring(0,i+1));
	        }
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String str = s.next();
        for(int i=0;i<str.length();i++)
        {
        	Printstr(str.substring(i));
        }
	}

}
