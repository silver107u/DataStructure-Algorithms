package evenOddElements;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner kb=new Scanner(System.in);

        int T=kb.nextInt();
        int N;
     	int even=0;
     	int odd=0;
     	int []arr;
        // System.out.println(T);
        while(T>0) {
        	N=kb.nextInt();
        	even=0;
        	odd=0;
        	arr=new int[N];
        	
            for(int i=0;i<N;i++) {
            		arr[i]=kb.nextInt();
            	}
            
            for(int j=0;j<N;j++) {
     		   if((arr[j]&1)==0) {
     			   even++;
     		   }
     		   else  {
     			   odd++;
     		   }
            }
     	      System.out.println(Math.abs(odd-even) );
     	      T--;
        }
         
        // System.out.println(N);
       kb.close();
    }  
}
