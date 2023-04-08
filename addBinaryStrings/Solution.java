package addBinaryStrings;
// General Method. good for the small String
public class Solution {
	public String addBinary(String A, String B) {
		int a=Integer.parseInt(A);
		int b=Integer.parseInt(B);
		int max=a>b?a:b;
		String sum="";
		String sum2="";
		int carry=0;
		int intermediate;
		while(max!=0) {
			intermediate=(a%10+b%10+carry)%2;
			sum=sum+intermediate;
			carry=(a%10+b%10+carry)/2;
			a=a/10;
			b=b/10;
			max=max/10;
		}
		if(carry==1) {
			sum=sum+carry;
		}
		// System.out.println(sum.length());
		for(int i=sum.length()-1;i>=0;i--) {
			//sum2=sum2+sum.charAt(i);
			// System.out.println(sum.charAt(i));
			sum2=sum2+sum.charAt(i);
		}
		//System.out.println(sum2);
		return sum2;
	}
}
