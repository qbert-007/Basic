package adapt.mohit;

import java.util.Scanner;

public class TimeAndWork 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of workers: ");
		int workers=sc.nextInt();
		int []days=new int[workers];
		int totalWork=1;
		System.out.println("Enter no. of days for each worker: ");
		for(int i=0;i<workers;i++)
		{
			days[i]=sc.nextInt();
			totalWork=totalWork*days[i];
		}
		//they can complete work together
		int []oneDayWork=new int[workers];
		int totalOneDayWork=0;
		for(int i=0;i<workers;i++) 
		{
			oneDayWork[i]=totalWork/days[i];
			totalOneDayWork+=oneDayWork[i];
		}
		System.out.println("Together they can complete in "+(totalWork/totalOneDayWork)+" days");
		sc.close();
	}
}
