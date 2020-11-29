package adapt.mohit;

import java.util.Scanner;

public class PrimeMaxSubstring 
{
	public static boolean isPrime(int n) 
	{
		if(n<2)
			return false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		//System.out.println(isPrime(93));
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		sc.close();
		//1245=1245,124,245,12,24,45,1,2,4,5
		int len=input.length();
		int k=len;
		while(k>0) {
			int beginIndex=0;
			int endIndex=beginIndex+k;
			for(beginIndex=0;endIndex<=len;beginIndex++) {
				String check=input.substring(beginIndex, endIndex);
				if(isPrime(Integer.parseInt(check))) {
					System.out.println("Greatest prime no is "+check);
					return;
				}
				endIndex++;
			}
			k--;
		}
		System.out.println("Greatest prime no is "+1);	
	}
}
