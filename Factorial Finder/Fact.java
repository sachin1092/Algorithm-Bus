import java.math.BigInteger;
import java.util.Scanner;

public class Fact {
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
	    System.out.println("Factorial is: " + ftHelper(n));
	}
}