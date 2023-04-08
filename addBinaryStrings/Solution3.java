package addBinaryStrings;

// Good for long string which are out of length or bound for normal even long capacity
// A=1010110111001101101000
// B=1000011011000000111100110

public class Solution3 {
	public String addBinary(String A, String B) {
		String max;
		String min;
		String sum="";
		String carry="0";
		if(A.length()>B.length()) {
			max=A;
			min=B;
		}
		else {
			max=B;
			min=A;
		}
		//System.out.println(min.length());
		//System.out.println(max.length());
		for(int i=min.length()+1;i<=max.length();i++) {
			min="0"+min;
		}
		//System.out.println(min);
		//System.out.println(max);
		for(int i=max.length()-1;i>=0;i--) {
			if(carry=="0") {
				if(max.charAt(i)=='0'&&min.charAt(i)=='0') {
					// sum=sum+"0";
					sum="0"+sum;
					carry="0";
				}
				else if(max.charAt(i)=='1'&&min.charAt(i)=='0') {
					// sum=sum+"1";
					sum="1"+sum;
					carry="0";
				}
				else if(max.charAt(i)=='0'&&min.charAt(i)=='1') {
					// sum=sum+"1";
					sum="1"+sum;
					carry="0";
				}
				else if(max.charAt(i)=='1'&&min.charAt(i)=='1') {
					// sum=sum+"0";
					sum="0"+sum;
					carry="1";
				}
			}
			else if(carry=="1") {
					if(max.charAt(i)=='0'&&min.charAt(i)=='0') {
						// sum=sum+"1";
						sum="1"+sum;
						carry="0";
					}
					else if(max.charAt(i)=='1'&&min.charAt(i)=='0') {
						//sum=sum+"0";
						sum="0"+sum;
						carry="1";
					}
					else if(max.charAt(i)=='0'&&min.charAt(i)=='1') {
						// sum=sum+"0";
						sum="0"+sum;
						carry="1";
					}
					else if(max.charAt(i)=='1'&&min.charAt(i)=='1') {
						// sum=sum+"1";
						sum="1"+sum;
						carry="1";
				}
			}
			// System.out.println(sum);
		}
		if(carry=="1") {
			sum=carry+sum;
		}
		return sum;
	}

}
