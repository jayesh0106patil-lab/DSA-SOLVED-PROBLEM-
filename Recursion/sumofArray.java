public class sumofArray {
  
  static int SumArr(int[] a, int idex){
     if(idex==a.length-1){
      return a[idex];
     }
     int  ans= SumArr(a, idex+1);
     return ans+a[idex];
  }
  public static void main(String[] args) {
    int[] a={1,2,3,4,5};
   System.out.println( SumArr(a, 0)); 
  }
}
