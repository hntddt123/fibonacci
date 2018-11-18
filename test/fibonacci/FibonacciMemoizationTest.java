package fibonacci;

public class FibonacciMemoizationTest extends FibonacciTest {

  @Override
  protected Fibonacci createFibonacci() {
    return new FibonacciMemoization();
  }
}
