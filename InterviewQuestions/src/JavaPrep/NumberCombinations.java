package JavaPrep;

import java.util.Random;
import java.util.random.RandomGeneratorFactory;

public class NumberCombinations {
	
	public static void main (String[]args)
	{
		
	}
	
	public static void ByRandom()
	{
		int[] allowed_digit= {1,3,5,6,7,0};
		Random random=new Random();
		for(int i=0;i<4;i++)
		{
			int a=random.nextInt(allowed_digit);
			System.out.println(allowed_digit[a]);
			
		}
	}
	
	public static void Bysecond()
	{
		char[] allwd= {1,3,5,6,7};
	}
	
	

}
