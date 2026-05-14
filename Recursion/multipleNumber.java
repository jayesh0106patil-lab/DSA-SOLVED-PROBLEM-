public class multipleNumber {
  

  static void  multipe(int num , int k){
    if(k==1){
      System.out.println(num);
      return ;
      
    }
   multipe(num, k-1);
   System.out.println(num*k);
  } 
  public static void main(String[] args) {
   multipe(12,5);
  }
}
