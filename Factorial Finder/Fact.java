import java.math.BigInteger;
import java.util.Scanner;
import java.lang.reflect.Method;

public class Fact {

	/**
	 * [ftRecursiveTail Factorial using tail recursion]
	 * @param  acc [accumulator]
	 * @param  n   [number to find factorial for]
	 * @return Factorial of n
	 */
	public static BigInteger ftRecursiveTail(BigInteger acc, BigInteger n) {
		if(n == BigInteger.ZERO)
			return acc; 
		return (ftRecursiveTail(acc.multiply(n), n.subtract(BigInteger.ONE)));
	}

	public static BigInteger ftHelper(int n) {
		return ftRecursiveTail(new BigInteger("1"), new BigInteger(String.valueOf(n)));
	}

	/**
	 * [ftRecursive Factorial using recursion]
	 * @param  n   [number to find factorial for]
	 * @return Factorial of n
	 */
	public static BigInteger ftRecursive(BigInteger n) {
		BigInteger x = BigInteger.ONE;
		if(n.compareTo(BigInteger.ONE) == 1)
			x = n.multiply(ftRecursive(n.subtract(BigInteger.ONE)));
		return x;
	}

	public static BigInteger ftRecursive(int n) {
		return ftRecursive(new BigInteger(String.valueOf(n)));
	}	


	/**
	 * [ftLoop Factorial]
	 * @param  n   [number to find factorial for]
	 * @return Factorial of n
	 */
	public static BigInteger ftLoop(int n) {
		BigInteger x = BigInteger.ONE;
		for(int i = 1 ; i <= n ; i++) {
			x = x.multiply(new BigInteger(String.valueOf(i)));
		}
		return x;		
	}

	public static void main(String[] args) {
	 	Scanner s = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int n = s.nextInt();
	    long t1, t2;
	    float dt;

	    //Tail Recursion
	    t1 = System.currentTimeMillis();
	    print("Factorial is:", ftHelper(n)); //~9918
	    t2 = System.currentTimeMillis();
	    dt = (t2 - t1); //0.477
	    dt = (float)(dt/1000f);
	    print("Tail Recursion in:", dt);

	    //Recursion
	    t1 = System.currentTimeMillis();
	    print("Factorial is:", ftRecursive(n)); //~9154
	    t2 = System.currentTimeMillis();
	    dt = (t2 - t1); //0.308
	    dt = (float)(dt/1000f);
	    print("Recursion in:", dt);

	    //Iterative
	    t1 = System.currentTimeMillis();
	    print("Factorial is:", ftLoop(n)); //~100000 //~9154 //~9918
	    t2 = System.currentTimeMillis();
	    dt = (t2 - t1); //~48.612 //0.405 //0.446
	    dt = (float)(dt/1000f);
	    print("Iterative in:", dt);
	}

	public static void print(Object... msg) {
		String new_msg = "";
        for(Object m : msg)
            new_msg = new_msg + " " + m.toString();
		System.out.println(new_msg);
	}
}