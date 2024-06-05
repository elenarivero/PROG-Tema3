package recursivas;

public class Recursivas {

	public static void main(String[] args) {
		long factorial = factorial(7);
		System.out.println(factorial);
	}

	static long factorial(int num) {
		long res=0;
		if(num == 0) {
			res = 1;
		} else {
			res = num*factorial(num-1);
		}
		
		return res;
	}

}
