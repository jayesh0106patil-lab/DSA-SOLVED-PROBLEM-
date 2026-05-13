
import java.util.Arrays;

public class secondlargestnum {
   public static void main(String[] args) {
      int[] arrayOne = { 12, 5, 6, 4, 8,3 };

      Arrays.sort(arrayOne);

      int largestELement = arrayOne.length - 1;
      int secondLargest = -1;

      for (int i = 0; i < arrayOne.length - 1; i++) {

         if (arrayOne[i] > secondLargest) {
            secondLargest = arrayOne[i];

         }
      }

      System.err.println(secondLargest);
   }

}