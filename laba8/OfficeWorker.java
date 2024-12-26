package laba8;

public class OfficeWorker extends Employee implements Worker{
    private int officeComplexNum;
    private int officeRoomNum;

    public OfficeWorker(String name, String surname, String gender, boolean active, String position, int payment, int experience, String department, int officeComplexNum, int officeRoomNum){
        super(name, surname, gender, active, position, payment, experience, department);
        this.officeComplexNum = officeComplexNum;
        this.officeRoomNum = officeRoomNum;
    }

    public void setOfficeComplexNum(int officeComplexNum){
        this.officeComplexNum = officeComplexNum;
    }
    public int getOfficeComplexNum(){
        return officeComplexNum;
    }

    public void setOfficeRoomNum(int officeRoomNum){
        this.officeRoomNum = officeRoomNum;
    }
    public int getOfficeRoomNum(){
        return officeRoomNum;
    }

    @Override
    public void uniqueSmth(){
        System.out.println(getName() + " works in the №" + getOfficeRoomNum() + " room");
    }
    @Override
    public void work(){
        System.out.println(getName() + " works in the №" + getOfficeComplexNum() + " office complex");
    }

}
