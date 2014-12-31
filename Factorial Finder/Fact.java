import java.math.BigInteger;
import java.util.Scanner;

public class Fact {

	/**
	 * [ftRecursiveTail Factorial using tail recursion]
	 * @param  acc [accumulator]
	 * @param  n   [number to find factorial for]
	 * @return Factorial of n [description]
	 */
	public static BigInteger ftRecursiveTail(BigInteger acc, BigInteger n) {
		if(n == BigInteger.ZERO)
			return acc; 
		return (ftRecursiveTail(acc.multiply(n), n.subtract(BigInteger.ONE)));
	}

	public static BigInteger ftHelper(int n) {
		return ftRecursiveTail(new BigInteger("1"), new BigInteger(String.valueOf(n)));
	}

	public static void main(String[] args) {
	 	Scanner s = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int n = s.nextInt();
	    long t1 = System.currentTimeMillis();
	    print("Factorial is:", ftHelper(n)); //~9918
	    long t2 = System.currentTimeMillis();
	    float dt = (t2 - t1);
	    dt = (float)((float)dt/(float)1000);
	    print("Tail Recursion in:", dt);
	}

	public static void print(Object... msg) {
		String new_msg = "";
        for(Object m : msg)
            new_msg = new_msg + " " + m.toString();
		System.out.println(new_msg);
	}
}