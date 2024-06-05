package recursivas;

public class Fibonacci {

	public static void main(String[] args) {
		long fib1 = fibonacci(30);
		long fib2 = fibonacci(29);
		System.out.println((double)fib1/fib2);

	}

	public static long fibonacci(int posicion) {
		long res = 0;
		if(posicion == 1 || posicion == 2) {
			res = 1;
		} else {
			res = fibonacci(posicion-1) + fibonacci(posicion-2);
		}
		return res;
	}
}
