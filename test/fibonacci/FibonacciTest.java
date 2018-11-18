package fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class FibonacciTest {

  private Fibonacci fibonacci;

  protected abstract Fibonacci createFibonacci();

  @BeforeEach
  public void setup() {
    fibonacci = createFibonacci();
  }

  @Test
  public void canary() {
    assert(true);
  }

  @Test
  public void zerothPositionOfFibonacci() {
    assertEquals(BigInteger.ONE, fibonacci.getFibonacciNumber(0));
  }

  @Test
  public void firstPositionOfFibonacci() {
    assertEquals(BigInteger.ONE, fibonacci.getFibonacciNumber(1));
  }

  @Test
  public void secondPositionOfFibonacci() {
    assertEquals(BigInteger.valueOf(2), fibonacci.getFibonacciNumber(2));
  }

  @Test
  public void fifthPositionOfFibonacci() {
    assertEquals(BigInteger.valueOf(8), fibonacci.getFibonacciNumber(5));
  }

  @Test
  public void seventhPositionOfFibonacci() {
    assertEquals(BigInteger.valueOf(21), fibonacci.getFibonacciNumber(7));
  }

  @Test
  public void invalidPositionOfFibonacci() {
    assertEquals(BigInteger.ONE, fibonacci.getFibonacciNumber(-1));
  }

}
