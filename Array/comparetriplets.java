public class comparetriplets {
  public static void main(String[] args) {

    int[] a = { 17, 28, 30 };
    int[] b = { 99, 16, 8 };

    int sumA = 0;
    int sumB = 0;

    for (int i = 0; i < a.length; i++) {
      if (a[i] > b[i]) {
        sumA++;
      } else if (a[i] < b[i]) {
        sumB++;
      }
    }

    int[] point = { sumA, sumB };

    for (int i = 0; i < point.length; i++) {
      System.out.print(point[i] + " ");
    }

  }

}
