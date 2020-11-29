package adapt.mohit;

import java.util.Scanner;//5421

public class EncryptedDigit {
	
	public static int encrypt(int n) 
	{
		int len=4;
		int []arr=new int[len];
		for(int i=len-1;i>=0;i--) 
		{
			arr[i]=n%10;
			n=n/10;
		}
		int temp=0;
		//swap 1st [0] & 3rd [2] digit
		temp=arr[0];
		arr[0]=arr[2];
		arr[2]=temp;
		//swap 2nd [1] & 4th [3]
		temp=arr[1];
		arr[1]=arr[3];
		arr[3]=temp;
		//swap 1st [0] & 4th [3]
		temp=arr[0];
		arr[0]=arr[3];
		arr[3]=temp;
		String res="";
		for(int i=0;i<len;i++)
		{
			arr[i]=Math.abs(arr[i]-7)%10;
			res+=arr[i];
		}
		return Integer.parseInt(res);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		System.out.println("Encrpyted num is :"+encrypt(input));
		sc.close();
	}
}
