package laba2;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("����� �����: ");
        int n = scanner.nextInt();
        if (n%2==0){
            System.out.println("��");
        }
        else{
            System.out.println("���");
        }
    }
}
