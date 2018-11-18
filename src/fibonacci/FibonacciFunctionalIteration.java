package fibonacci;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Stream;

public class FibonacciFunctionalIteration implements Fibonacci {

  public BigInteger getFibonacciNumber(int position) {
    if (position < 2) {
      return BigInteger.ONE;
    }

    return Stream.iterate(List.of(BigInteger.ONE, BigInteger.ONE), current ->
        List.of(current.get(1), current.get(0).add(current.get(1))))
      .limit(position + 1)
      .skip(position)
      .findFirst()
      .orElseThrow()
      .get(0);
  }
}
