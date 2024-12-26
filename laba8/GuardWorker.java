package laba8;

public class GuardWorker extends Employee implements Worker{
    private int rank;
    private String specialization;

    public GuardWorker(String name, String surname, String gender, boolean active, String position, int payment, int experience, String department, int rank, String specialization){
        super(name, surname, gender, active, position, payment, experience, department);
        this.rank = rank;
        this.specialization = specialization;
    }

    public void setRank(int rank){
        this.rank = rank;
    }
    public int getRank(){
        return rank;
    }

    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }
    public String getSpecialization(){
        return specialization;
    }

    @Override
    public void uniqueSmth(){
        System.out.println(getName() + " has level " + getRank());
    }
    @Override
    public void work(){
        System.out.println(getName() + " has specialization " + getSpecialization() );
    }


}
