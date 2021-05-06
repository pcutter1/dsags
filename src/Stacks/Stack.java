package Stacks;

import LinkedLists.Node;

public class Stack {

  Node top;

  public boolean isEmpty(){
    return top == null;
  }

  public void push(Object obj) {
    Node node = new Node(obj);
    node.next = top;
    top = node;
  }

  public Object peek() {
    return top.data;
  }

  public Object pop() {
    Object returnData = top.data;
    top = top.next;
    return returnData;
  }

}
