package Stacks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StackTest {

  @Test
  public void testIsEmpty() {

    Stack stack = new Stack();

    assertTrue(stack.isEmpty());
  }

  @Test
  public void testPeek() {
    Stack stack = new Stack();
    stack.push(5);
    stack.push("no way");
    stack.push(10);

    assertEquals(10, stack.peek(), "Peek should retrun the value of the top node");
  }

  @Test
  public void testPush(){
    Stack stack = new Stack();
    stack.push(5);
    stack.push(false);

    assertEquals(false, stack.top.data, "Adding an item should return the top item");
  }


  @Test
  public void testPopReturn() {
    Stack stack = new Stack();
    stack.push(5);
    stack.push("no way");
    stack.push(10);
    Object actual = stack.pop();

    assertEquals(10, actual, "Pop method should return the value of the top item and remove from stack");
  }

  @Test
  public void testNewTopAfterPop() {
    Stack stack = new Stack();
    stack.push(5);
    stack.push("no way");
    stack.push(10);
    stack.pop();

    assertEquals("no way", stack.top.data, "Pop method should remove last top from stack");
  }


}
