package laba9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Group group = new Group();
        boolean flag=true;
        while(flag){
            System.out.println("Список группы:");
            group.printStudents();
            System.out.println("Сделайте выбор: ");
            System.out.println("0: Выход из программы");
            System.out.println("1: Добавить студента по умолчанию");
            System.out.println("2: Добавить студента (ручной ввод)");
            System.out.println("3: Удалить студента");
            int choice=inputInt("Ваш выбор: ");
            switch(choice){
                case 0:
                    flag=false;
                    break;
                case 1:
                    group.addStudent(new Student());  // метод добавления студента с параметром
                    break;
                case 2:
                    group.addStudent();  // метод добавления студента без параметра
                    break;
                case 3:
                    group.removeStudent();
                    break;
                default:
                    System.err.println("Некорректный выбор");
                    break;
            }
        }
        System.out.println("Программа завершила работу");
    }

    public static int inputInt(String why)  // ввод целого числа
    {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(why);
            if (sc.hasNextInt()) {
                return sc.nextInt();
            }
            System.out.println("Нормально пиши");
            sc.nextLine();
        }
    }
    public static double inputNumber(String why)  // ввод дробного числа
    {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(why);
            if (sc.hasNextDouble()) {
                return sc.nextDouble();
            }
            System.out.println("Нормально пиши");
            sc.nextLine();
        }
    }
    public static String inputString(String why)  //ввод строкового значения
    {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(why);
            if (sc.hasNextLine()) {
                return sc.nextLine();
            }
            System.out.println("Нормально пиши");
            sc.nextLine();
        }
    }
}
