package laba9;

public class Student {
    String name;
    String surname;
    String patronymic;
    boolean gender;
    int age;
    int course;
    double avScore;

    public Student(){
        this.name = "Николай";
        this.surname = "Полов";
        this.patronymic = "Григорьевич";
        this.gender = false;
        this.age = 20;
        this.course = 3;
        this.avScore = 4.6;
    }
    public Student(String name,String surname,String patronymic,boolean gender,int age,int course,double avScore){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.gender = gender;
        this.age = age;
        this.course = course;
        this.avScore = avScore;
    }

    // установление значений и получение значений имени/фамилии/отчества
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSurname(){
        return surname;
    }

    public void setPatronymic (String patronymic){
        this.patronymic = patronymic;
    }
    public String getPatronymic(){
        return patronymic;
    }
}
