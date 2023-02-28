package numberOfOneBits;

public class Solution {
	public int numSetBits(int A) {
        int count=0;
        while(A!=0)
        {
            if(A%2==1){
                count++;
            }
            A=A>>1;
        }
        return count;
    }
}
