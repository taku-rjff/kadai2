import java.util.Scanner;

public class Rensyu41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k;
		System.out.print("0以上の整数:");
		n = sc.nextInt();
		System.out.print("引数:");
		k = sc.nextInt();
		sc.close();
		
		System.out.println(power(n, k));

	}
	
	static int power(int x, int y) {
	 int z = 1;
	 for(int i = 1; i <= y ; i++) {
	 z = z * x;
	 }
	 return z;
	}


}
