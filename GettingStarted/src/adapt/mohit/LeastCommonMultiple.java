package adapt.mohit;

import java.util.Arrays;
import java.util.Scanner;

public class LeastCommonMultiple 
{
	public static int lcm(int []arr) 
	{
		int len=arr.length;
		Arrays.sort(arr);
		int maxNum=arr[len-1];
		int prod=1;
		for(int i=0;i<len;i++) 
		{
			prod*=arr[i];
		}
		for(int i=maxNum;i<=prod;i++) 
		{
			boolean divisible=true;
			for(int j=0;j<len;j++) 
			{
				if(i%arr[j]!=0) 
				{
					divisible=false;
					break;
				}
			}
			if(divisible) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(lcm(arr));
		sc.close();
	}

}
