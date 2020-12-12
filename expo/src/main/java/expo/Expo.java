package expo;

/**
 * A simple class for performing exponentiation on long integers
 * 
 * @author doug.roesch@gmail.com
 */
public class Expo {

	/**
	 * Returns the product of a base integer and its exponent
	 * 
	 * @param a the base integer
	 * @param b the exponent
	 * @return the result of a ** b
	 */
	public double expo(long a, long b) {
		return Math.pow(a, b);
	}

}
