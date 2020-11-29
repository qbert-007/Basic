package adapt.mohit;


import java.util.Scanner;

public class SubstringSets 
{
	public static void main(String[] args) 
	{
		System.out.println("Starting");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		input=input.toLowerCase();
		int fromIndex=0;
		int count=0;
		while(fromIndex<input.length()) {
			System.out.println("in loop");
			int i=input.indexOf("the", fromIndex);
			if(i!=-1) {
				count++;
			}else {
				break;
			}
			fromIndex=i+3;
		}
		System.out.println(count);
		sc.close();
	}
}
