package lowerTriangularMatrix;

public class Solution {
	public int solve(final int[][] A) {
		int islower;
		boolean flag=false;
		for(int i=0;i<A.length;i++) {
			for(int j=i+1;j<A[i].length;j++) {
				if(A[i][j]!=0) {
					flag=true;
					break;
				}
			}
		}
		if(flag) {
			islower=0;
		}
		else {
			islower=1;
		}
		return islower;
    }
}
