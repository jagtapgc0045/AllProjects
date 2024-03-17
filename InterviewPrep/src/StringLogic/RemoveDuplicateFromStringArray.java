package StringLogic;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicateFromStringArray {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Provide a string: ");
		String a=sc.nextLine();
		String []b=a.split(" ");
		ArrayList<String> c=new ArrayList<String>();
		int k=0;

		for(int i=0;i<=b.length-1;i++)
		{
			for(int j=i+1;j<b.length;j++)
				if(b[i].equals(b[j]))
				{
					break;
				}
				else {
					c.add(b[i]);
				}
		}
		
		for(String d:c)
		{
			System.out.println(d);
		}
	}

}
