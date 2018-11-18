package fibonacci;

import java.math.BigInteger;

public class FibonacciRecursion implements Fibonacci {

  public BigInteger getFibonacciNumber(int position) {
    if (position < 2) {
      return BigInteger.ONE;
    }

    return getFibonacciNumber(position - 1)
      .add(getFibonacciNumber(position - 2));
  }
}
