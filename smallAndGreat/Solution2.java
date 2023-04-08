package smallAndGreat;

public class Solution2 {
	public static int smallAndGreat(int []A)
	{
		int count=0;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<A.length;i++) {
			if(A[i]>max) {
				max=A[i];
			}
			if(A[i]<min) {
				min=A[i];
			}
		}
		for(int i=0;i<A.length;i++) {
			if(max>A[i] && min<A[i]) {
				count++;
			}
		}
		return count;
	}
}

