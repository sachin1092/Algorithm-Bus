import java.util.Scanner;

public class Fib {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int n = s.nextInt();
	    long t1, t2;
	    float dt;

	    //Tail Recursion
	    t1 = System.currentTimeMillis();
	    print(n + "th fibonacci number is:", fibTail(n));
	    t2 = System.currentTimeMillis();
	    dt = (t2 - t1); //0.477 //0.379
	    dt = (float)(dt/1000f);
	    print("Tail Recursion in:", dt);

	}

	/**
	 * [ftTail To find Nth Fibonacci number using tail recursion]
	 * @param  n   [position in fibonacci sequence]
	 * @return nth number in fibonacci sequence
	 */
	public static long fibTail(final int n) {
		return fibHelper(0, 1, n);
	}
	 
	private static long fibHelper(final long a, final long b, final int n) {
		return n < 1 ? a : n == 1 ?  b : fibHelper(b, a + b, n - 1);
	}

}