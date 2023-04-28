package singleNumber3;

public class UseSolution {
	public static void main(String[] args) {
		int []arr= {10,8,8,21,9,12,9,6,11,10,6,12,17,21};
		Solution s=new Solution();
		int []uniqueElement= new int[2];
		uniqueElement=s.solve(arr);
		System.out.print(uniqueElement[0]);
		System.out.print(" "+uniqueElement[1]);
	}
}
