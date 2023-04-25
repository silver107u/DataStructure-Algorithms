package adjacentDifferencesArray;

public class Solution {
	public int[] solve(int[] A) {
		int []sol=new int[A.length-1];
		//System.out.println(sol);
		for(int i=1;i<A.length;i++) {
			sol[i-1]=A[i]-A[i-1];
		}
		return sol;
	}
}
