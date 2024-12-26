package laba8;

public interface Worker {
    default void work(){  // дефолтный метод
        System.out.println("is working");
    }

    void uniqueSmth();  //  метод
}
