import java.util.*;
public class countdigit {
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
  int n= sc.nextInt(); 
  int digi=0;
while(n!=0){
  n=n/10;
  digi++;

}
System.out.println(digi);

  }
}
