package Strings.java;

import java.util.Scanner;

public class CheckPermutation {
	
	public static int AsciiValue(String str){
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			sum=sum+str.charAt(i);
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String p = s.next();
        String q = s.next();
        int res1=AsciiValue(p);
        int res2=AsciiValue(q);
        if(res1==res2)
        {
        	System.out.println("True");
        }
        else
        {
        	System.out.println("False");
        }
        
        

	}

}
