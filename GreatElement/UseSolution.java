package GreatElement;

public class UseSolution {

	public static void main(String[] args) {
		SolutionOptimize sol=new SolutionOptimize();
		int []arr={1,2,3,4,5};
		int []arr2=sol.solve(arr);
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]);
			System.out.print(" ");
		}

	}

}
