package Strings.java;

import java.util.Scanner;

public class RemoveConsecutiveDuplicate {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String str = s.next();
        String newStr = "";
        char startIndex=str.charAt(0);
        int current=0;
        while(current<str.length())
        {
        	if(str.charAt(current)==startIndex)
        	{
        		current=current+1;
        	}
        	else if(str.charAt(current)!=startIndex)
        	{
        		newStr+=startIndex;
        		startIndex=str.charAt(current);
        		current=current+1;
        		
        	}
        }
        newStr+=startIndex;
        
        System.out.println(newStr);

	}

}
