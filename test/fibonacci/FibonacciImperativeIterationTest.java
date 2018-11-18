package fibonacci;

public class FibonacciImperativeIterationTest extends FibonacciTest {

  @Override
  protected Fibonacci createFibonacci() {
    return new FibonacciImperativeIteration();
  }
}
