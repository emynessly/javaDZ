package laba2;

import java.util.Scanner;
public class q15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ���� ������ (���+���) ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int totalCost = a*100+b;
        System.out.print("������� �����, ������� ��������� �� ����� (���+���) ");
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int totalPaid = c*100+d;

        int e = 0;
        int f = 0;

        if (totalCost>totalPaid) {
            System.out.println("���� ����� :(");
        } else {
            int ChangeKope = totalPaid-totalCost;
            int ChangeRub = ChangeKope/100;
            int ChangeKop = ChangeKope%100;
            System.out.println("���� �����: "+ChangeRub+" ������ � "+ChangeKop+" ������");
        }
    }
}