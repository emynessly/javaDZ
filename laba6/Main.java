package laba6;

public class Main {
    public static void main(String[] args){
        Market.Products[] prod = new Market.Products[]{  // массив продуктов
                new Market.Products(),
                new Market.Products("Молоко", 90, 0.9),
                new Market.Products("Йогурт", 55    , 0.13),
                new Market.Products("Масло", 280, 0.18),
                new Market.Products("Бананы", 180, 1),  // раньше тут были пельмени:(
                new Market.Products("Клубника", 154, 0.3),
                new Market.Products("Яблоки красные", 194, 1),
                new Market.Products("Рулет с маковой начинкой", 216, 0.4),
        };
        Market magazin = new Market(8, 5, prod);

//        System.out.println("Средний вес продуктов: " + magazin.getAverageWeight());
//        System.out.println("Эффективность кассы: " + magazin.getCashRegEfficiency());
        System.out.println("Эффективность магазина: " + magazin.getEfficiency());

        Supermarket supermarket = new Supermarket(
                35,
                15,
                prod,
                120,
                new String[60]
        );
        System.out.println("Эффективность супермаркета: " + supermarket.getEfficiency());

/**        System.out.println(magazin.getProducts());  // выводит список продуктов с весом и ценами **/
    }
}
