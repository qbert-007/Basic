// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args)throws IOException
	{

// 		Scanner in = new Scanner(System.in);
        
// 		int t = in.nextInt();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
         //testcases
        int t = Integer.parseInt(read.readLine());
		
		while(t-- >0)
		{
		    //size of array
		    int n = Integer.parseInt(read.readLine());
		    int[] temp= new int[n];
		    
		    String str[] = read.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0;i<n;i++)
		        temp[i] = Integer.parseInt(str[i]);
		    
		    // StringBuffer sb = new StringBuffer();
		    
		    Solution ob = new Solution();
		    
		    //calling rearrange() function
		    ob.rearrange(temp, n);
		    StringBuffer sb = new StringBuffer();
		    
		    //appending and printing the elements
		    for(int i =0; i < n; i++)
		     sb.append(temp[i] + " ");
		    System.out.println(sb);
		}
	}
}



// } Driver Code Ends


class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(int arr[], int n){
        
        // Your code here
       /* 
        int iter=n/2;
        int pos=-1;
        while(iter>0){
            int last=arr[n-1];
            for(int i=n-1;i>pos+1;i--){
            arr[i]=arr[i-1];
            }
            arr[pos+1]=last;
            pos=pos+2;
            iter--;
        }
        
        */
        int randomMax=arr[n-1]+1;
        int left=0;
        int right=n-1;
        
        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[i]=arr[i]+(arr[right]%randomMax)*randomMax;
                right--;
            }else{
                arr[i]=arr[i]+(arr[left]%randomMax)*randomMax;
                left++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=arr[i]/randomMax;
        }
        
    }
    
}


