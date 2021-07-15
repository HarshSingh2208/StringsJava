package Strings.java;

import java.util.Scanner;

public class HighestOccuringCharacter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String q = s.next();
        int arr[]=new int[256];
        int max=0;
        int elementIndex=0;
        for(int i=0;i<q.length();i++)
        {
        	int index=q.charAt(i);
        	arr[index]++;
        	int current_max=arr[index];
        	if(max<current_max)
        	{
        		max=current_max;
        		elementIndex=index;
        	}
        }
        
        System.out.println((char)elementIndex);

	}

}
