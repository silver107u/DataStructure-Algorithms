package singleNumber3;

public class Solution {

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


    public int[] solve(int[] arr) {

        int []setArr=new int[arr.length];
		int set=0;
		int []unsetArr=new int[arr.length];
		int unset=0;
		int xor=arr[0];
		int firstSetBit=0;
		int findBit;
        int []uniqueElement=new int[2];

        xor=Solution.xorValue(arr);

        while(xor!=0) {
		if((xor & 1)==1) {
			break;
		}
		firstSetBit++;
		xor=xor>>1;
		}

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


        xor=Solution.xorValue(setArr);
        uniqueElement[0]=xor;

        xor=Solution.xorValue(unsetArr);
        uniqueElement[1]=xor;

        if(uniqueElement[0]>uniqueElement[1]){
            int temp=uniqueElement[0];
            uniqueElement[0]=uniqueElement[1];
            uniqueElement[1]=temp;
        }

        

        return uniqueElement;
        
    }
    

}
