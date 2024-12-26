package laba7;

public class Product  {
    String name;
    double price;
    double weight;

    public Product(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return String.format("Продукт = %s, Цена = %.2f ₽, Вес = %.2f кг", name, price, weight);
    }
    public String getName() {
        return name;
    }
}

