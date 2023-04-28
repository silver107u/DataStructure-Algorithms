package isIdentityMatrix;

public class Solution {
    public int solve(final int[][] A) {
    	//int isIdentity=0;
    	//boolean flag=false;
    	for(int i=0;i<A.length;i++) {
    		for(int j=0;j<A[i].length;j++) {
    			if(i==j&&A[i][j]!=1) {
    				// System.out.println(A[i][j]);
    				return 0;
    			}
    			else if(i!=j&&A[i][j]!=0) {
    				// System.out.println(A[i][j]);
    				return 0;
    			}
    		}
    	}
    	return 1;
    }
}
