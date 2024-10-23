public class reverse {
  public static void main(String[] args) {
    int n=456;
    while(n>0){
      int rem=n%10;
      n=n/10;
    
      System.out.println(rem);
    }
  }

}
