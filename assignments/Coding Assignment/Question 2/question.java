import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
      if(day==0){
        System.out.print("no Discount");
      }
      if(day==1){
        System.out.print("Discount available");
      }
        
    }
}