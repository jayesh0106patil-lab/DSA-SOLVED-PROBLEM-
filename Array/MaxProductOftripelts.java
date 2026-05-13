import java.util.Arrays;

public class MaxProductOftripelts{

  public static void main(String[] args){
    int[] a={1,2,3,48,6,7,9};
    int n=a.length;

    Arrays.sort(a);
  int max1=a[n-1]*a[n-2]*a[n-3];
  int max2=a[0]*a[1]*a[n-1];
  
  int maxProduct = Math.max(max1, max2);
  System.out.println("Maximum product of triplets: " + maxProduct);

  }

}