package Strings.java;

import java.util.Scanner;

public class reverseStringWithWords {
	
	public static String reverse(String st) {
		String helper="";
		int i=st.length()-1;
		while(i>=0)
		{
			helper+=st.charAt(i);
			i--;
		}
		return helper;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String p = s.nextLine();
        int length=p.length();
        int i=0;
        int end=0;
        String str=reverse(p.substring(0));
        String newStr="";
        while(end<length)
        {
        	if(str.charAt(end)!=' ')
        	{
        		end=end+1;
        	}
        	else if(str.charAt(end)==' ')
        	{
        		String temp=reverse(str.substring(i,end));
        		newStr+=temp;
        		newStr+=" ";
        		i=end+1;
        		end=end+1;
        	}
        }
        newStr=newStr+reverse(str.substring(i,end));
        System.out.print(newStr);

	}

	private static String substring(int i, int length) {
		// TODO Auto-generated method stub
		return null;
	}

}
