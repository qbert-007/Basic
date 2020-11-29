package adapt.mohit;

import java.util.Arrays;
//import java.util.Comparator;
import java.util.Scanner;

public class TwoStringCharSame 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		sc.close();
		if(s1.length()!=s2.length()) 
		{
			System.out.println("Not same");
			return;
		}
		char []arr1=s1.toCharArray();
		char []arr2=s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i=0;i<arr1.length;i++) 
		{
			if(arr1[i]!=arr2[i]) 
			{
				System.out.println("Not same string");
				return;
			}
		}
		System.out.println("Same string");
//		Comparator<Character> c = new Comparator<Character>() 
//		{
//			@Override
//			public int compare(Character c1, Character c2) 
//			{
//				if(c1==c2) 
//				{
//					return 0;
//				}
//				if(c1<c2) 
//				{
//					return -1;
//				}else 
//				{
//					return 1;
//				}
//			}
//		};
	}
}
