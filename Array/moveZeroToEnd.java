public class moveZeroToEnd {
  public static void main(String[] args) {
     int[] a={1,2,0,3};

   int[] temp= new int[a.length];
   int lastElement=a.length-1;
    int index=0;
   for(int i=0; i<a.length; i++){
    if(a[i]!=0 ){
      temp[index]=a[i];
      index++;
   }
  }
   for(int i=0;i<temp.length;i++ ){
   System.out.print(temp[i]+"  ");
  }
}
}
