public class maxCount{
  public static void main(String[] args){
     int[] a={0,0,1,0,1,0,0,1,1,1,1,1,0};


     int maxCount=1;
     int currentCount=1;
     for(int i=1; i<a.length; i++){
      if(a[i]==a[i - 1]){
        currentCount++;
            } else {
              maxCount=Math.max(maxCount, currentCount);
              currentCount=1;
            }
            
          }
          maxCount=Math.max(maxCount, currentCount);
      System.out.println("Maximum count of consecutive : " + maxCount);
  }
}