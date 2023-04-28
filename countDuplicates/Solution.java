package countDuplicates;

import java.util.Arrays;

public class Solution {
	public int solve(final int[] A) {
        int count=0;
        int []B=A;
        Arrays.sort(B);
        
        
        for(int i=1;i<B.length;i++) {
        	// System.out.println(A[i]);
        	if(A[i]==A[i-1]) {
        		count++;
        	}
        }
        
        return count;
    }
}
