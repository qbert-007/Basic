package adapt.mohit;

import java.util.Arrays;
import java.util.Scanner;

public class HighestCommonFactor 
{
	public static int hcf(int []arr) 
	{
		int len=arr.length;
		Arrays.sort(arr);
		int minNum=arr[0];
		for(int i=minNum;i>=0;i--) 
		{
			boolean divident=true;
			for(int j=0;j<len;j++) 
			{
				if(arr[j]%i!=0) 
				{
					divident=false;
					break;
				}
			}
			if(divident) 
			{
				return i;
			}
		}
		return 1;
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
		System.out.println(hcf(arr));
		sc.close();
	}

}
  