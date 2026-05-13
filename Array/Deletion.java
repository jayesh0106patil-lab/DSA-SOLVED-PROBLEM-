public class Deletion {
  public static void main(String[] args) {
    
    int[] arr = {12, 523, 56, 47, 21};
    int index = 1;
    
    int[] newarr = new int[arr.length - 1];

    for (int i = 0; i < arr.length; i++) {
     if(i < index){
       newarr[i] = arr[i];
     } else if(i > index){
       newarr[i - 1] = arr[i];
     }
    }

    for (int i = 0; i < newarr.length; i++) {
      System.out.print(newarr[i] + " ");
    }
  }
}
