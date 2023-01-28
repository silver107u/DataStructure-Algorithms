package GreatElement;

public class Solution {
	public int[] solve(int[] A) {
	       int n=A.length-2;
	       int []arr=new int[n];
	       int k=0;
	       for(int i=0;i<A.length;i++){
	           int count=0;
	           for (int j=0;j<A.length;j++){
	               if(A[j]>A[i]){
	                   count++;
	               }
	           }
	           if(count>1){
	               arr[k]=A[i];
	               k++;
	           }

	       }
	       return arr;
	}
}
