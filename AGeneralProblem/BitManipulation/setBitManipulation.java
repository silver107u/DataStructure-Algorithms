package bitManipulation;
// Check if given (i)th bit of number n is set or unset
public class setBitManipulation {
public static void main(String[] args) {
	int n=1;
	int i=2;
	int bit=n>>i;
	if((bit & 1)==1) {
		System.out.println("bit is set");
	}
	else {
		System.out.println("bit is not set");
	}
	
}
}
