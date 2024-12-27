package laba9;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Student> students;

    public Group() {
        this.students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {  // метод добавления студента и проверки на максимальное количество в группе
        try {
            this.students.add(student);
            if (this.students.size() > 15) {
                throw new ArithmeticException("Невозможно добавить студента. Группа не может быть > 15 ");
            }
        } catch (ArithmeticException e) {
            this.students.removeLast();
            System.err.println(e.getMessage());
        }
    }

    public void addStudent(){  // метод добавления студента с заполнением через консоль
        String tempName = Main.inputString("Введите имя студента: ");
        String tempSurname = Main.inputString("Введите фамилию студента: ");
        String tempPatronymic = Main.inputString("Введите отчество студента: ");
        boolean tempGender = false;
        int tempAge = 0;
        int tempCourse = 0;
        double tempAvScore = 0;

        boolean tempFlag = true;
        while (tempFlag) {  // заполнение пола студента
            try {
                tempFlag = false;
                int tempChoice = Main.inputInt("Введите пол (1 = женский, 0 = мужской): ");
                if (tempChoice != 1 && tempChoice != 0) {
                    throw new ArithmeticException("Некорректное значение, попробуйте снова. ");
                }
                else{
                    if (tempChoice == 1) {
                        tempGender = true;
                    }
                    if (tempChoice == 0) {
                        tempGender = false;
                    }
                }
            } catch (ArithmeticException e) {
                System.err.println(e.getMessage());
                tempFlag = true;
            }
        }
        tempFlag = true;
        while (tempFlag) {  // заполнение возраста студента с проверкой его на соответствие условиям
            try {
                tempFlag = false;
                tempAge = Main.inputInt("Введите возраст: ");
                if (tempAge < 16 || tempAge > 60) {
                    throw new NotCorrectAgeException("Возраст не может быть < 16 и > 60 лет!");
                }
            } catch (NotCorrectAgeException e) {
                System.err.println(e.getMessage());
                tempFlag = true;
            }
        }
        tempFlag = true;
        while (tempFlag) {  // заполнение курса студента с проверкой его на допустимость
            try {
                tempFlag = false;
                tempCourse = Main.inputInt("Введите номер курса: ");
                if (tempCourse < 1 || tempCourse > 5) {
                    throw new NotCorrectAgeException("Номер курса не может быть < 1 и > 5");
                }
            } catch (NotCorrectAgeException e) {
                System.err.println(e.getMessage());
                tempFlag = true;
            }
        }
        tempFlag = true;
        while (tempFlag) {  // заполнение ср. балла студента с проверкой его на допустимость
            try {
                tempFlag = false;
                tempAvScore = Main.inputNumber("Введите средний балл: ");
                if (tempAvScore < 0) {
                    throw new NotCorrectAgeException("Средний балл не может быть < 0");
                }
            } catch (NotCorrectAgeException e) {
                System.err.println(e.getMessage());
                tempFlag = true;
            }
        }
        Student tempStudent = new Student(tempName, tempSurname, tempPatronymic, tempGender, tempAge, tempCourse, tempAvScore);
        addStudent(tempStudent);
    }

    public void removeStudent() {  // удаление студента из группы с проверкой на существование студента с таким номером и количеством студентов в группе > 3
         if (students.size() > 3) {
            boolean tempFlag = true;
            int tempNum = 0;
            while (tempFlag) {
                try {
                    tempFlag = false;
                    tempNum = Main.inputInt("Введите номер студента: ");
                    if (tempNum < 1 || tempNum > this.students.size()) {
                        throw new NotCorrectAgeException("Студент с номером "+tempNum+" отсутствует в списке!");
                    }
                } catch (NotCorrectAgeException e) {
                    System.err.println(e.getMessage());
                    tempFlag = true;
                }
            }
            students.remove(tempNum - 1);
            System.out.println("Студент удален");
        }
        else{
            System.err.println("Невозможно удалить студента. Группа не может быть < 3");
        }
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public void printStudents(){  // полная информация о студенте в списке группы
        for(int i=0; i<this.students.size(); i++){
            System.out.println((i+1) + ": " + this.students.get(i).name + " " + this.students.get(i).surname + " " + this.students.get(i).patronymic + " " +
                    genderName(this.students.get(i).gender) + " " + this.students.get(i).age + " " + this.students.get(i).course + " " + this.students.get(i).avScore);
        }
    }

    public String genderName(boolean gender){  // конвертация цифр, используемых для обозначения пола в его название
        if (gender){
            return "женский";
        } else {
            return "мужской";
        }
    }
}
