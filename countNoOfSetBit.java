
public class countNoOfSetBit {

	public static int countSetBit(int n) {
		int count=0;
		while(n!=0) {
			n=n&(n-1);
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countSetBit(128));
	}

}
