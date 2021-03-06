public class Demo {
  public static void printLoop(int n) {
    for (int i = 1; i <= n ; i++) {
      for (int j = i; j <= n; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }

  public static String arrToString(int[] arr) {
    if (arr.length == 0) {
    return "{}";
    }
    String answer = "{";
    for (int i = 0; i < arr.length - 1; i++) {
      answer = answer + arr[i] + ", ";
    }
    answer = answer + arr[arr.length - 1] + "}";
    return answer;
  }

  public static String arrayDeepToString(int[][] arr) {
    if (arr.length == 0) {
    return "{}";
    }
    String answer = "{";
    for (int i = 0; i < arr.length - 1; i++) {
      answer = answer + arrToString(arr[i]) + ", ";
    }
    answer = answer + arrToString(arr[arr.length - 1]) + "}";
    return answer;
  }

  public static int[][] create2DArray(int rows, int cols, int maxValue) {
    int[][]arr = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        arr[i][j] = (int)(Math.random() * (maxValue + 1));
      }
    }
    return arr;
  }

  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
    int[][]arr = new int[rows][];
    for (int i = 0; i < rows; i++) {
      int randomCols = (int)(Math.random() * (cols + 1));
      arr[i] = new int[randomCols];
      for (int j = 0; j < randomCols; j++) {
        arr[i][j] = (int)(Math.random() * (maxValue + 1));
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    if (args.length > 0) {
      printLoop(Integer.parseInt(args[0]));
    } else
      printLoop(5);
  }
}

/****************************************************************************
TEST CASES

For arrToString
public static void main(String[] args) {
  int[]one = {1, 2, 3, 4, 5};
  int[]two = {10, 100, 1000};
  int[]three = {0, 0, 0, 0, 0};
  int[]four = {1, 2, 3, 4, 5, 6, 7, 8, 9};
  int[]five = {0, 5, 10, 15, 20};
  System.out.println(arrToString(one));
  System.out.println(arrToString(two));
  System.out.println(arrToString(three));
  System.out.println(arrToString(four));
  System.out.println(arrToString(five));
}

For arrayDeepToString
public static void main(String[] args) {
int[][]one = {{1, 2, 3}, {}, {8, 2, 3, 1}, {1}};
int[][]two = {{10, 100, 1000}, {0, 0, 0, 0, 0}, {0, 5, 10, 15, 20}};
System.out.println(arrayDeepToString(one).replace("}, ","},\n"));
System.out.println(arrayDeepToString(two).replace("}, ","},\n"));
}

For create2DArray
public static void main(String[] args) {
  System.out.println(arrayDeepToString(create2DArray(5,4,4)));
  System.out.println(arrayDeepToString(create2DArray(6,2,3)));
  System.out.println(arrayDeepToString(create2DArray(5,3,10)));
}

For create2DArrayRandomized
public static void main(String[] args) {
  System.out.println(arrayDeepToString(create2DArrayRandomized(6,4,4)));
  System.out.println(arrayDeepToString(create2DArrayRandomized(5,3,10)));
  System.out.println(arrayDeepToString(create2DArrayRandomized(4,10,100)));
}

****************************************************************************/
