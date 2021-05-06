package Queues;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class QueueTest {

  @Test
  public void testIsEmpty() {
    Queue queue = new Queue();

    assertTrue(queue.isEmpty());
  }

  @Test
  public void testAddToTail() {
    Queue queue = new Queue();
    queue.add(1);

    assertEquals(1, queue.head.data, "Adding 1 to a new queue should make 1 the head & tail");
  }


}
