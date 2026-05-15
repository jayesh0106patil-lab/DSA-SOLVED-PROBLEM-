public class bubbleSort {

  static void Sort(int[] a) {
    for (int i = 0; i < a.length - 1; i++) {
      boolean flag = false;
      for (int j = 0; j < a.length - 1 - i; j++) {
        if (a[j] > a[j + 1]) {
          int temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
          flag = true;

        }
      }
      if (!flag) {
        return;
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = { 5, 7, 6, 1, 8, 2, -2, 100 };
    Sort(arr);
    for (int i : arr) {
      System.out.println(i);
    }
  }
}