package laba8;

public class KitchenWorker extends Employee implements Worker{
    private String cuisine;
    private String spec;

    public KitchenWorker(String name, String surname, String gender, boolean active, String position, int payment, int experience, String department, String cuisine, String spec){
        super(name, surname, gender, active, position, payment, experience, department);
        this.cuisine = cuisine;
        this.spec = spec;
    }

    public void setCuisine(String cuisine){
        this.cuisine = cuisine;
    }
    public String getCuisine(){
        return cuisine;
    }

    public void setSpec(String spec){
        this.spec = spec;
    }
    public String getSpec(){
        return spec;
    }

    @Override
    public void uniqueSmth(){
        System.out.println(getName() + " cooks " + getCuisine() + " cuisine");
    }
    @Override
    public void work(){
        System.out.println(getName() + " works as " + spec);
    }


}
