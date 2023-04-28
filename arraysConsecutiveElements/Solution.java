package arraysConsecutiveElements;

public class Solution {
	  public int solve(int[] A) { 
		  int  flag=0;
		  //int flag2=1;
		  int min=Integer.MAX_VALUE;
		  int max=Integer.MIN_VALUE;
		  
		  for(int i=0;i<A.length;i++) {
			  if(min>A[i]) {
				  min=A[i];
			  }
			  if(A[i]>max) {
				  max=A[i];
			  }
		  }
		  for(int i=min+1;i<max;i++) {
			  for(int j=0;j<A.length;j++) {
				  if(A[j]==i) {
					  flag=1;
					  break;
				  }
				  else {
					  flag=0;
				  }
				}
			  if(flag==0) {
				  break;
			  }
		  }
		  
		  //System.out.println(min);
		  //System.out.println(max);
		  //flag=(max-min+1)==A.length?1:0;
		  
		  if(min==max) {
			  flag=1;
		  }
		  return flag;
	  }
}
