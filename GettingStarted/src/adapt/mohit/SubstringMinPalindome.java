package adapt.mohit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SubstringMinPalindome
{
	public static boolean isPalindrome(String n) 
	{
		char[] arr=n.toCharArray();
		for(int i=0,j=arr.length-1;i<arr.length;i++) 
		{
			if(arr[i]!=arr[j]) 
			{
				return false;
			}
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		//System.out.println(isPalindrome("bcbd"));
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		sc.close();
		String[] strArr = input.split(" ");
		Arrays.sort(strArr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				int len1=s1.length();
				int len2=s2.length();
				if(len1==len2)
					return 0;
				if(len1<len2) {
					return -1;
				}else {
					return 1;
				}
			}
		});
		for(String s:strArr) 
		{
			if(isPalindrome(s)) {
				System.out.println(s);
				return;
			}
		}
		System.out.println("No palindrome found");
	}
}
