package patternPrinting;

public class PatternOne {
	public int[][] solve(int A) {
        int [][]arr=new int[A][A];
        for(int i=0;i<A;i++){
            int k=1;
            for(int j=0;j<=i;j++){
                arr[i][j]=k;
                k++;
            }
        }
        return arr;
    }
}
