package session_2old;

/*
 * problem Statement: Given N array of elements, every element repeat twice except one. find that unique element. 
 * 
 * Time Complexity should be O(n)
 * */

public class UniqueElement {
	public static void main(String[] args) {
		int []arr= {4,7,6,4,8,7,6};
		int unique=0;
		for(int i=0;i<arr.length;i++)
		{
			unique=unique^arr[i];
		}
		System.out.println(unique);
	}
}
