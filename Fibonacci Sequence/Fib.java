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
	    dt = (t2 - t1);
	    dt = (float)(dt/1000f);
	    print("Tail Recursion in:", dt);

	    //Iterative
	    t1 = System.currentTimeMillis();
	    print(n + "th fibonacci number is:", fibIterative(n));
	    t2 = System.currentTimeMillis();
	    dt = (t2 - t1);
	    dt = (float)(dt/1000f);
	    print("Iterative in:", dt);

	    //Recursive
	    t1 = System.currentTimeMillis();
	    print(n + "th fibonacci number is:", fibRec(n));
	    t2 = System.currentTimeMillis();
	    dt = (t2 - t1);
	    dt = (float)(dt/1000f);
	    print("Recursive in:", dt);

	}

	/**
	 * [fibTail To find Nth Fibonacci number using tail recursion]
	 * @param  n   [position in fibonacci sequence]
	 * @return nth number in fibonacci sequence
	 */
	public static long fibTail(final int n) {
		return fibHelper(0, 1, n);
	}
	 
	private static long fibHelper(final long a, final long b, final int n) {
		return n < 1 ? a : n == 1 ?  b : fibHelper(b, a + b, n - 1);
	}

	/**
	 * [fibIterative To find Nth Fibonacci number using iterative method]
	 * @param  n   [position in fibonacci sequence]
	 * @return nth number in fibonacci sequence
	 */
	public static long fibIterative(int n) {
		if (n < 2)
	  		return n;
		long ans = 0;
	 	long n1 = 0;
	 	long n2 = 1;
	 	for(n--; n > 0; n--) {
	  		ans = n1 + n2;
	  		n1 = n2;
	  		n2 = ans;
	 	}
	 	return ans;
	}


	/**
	 * [fibRecursive To find Nth Fibonacci number using recursive method]
	 * @param  n   [position in fibonacci sequence]
	 * @return nth number in fibonacci sequence
	 */
	public static long fibRec(final int n) {
		return (n < 2) ? n : fibRec(n - 1) + fibRec(n - 2);
	}

	public static void print(Object... msg) {
		String new_msg = "";
        for(Object m : msg)
            new_msg = new_msg + " " + m.toString();
		System.out.println(new_msg);
	}

}