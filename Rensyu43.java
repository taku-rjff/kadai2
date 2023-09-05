import java.util.Scanner;

public class Rensyu43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("2以上の整数:");
		n = sc.nextInt();
		sc.close();
		System.out.println(" 長さ:" + main(n));
		
	}
	
	static int main(int x) {
		 int y = 1;
		 System.out.print(x);
		 while(x >= 2) {
		 
		 if(x % 2 == 0) {
			 x = x / 2;
			 System.out.print(" "+ x);
			 y++;
		 }
		 else if(x % 2 == 1) {
			 x = x * 3 + 1;
			 System.out.print(" "+ x);
			 y++;
		 }
		}
		 return y;
	}


}
