package adapt.mohit;

import java.util.Scanner;

public class PrimePosChars 
{
	public static boolean isPrime(int n) 
	{
		if(n<2) 
		{
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) 
		{
			if(n%i==0) 
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String inp=sc.nextLine();
		sc.close();
		String res="";
		for(int i=0;i<inp.length();i++) 
		{
			if(isPrime(i+1)) 
			{
				res=res+inp.charAt(i)+" ";
			}
		}
		System.out.println(res);
	}
}
