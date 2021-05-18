package Algorithms;

public class Resources {


   public static final int[] testArray = {20, 35, -15, 7, 55, 1, -22};


    public static void swap(int[] array, int i, int j) {
      if (i == j) {
        return;
      }

      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;

    }

    public static void displayResult(int[] intArray) {
      for (int j : intArray) {
        System.out.println(j);
      }
    }


  }

