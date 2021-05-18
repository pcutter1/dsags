package Algorithms;

import static Algorithms.Resources.displayResult;
import static Algorithms.Resources.swap;
import static Algorithms.Resources.testArray;

public class BubbleSort {


    public static void main(String[] args) {

      int[] intArray = testArray;

      for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
          lastUnsortedIndex--) {
        for (int i = 0; i < lastUnsortedIndex; i++) {
          if (intArray[i] > intArray[i+1]) {
            swap(intArray, i, i+1);
          }
        }
      }

      displayResult(intArray);

  }

}
