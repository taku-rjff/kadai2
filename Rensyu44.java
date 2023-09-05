public class Rensyu44 {

	public static void main(String[] args) {
		int[] n = {10 , 5 , 20 , 15 , 25 };
		System.out.println("最大値;" + main(n));

	}
	
	static int main(int[] x) {
		int max = x[0];
	 for(int i = 1 ; i < x.length ; i++) {
	  if(max >= x[i]) {
		 max = x[0] ;
		 
	  }else if(max <= x[i]) {
    	 max = x[i];
	 }
	 }
	 
	 return max;
	}


}
