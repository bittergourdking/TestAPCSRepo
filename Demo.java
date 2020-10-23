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


  public static void main(String[] args) {
    if (args.length > 0) {
      printLoop(Integer.parseInt(args[0]));
    } else
      printLoop(5);
  }
}
