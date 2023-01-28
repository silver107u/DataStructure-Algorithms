package minimumPicks;

public class Solution {
	public int solve(int[] A) {
        int maxEven=Integer.MIN_VALUE;
        int minOdd=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0 && A[i]>maxEven){
                maxEven=A[i];
            }
            else if((A[i]%2==1 || A[i]%2==-1)&& A[i]<minOdd){
                minOdd=A[i];
            }
        }
        //System.out.print(maxEven);
        //System.out.print(minOdd);
        return (maxEven-minOdd);
    }
}
