package laba2;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� �������� a: ");
        int a = scanner.nextInt();
        System.out.print("������� �������� b: ");
        int b = scanner.nextInt();

        if (a == 0) {
            if (b == 0) {
                System.out.println("INF");
            } else {
                System.out.println("NO");
            }
        } else {
            if (b % a == 0) {
                int x = -b / a;
                System.out.println(x);
            } else {
                System.out.println("NO");
            }
        }
    }
}
