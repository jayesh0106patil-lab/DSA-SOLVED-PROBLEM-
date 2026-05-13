

public class inseration {

  public static void main(String[] args) {
    int[] arr = { 21,52,64,56,78,65,48 };
    int n = arr.length;
    int index = 2;
    int value = 15;
    int[] newarr = new int[n + 1];
    for (int i = 0; i < n +1 ; i++) {
      if (i < index) {
        newarr[i] = arr[i];
      } else if (i == index) {
        newarr[i] = value;

      } else if (i > index) {
        newarr[i] = arr[i - 1];
      }
    }
    

    for (int i = 0; i < n + 1 ; i++) {
      System.out.print(newarr[i] + " ");
    }
  }
}