
public class FibonacciQ1 {
	public static void main(String args[]) {
		int n = 20, a = 1, b = 1, fib, sum = 2;
		System.out.print(a+" "+b+" ");
		for (int i = 1; i <= 18; i++) {
			fib = a + b;
			a = b;
			b = fib;
			sum += fib;
			System.out.print(fib+" ");
		}
		System.out.println();
		System.out.print("The average of Fib series = " + (float)sum / n);
	}
}