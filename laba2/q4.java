package laba2;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("����� ��������� �����?");
        double money = scanner.nextDouble();
        System.out.print("� �� ������� ���?");
        int years = scanner.nextInt();
        System.out.print("�������... ����� ���������� ������?");
        double percentage = scanner.nextDouble();

        percentage=percentage/100;

        for(int i=1; i<=years; i++){
            System.out.println(i+1);
            money=money+(money*percentage);
        }
        System.out.printf("����� %d ���� �� �������� %.2f ������", years, money);
    }

}
