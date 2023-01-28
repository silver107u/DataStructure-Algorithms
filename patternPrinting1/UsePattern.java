package patternPrinting;

public class UsePattern {

	public static void main(String[] args) {
		PatternOne pa=new PatternOne();
		int A=3;
		int [][]arr=pa.solve(A);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		

	}

}
