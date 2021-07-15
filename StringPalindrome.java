package Strings.java;

import java.util.Scanner;

public class StringPalindrome {
	
	public static boolean CheckPalindrome(String st) {
		int i=0;
        int k=st.length()-1;
        while(i<=k)
        {
        	if(st.charAt(i)!=st.charAt(k))
        	{
        		 return false;
        	}
        	i++;
        	k--;
        }
		
		return true;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        boolean ans=CheckPalindrome(str);
        if(ans==true)
        {
        	System.out.println("equal");
        }
        else
        {
        	System.out.println("notEqual");
        }
        

	}

}
