package laba2;
import java.util.Scanner;

public class q11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два числа ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a<b){
            for(int i=a; i<=b; i++){
                if (i%2==0){
                    System.out.println(i);
                }
            }
        } else {
            for(int i=b; i<=a; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
