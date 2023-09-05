import java.util.Scanner;

public class Rensyu42 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.print("1以上の整数:");
		x = sc.nextInt();
		sc.close();
		
		System.out.println(main(x)+"桁");

	}
	
	static int main(int n) {
	 int i = 0;
	 while(n > 0) {
	 n /= 10 ;
	 i++;
	 }
	 
	 return i;
	}


}