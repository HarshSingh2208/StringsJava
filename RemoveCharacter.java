package Strings.java;

import java.util.Scanner;

public class RemoveCharacter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String p = s.nextLine();
        String q = s.next();
        String newStr="";
        for(int i=0;i<p.length();i++)
        {
        	if(p.charAt(i)!=q.charAt(0))
        	{
        		newStr+=p.charAt(i);
        	}
        }
        
        System.out.println(newStr);
        

	}

}
