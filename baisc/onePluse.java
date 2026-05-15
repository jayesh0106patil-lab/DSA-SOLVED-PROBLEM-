public class onePluse {
  static void addOne(int[] arr ){
    int n =arr.length;
    int Result=0;
    int placedigit=100;
    for (int i=0; i<n; i++){
        Result=placedigit+arr[i];
        placedigit=placedigit/10;

    }
    System.out.println(Result);
  }
  public static void main(String[] args) {
    int[] arr ={1,2,3,6};

    addOne(arr);
   

  }
  
}
