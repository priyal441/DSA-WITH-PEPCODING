import java.util.*;

public class Rotate_Number {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int temp = n;
    int Nod = 0;
    while (temp > 0) {
      temp = temp / 10;
      Nod++;
    }
    k=k%Nod;
    if(k<0){
      k=k+Nod;
    }
    int div = 1;
    int mul = 1;
    for (int i = 1; i <= Nod; i++) {
      if (i <= k) {
        div = div * 10;
      } else {
        mul = mul * 10;
      }
    }
    int q = n / div;
    int r = n % div;
    int p = r * mul + q;
    System.out.println(p);
  }
}
