package laba6;

public class Supermarket extends Market {
    double area;
    String[] categories;
    public Supermarket(){
        super();
        this.area = 200;
        this.categories = new String[]{
                "Молочные продукты",
                "Фрукты и ягоды",
                "Хлебобулочные изделия",
        };
    }
    public Supermarket(int cashregNum, int cashierNum, Products[] products, int area, String[] categories){
        super();
        this.cashregNum = cashregNum;
        this.cashierNum = cashierNum;
        this.products = products;
        this.area = area;
        this.categories = categories;
    }

    @Override
    public double getEfficiency(){  // эффективность супемаркета  // геттер 6
        return (area / categories.length) * getCashRegEfficiency();
    }
}
