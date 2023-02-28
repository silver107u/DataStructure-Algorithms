package singleNumber;

public class Solution {
	    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
	public int singleNumber(final int[] A){
		int xor=0;
	    for(int i=0;i<A.length;i++){
	    	xor=xor^A[i];
	    	}
	    // System.out.print(xor);
	    return xor;
	    }
}
