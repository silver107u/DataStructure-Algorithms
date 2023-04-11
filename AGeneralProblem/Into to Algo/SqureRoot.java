// Check where the number is perfect square or not. Return number 

package session_1;

//Time complexity--> root of N

public class SqureRoot {
	public static void main(String[] args) {
		int n=160;
		int i=1;
		int sqr;
		do {
				sqr=i*i;
				if(sqr==n) {
					System.out.print("Squre root of "+n+" is "+i);
					break;
				}
				i++;
			}while(n>sqr);
		if(sqr>n){
			System.out.print("Squre root of "+n+" is not found because number is not perfect square");
		}
	}
}
