package adjacentDifferencesArray;

public class UseSolution {
	public static void main(String[] args) {
		Solution s = new Solution();
		int []a= {2};
		int [] sol= s.solve(a);
		for(int i=0;i<sol.length;i++) {
			System.out.println(sol[i]);
		}
	}
}
