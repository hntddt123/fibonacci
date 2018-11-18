package fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FibonacciPerformanceTest {

  @Test
  public void fiftiethPositionOfFibonacciPerformanceComparison() {
    assertTrue(timeElapsed(new FibonacciMemoization()) * 10 
      < timeElapsed(new FibonacciRecursion()));
  }

  private long timeElapsed(Fibonacci fibonacci) {
    long startTime = System.currentTimeMillis();
    fibonacci.getFibonacciNumber(40);
    return System.currentTimeMillis() - startTime;
  }
}
