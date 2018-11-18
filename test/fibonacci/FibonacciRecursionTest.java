package fibonacci;

public class FibonacciRecursionTest extends FibonacciTest {

  @Override
  protected Fibonacci createFibonacci() {
    return new FibonacciRecursion();
  }
}
