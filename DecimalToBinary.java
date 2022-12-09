import java.util.Scanner;

public class DecimalToBinary {
	public static String binCon(int n) {
		String s="";
		
		while(n!=0) {
			s=n%2+s;
			n=n/2;
			
		}
		int length=s.length();
		for (int i=0; i<8-length;i++) {
			s = "0"+s;
		}
		return s;
	}

	public static int userInp() {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value: ");
		int a=sc.nextInt();
		return a;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int i=1, c = 0,d = 0,e = 0,a = 0;
		while(i!=0) {
			a=userInp();
			c= c | a;
			d= d & a;
			e= e ^ a;
			System.out.println(a+" : "+binCon(a));
			System.out.println("To enter input press 1.");
			System.out.println("To exit press 0.");
			i=sc.nextInt();
		}		System.out.println("After OR "+c+" : "+binCon(c));
		System.out.println("After AND "+d+" : "+binCon(d));
		System.out.println("After XOR "+e+" : "+binCon(e));
		int neg=~4;
		System.out.println(neg);
		sc.close();
	}

}
