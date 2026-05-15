
public class selectioonSort {

  static void Sort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int min_index = i;
      for (int j = i+1; j < arr.length ; j++) {
        if (arr[j] < arr[min_index]) {
          min_index = j;
        }
      }
      if (min_index != i) {
        int temp = arr[i];
        arr[i] = arr[min_index];
        arr[min_index] = temp;
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = { 5, 7, 9, 68, 4, 2, 1, 6 };
   // Sort(arr);
   // for (int i : arr) {
    //  System.out.println(i);

    //}
   System.out.println(arr.length);
    
  }
}
