

public class thirdlargestNumber {
  public static void main(String[] args) {
    
    int array[]={12,52,65,74,854};
    int largestNum=-1;
    int secondlargestNum=-1;
    int thirdlargestNumber=-1;

    for(int i=0; i<array.length; i++){
      if (array[i]>largestNum) {
        largestNum=array[i];
      }
    }
     

  }  
}
