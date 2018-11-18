package fibonacci;

import java.math.BigInteger;

public class FibonacciImperativeIteration implements Fibonacci {

  public BigInteger getFibonacciNumber(int position) {
    if (position < 2) {
      return BigInteger.ONE;
    }

    BigInteger current = BigInteger.ONE;
    BigInteger next = BigInteger.ONE;

    for (int i = 1; i < position; i++) {
      BigInteger sum = current.add(next);
      current = next;
      next = sum;
    }

    return next;
  }
}