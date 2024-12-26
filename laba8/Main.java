package laba8;

public class Main {
    public static void main(String[] args){
        KitchenWorker kworker = new KitchenWorker("Grimmjow", "Jaegerjaquez", "male", true,
                "chief", 110000, 7, "Kitchen",
                "Spanish", "chief");
        kworker.sleep();
        kworker.work();
        kworker.uniqueSmth();

        OfficeWorker oworker = new OfficeWorker("Choso", "Itadori", "male", false,
                "clerk", 40000, 10, "accounting",
                6, 38);
        oworker.sleep();
        oworker.work();
        oworker.uniqueSmth();

        GuardWorker gworker = new GuardWorker("Phil", "Za", "male", true,
                "personal security", 500000, 20, "security",
                1, "security");
        gworker.sleep();
        gworker.work();
        gworker.uniqueSmth();
    }
}
