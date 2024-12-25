package laba6;

public class Market {
    public static class Products {  // вложенный класс товар
        String name;
        int price;
        double weight;

        public Products(String name, int price, double weight) {  // конструктор с параметрами
            this.name = name;
            this.price = price;
            this.weight = weight;
        }
        public Products() {  // конструктор дефолтный
            this.name = "Хлеб";
            this.price = 50;
            this.weight = 0.4;
        }
    }
    Products[] products;
    public int cashregNum;
    public int cashierNum;

    public Market(int cashregNum, int cashierNum, Products[] products){  // конструктор с параметрами
        this.cashregNum = cashregNum;
        this.cashierNum = cashierNum;
        this.products = products;
    }

    public Market(){  // конструктор дефолтный
        this.cashregNum = 100;
        this.cashierNum = 200;
        this.products = new Products[1];
        for (int i = 0; i < products.length; i++){
            products[i] = new Products();
        }
    }

    public void setCashregNum(int val){  // сеттер 1
        cashregNum = val;
    }
    public void setCashierNum(int val){  // сеттер 2
        cashierNum = val;
    }
    public int getCashregNum(){  // геттер 1
        return cashregNum;
    }
    public int getCashierNum(){  // геттер 2
        return cashierNum;
    }
    public String getProducts() {
        String prod = "";
        for (int i = 0; i < products.length; i++)
            prod += products[i].name + ": " + products[i].price + "₽, " + products[i].weight + "кг. \n";
        return prod;
    }
    public void setProducts(Products[] val) {products = val;}

    public double getAverageWeight(){  // средний вес  // геттер 3
        double SummaryWeight = 0;
        for (int i = 0; i < products.length; i++)
        {
            SummaryWeight += products[i].weight;
        }
        return SummaryWeight / products.length;
    }

    public double getCashRegEfficiency(){  // эффективность кассы  // геттер 4
        return (double) cashierNum / cashregNum;
    }

    public double getEfficiency(){  // эффективность магазина  // геттер 5
        return getAverageWeight() / getCashRegEfficiency();
    }

}
