package fibonacci;

public class FibonacciFunctionalIterationTest extends FibonacciTest {

  @Override
  protected Fibonacci createFibonacci() {
    return new FibonacciFunctionalIteration();
  }
}
