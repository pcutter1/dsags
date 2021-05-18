package Algorithms;

public class MergeSort {

  static int[] testArray = Resources.testArray;
  public static void main(String[] args) {

    MS(testArray, 0, testArray.length);
    Resources.displayResult(testArray);

  }

  static void MS(int[] array, int startIndex, int endIndex) {

    if (endIndex - startIndex < 2) {
      return;
    }

    int midIndex = (startIndex + endIndex) / 2;
    MS(array, startIndex, midIndex);
    MS(array, midIndex, endIndex);

    merge(array, startIndex, midIndex, endIndex);
  }

  public static void merge (int[] input, int startIndex, int midIndex, int endIndex) {

    if (input[midIndex - 1] <= input[midIndex]) {
      return;
    }

    int i = startIndex;
    int j = midIndex;
    int tempIndex = 0;

    int[] temp = new int[endIndex-startIndex];

    while (i < midIndex && j < endIndex) {
      temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
    }

    System.arraycopy(input, i, input, startIndex + tempIndex, midIndex - i);
    System.arraycopy(temp, 0, input, startIndex, tempIndex);

  }
}
