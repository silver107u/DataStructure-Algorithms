package bitManipulation;

/*
 Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
Find the two integers that appear only once.
 * */

public class FindTwoUniqueElement {
	
	public static int xorValue(int []arr) {
		int xor=arr[0];
		/*for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}*/
		for(int i=1;i<arr.length;i++) {
			//System.out.println(arr[i]);
			if(arr[i]!=0) {
				//System.out.println(arr[i]);
				xor=xor^arr[i];
			}
			else {
				break;
			}
		}
		return xor;
	}
	
	public static void main(String[] args) {
		int []arr= {10,8,8,21,9,12,9,6,11,10,6,12,17,21};
		int []setArr=new int[arr.length];
		int set=0;
		int []unsetArr=new int[arr.length];
		int unset=0;
		int xor=arr[0];
		int firstSetBit=0;
		int findBit;
		/*for(int i=1;i<arr.length;i++) {
			xor=xor^arr[i];
		}*/
		// Find xor of all element
		xor=FindTwoUniqueElement.xorValue(arr);
		System.out.println(xor);
		/*Find first set bit for xored value for divide the array into 2 parts. We are looking for set bit 
		as set bit in xor means different bit and we are dividing array in two array based on differences. */
		
		while(xor!=0) {
			if((xor & 1)==1) {
				break;
			}
			firstSetBit++;
			xor=xor>>1;
		}
		//System.out.println(firstSetBit);
		
		for(int i=0;i<arr.length;i++) {
			findBit=arr[i]>>firstSetBit;
			if((findBit&1)==1) {
				setArr[set]=arr[i];
				set++;
			}
			else {
				unsetArr[unset]=arr[i];
				unset++;
			}
		}
		/*xor=setArr[0];
		for(int i=1;setArr[i]!=0;i++) {
			//System.out.println(setArr[i]);
			xor=xor^setArr[i];
		}*/
		xor=FindTwoUniqueElement.xorValue(setArr);
		System.out.println(xor);
		/*xor=unsetArr[0];
		for(int i=1;unsetArr[i]!=0;i++) {
			xor=xor^unsetArr[i];
			//System.out.println(unsetArr[i]);
		}
		System.out.println(xor);*/
		xor=FindTwoUniqueElement.xorValue(unsetArr);
		System.out.println(xor);
	}

}
