package reverseBit;

public class Solution {
	public long reverse(long A) {
		long B=A;
		long C=0L;
		int i=0;
        int bit=32;
        System.out.println(B);
        while(B!=0){
        	if((B&1)==1)
        	{
                C=C<<1;
                C=C|1;
            }
            else{
                C=C<<1;
                C=C|0;
            }
            i++;
            B=B>>1;
            //System.out.println(i+"----"+B+"------"+C);
        }
        bit=bit-i;
        C=C<<bit;

        return C;
	}
}
