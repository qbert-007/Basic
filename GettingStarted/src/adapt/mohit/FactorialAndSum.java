package adapt.mohit;

import java.util.Scanner;

public class FactorialAndSum {	
	public static int digitSum(int n) 
	{
		int sum=0;
		while(n>0) 
		{
			sum+=n%10;
			n=n/10;
		}
		return sum;
	}	
	public static int factorial(int n) 
	{
		if(n==1) 
		{
			return 1;
		}
		return n*factorial(n-1); 
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int fact=factorial(input);
		int sum=digitSum(fact);
		System.out.println("factorial is :"+fact+"\nSum is :"+sum);
	}
}
