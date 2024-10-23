import java.util.*;
public class prime {
  public static void main(String[] args) {
    
  Scanner sc=new Scanner(System.in);
  //print which number is prime or not
  // int t=sc.nextInt();
  // for(int i=0;i<t;i++){
  //   int n= sc.nextInt();
  //   int count=0;
  //   for(int div=2;div*div<=n;div++){
  //     if(n%div==0){
  //       count++;
  //       break;
  //     }
  //   }
  //   if(count==0){
  //     System.out.println("Prime");
  //   }
  //   else{
  //     System.out.println("Not Prime");
  //   }
  // }

  //print all prime number
  int low=sc.nextInt();
  int high=sc.nextInt();
  for(int i=low;i<=high;i++){
    int count=0;
    for(int div=2;div*div<=i;div++){
      if(i%div==0){
        count++;
        break;
      }
    }
    if(count==0){
      System.out.println(i);
    }
  }
}
}