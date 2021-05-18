package Algorithms;

import static Algorithms.Resources.displayResult;
import static Algorithms.Resources.swap;

public class QuickSort {

  static int[] testArray = Resources.testArray;

  public static void main(String[] args) {

    QS(testArray, 0, testArray.length - 1);
    displayResult(testArray);
  }

  public static void QS(int[] array, int leftIndex, int rightIndex) {
    if (leftIndex >= rightIndex) {
      return;
    }
    int pivotElement = array[(leftIndex + rightIndex) / 2];
    int pivotIndex = partition(array, leftIndex, rightIndex, pivotElement);
    QS(array, leftIndex, pivotIndex - 1);
    QS(array, pivotIndex, rightIndex);
  }

  public static int partition(int[] array, int leftIndex, int rightIndex, int pivotElement) {
    while (leftIndex <= rightIndex) {
      while (array[leftIndex] < pivotElement) {
        leftIndex++;
      }
      while (array[rightIndex] > pivotElement) {
        rightIndex--;
      }
      if (leftIndex <= rightIndex) {
        swap(array, leftIndex, rightIndex);
        leftIndex++;
        rightIndex--;
      }

    }
    return leftIndex;
  }
}
