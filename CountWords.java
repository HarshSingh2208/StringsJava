package Strings.java;
import java.util.Scanner;
public class CountWords {

	public static void main(String[] args) {
         
		Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
        	if(str.charAt(i)==' ')
        	{
        		count=count+1;
        	}
        }
        
        System.out.print(count+1);


	}

}
