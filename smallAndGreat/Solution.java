package smallAndGreat;

public class Solution {
	
	public int solve(int[] A) {
        int min=A[0];
        int max=A[0];
        int count=0;
        for( int i=1;i<A.length;i++)
        {
            if(min>A[i])
            {
                min=A[i];
            }
            if(max<A[i]){
                max=A[i];
            }
        }
        for(int i=0;i<A.length;i++){
            if(max!=A[i]&&min!=A[i])
            {
                count++;
            }
        }
        return count;
    }
}
