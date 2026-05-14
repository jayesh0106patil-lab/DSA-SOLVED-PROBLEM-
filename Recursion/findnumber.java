public class findnumber {

  static int findsNum(int[] a, int idex ,int tar) {
     if(idex==a.length){
      return -1 ;
     }
     if(idex==tar){
      return 1;
     }
     return findsNum(a , idex+1 , tar);
  }

  public static void main(String[] args) {
    int[] a = { 1, 2, 5, 6, 4, 8 };
    findsNum(a, 0,12);
     if(   findsNum(a, 0,12)== -1){
      System.out.println("not Found ");
     }
     else{
      System.out.println("found");
     }
  }
}
