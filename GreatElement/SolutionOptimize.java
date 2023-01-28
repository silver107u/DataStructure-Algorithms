package GreatElement;

public class SolutionOptimize {
	public int[] solve(int[] A) {
        int max1=A[0];
        int max2=Integer.MIN_VALUE;
        int n=A.length-2;
        int []solve=new int[n];
        int k=0;
        // Find Maximum Value 
        for(int i=1;i<A.length;i++){
            if(A[i]>max1){
                max1=A[i];
            }
        }

        // Find Second Maximim value 
        for(int i=0;i<A.length;i++){
            if(max1!=A[i]&&A[i]>max2){
                max2=A[i];
            }
        }
        //System.out.print(max1);
        //System.out.print(max2);
        // elements which are less then max1 and max2
        for (int i=0;i<A.length;i++){
            if(max2!=A[i]&& max1!=A[i])
            {
                solve[k]=A[i];
                k++;
            }
        }
        return solve;
    }
}
