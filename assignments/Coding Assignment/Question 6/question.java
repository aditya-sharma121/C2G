import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentData = sc.nextInt();
        int newPackData = sc.nextInt();
        int carriedForward = Math.min(currentData,2);
        int finalData = carriedForward+ newPackData;
        System.out.print(finalData);
        
    }
}