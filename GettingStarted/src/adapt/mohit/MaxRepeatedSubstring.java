package adapt.mohit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MaxRepeatedSubstring {
	
	public static String[] sortDescString(String[]arr) 
	{
		Comparator<String> c = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if(s1.length()==s2.length()) 
				{
					return -1*(s1.compareTo(s2));
				}
				if(s1.length()>s2.length()) 
				{
					return -1;
				}else 
				{
					return 1;
				}
			}
		};
		Arrays.sort(arr, c);
		return arr;
	}
	
	public static String maxRepeatedWord(String str) 
	{
		String[] strArr = str.split(" ");
		String[] sortedStr=sortDescString(strArr);
		String maxStr=sortedStr[0];
		
		int max=0;
		for(int i=1;i<sortedStr.length;i++) 
		{
			int count=1;
			while(sortedStr[i].equalsIgnoreCase(sortedStr[i-1])) 
			{
				//System.out.println("in while loop");
				count++;
				i++;
				if(i==sortedStr.length)
					break;
			}
			if(count>max) 
			{
				maxStr=sortedStr[i-1];
				max=count;
			}		
		}
		return maxStr;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
//		String[] arr= {"The","ascipated", "in", "a", "sleip"};
//		String[] sorted= sortDescString(arr);
//		for(String s:sorted) 
//		{
//			System.out.print(s+" ");
//		}
		System.out.println(maxRepeatedWord(input));
	}
}
