package cs3500.pa01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DriverTest {

  @Test
  public void fakeTest() {
    System.out.println("An important message...");
    assertEquals(5, 5);
  }

  @Test
  public void fakeTest2() {
    System.err.println("An error message...");
    assertEquals(6, 7);
  }

}