package Strings.java;

import java.util.Scanner;

public class CompresstheString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String str = s.next();
        String newStr = "";
        char startIndex=str.charAt(0);
        int current=0;
        int count=0;
        while(current<str.length())
        {
        	if(str.charAt(current)==startIndex)
        	{
        		current=current+1;
        		count=count+1;
        	}
        	else if(str.charAt(current)!=startIndex)
        	{
        		if(count>1)
        		{
        			newStr+=startIndex;
        			newStr+=count;
            		startIndex=str.charAt(current);
            		current=current+1;
            		count=1;
        		}
        		else
        		{
        		newStr+=startIndex;
        		startIndex=str.charAt(current);
        		current=current+1;
        		count=1;
        		}
        	}
        }
        newStr+=startIndex;
        if(count>1)
        {
        	newStr+=count;
        }
        
        System.out.println(newStr);

	}

}
