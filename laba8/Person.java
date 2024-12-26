package laba8;

public class Person {
    String name;
    String surname;
    String gender;
    boolean active;

    public void sleep(){
        System.out.println(name +" "+ surname + " is sleeping");
    }

    public Person(){
        this.name = "Ken";
        this.surname = "Takakura";
        this.gender = "male";
        this.active = true;
    }

    public Person(String name, String surname, String gender, boolean active){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.active = active;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
