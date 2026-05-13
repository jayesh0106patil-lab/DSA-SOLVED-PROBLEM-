

public class lragestNumber {
  public static void main(String[] args) {
     
    int array[]={1,288,96,3364,124,745,10};
    int lragestNumber=-1;

    for(int i=0; i<array.length; i++){
      if (array[i]>lragestNumber) {
        lragestNumber=array[i];
      }
    }

    System.err.println(lragestNumber);

  }
}
