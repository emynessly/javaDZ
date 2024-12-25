package laba5;
import java.util.Scanner;

import static laba5.Point3d.comparisonxyz;

public class Lab1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координаты первой точки");  // ввод точек
        Point3d p1 = createPoint(scanner);
        System.out.println("Введите координаты второй точки");
        Point3d p2 = createPoint(scanner);
        System.out.println("Введите координаты третьей точки");
        Point3d p3 = createPoint(scanner);
        if (comparisonxyz(p1, p2) || comparisonxyz(p2, p3) || comparisonxyz(p3, p1)) {
            System.out.println("Какие-то из точек совпадают, нельзя вычислить площадь треугольника:( ");
        } else {
            System.out.println("Площадь треугольника: ");
            System.out.printf("%.2f", computeArea(p1, p2, p3));
        }
    }

    public static Point3d createPoint(Scanner scanner) {  // задавание значений точкам xyz
        System.out.println("x: ");
        double x = scanner.nextDouble();
        System.out.println("y: ");
        double y = scanner.nextDouble();
        System.out.println("z: ");
        double z = scanner.nextDouble();
        return new Point3d(x, y, z);
    }

    public static double computeArea(Point3d p1, Point3d p2, Point3d p3) {
        double a = p1.distanceTo(p2);  // сторона a
        double b = p2.distanceTo(p3);  // сторона b
        double c = p3.distanceTo(p1);  // сторона c

        double p = ((a + b + c) / 2);  // полупериметр
        double value=Math.sqrt(p * (p - a) * (p - b) * (p - c));  // площадь по формуле Герона
        return value;
    }


}
