// { Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        int i=0,j=0;
        ArrayList<Integer> list=new ArrayList<>();
        spiral(matrix,i,j,r,c,list);
        return list;
    }
    static void spiral(int arr[][],int i,int j,int r,int c,ArrayList<Integer> list){
        if(i>=r || j>=c){
            return;
        }
        for(int a=i;a<c;a++){
            list.add(arr[i][a]);
        }
        for(int a=i+1;a<r;a++){
            list.add(arr[a][c-1]);
        }
        if(i!=r-1){
            for(int a=c-2;a>=j;a--){
                list.add(arr[r-1][a]);
            }
        }
        if(j!=c-1){
            for(int a=r-2;a>i;a--){
                list.add(arr[a][j]);
            }
        }
        spiral(arr,i+1,j+1,r-1,c-1,list);
        
    }
}
