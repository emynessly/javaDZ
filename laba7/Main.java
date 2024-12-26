package laba7;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> shoppingcart = generateRandomProducts(12);  // формирование корзины
        System.out.println("Корзина сформирована: " + shoppingcart.toString());

        shoppingcart.removeIf(product -> product.weight > 5 || product.price > 10000);  // убрать продукты весом >5кг и стоимостью >10 тысяч
        System.out.println("Корзина после удаления части продуктов: " + shoppingcart.toString());

        Product favProduct = new Product("Шоколадка", 481, 150);  // поставить на первое место любимый продукт
        shoppingcart.add(0, favProduct);
        System.out.println("В корзине появился любимый продукт: " + shoppingcart.toString());

        System.out.println("Выведенные продукты из корзины:");  // список продуктов с ценой <10 и весом >2
        shoppingcart.stream().filter(product -> product.price < 200 && product.weight > 2).forEach(System.out::println);
    }

    private static ArrayList<Product> generateRandomProducts(int count) {  // генератор случайных продуктов
        String[] names = new String[Products.values().length];
        Random random = new Random();
        ArrayList<Product> products = new ArrayList<>();

        System.out.println("Всего видов продуктов: " + Products.values().length);  // формирование массива имен продуктов
        int j=0;
        for (Products prod : Products.values()) {
            names[j] = prod.toString();
            j++;
        };

        for (int i = 0; i < count; i++) {  // формирование массива продуктов
            String name = names[random.nextInt(names.length)];

            int k=0;  // проверка на повторяемые продукты
            for (int m = 0; m < products.size(); m++){
                if (!products.get(m).getName().equals(name)) k++;
            }
            if (products.size()==k) {
                double price = 1 + random.nextDouble() * 15000;
                double weight = 0.1 + random.nextDouble() * 10;
                Product newProduct = new Product(name, price, weight);
                products.add(newProduct);
            }
        }
        return products;
    }
}
