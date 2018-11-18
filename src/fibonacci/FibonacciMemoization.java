package fibonacci;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FibonacciMemoization extends FibonacciRecursion {

  private static Map<Integer, BigInteger> cache = new HashMap<>();

  @Override
  public BigInteger getFibonacciNumber(int position) {
    if (!cache.containsKey(position)) {
      cache.put(position, super.getFibonacciNumber(position));
    }

    return cache.get(position);
  }
}
