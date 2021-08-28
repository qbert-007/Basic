// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String S){
        // code here
        String result=""+S.charAt(0);
        int low,high;
        for(int i=1;i<S.length();i++){
            low=i-1;
            high=i;
            //for even
            while(low>=0 && high<S.length() && S.charAt(low)==S.charAt(high)){
                low--;
                high++;
            }
            low++;
            high--;
            if(high-low+1>result.length()){
                result=S.substring(low,high+1);
            }
            //for odd
            low=i-1;
            high=i+1;
            while(low>=0 && high<S.length() && S.charAt(low)==S.charAt(high)){
                low--;
                high++;
            }
            low++;
            high--;
            if(high-low+1>result.length()){
                result=S.substring(low,high+1);
            }
        }
        return result;
    }
}
