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
    answer = answer + "}";
    return answer;
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
System.out.println(arrayDeepToString(one));
System.out.println(arrayDeepToString(two));
}

****************************************************************************/
