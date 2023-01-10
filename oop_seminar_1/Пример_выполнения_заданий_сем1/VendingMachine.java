package oop_seminar_1.Пример_выполнения_заданий_сем1;

import java.util.ArrayList;
import java.util.List;

public abstract class VendingMachine {
    private final Integer id;
    private ArrayList<Product> products = new ArrayList<>();

    public VendingMachine(Integer id) {
        this.id = id;
    }

    public VendingMachine(Integer id, ArrayList<Product> products) {
        this.id = id;
        this.products = products;
    }

    public void initProducts(List<Product> products) {
        this.products.addAll(products);
    }

    public Integer getId() {
        return id;
    }

    public Product getProduct(String name) {
        for (Product p : products)
            if (p.getName().equals(name))
                return p;
        return null;
    }

    public Product getProduct(String name, Integer price){
        for (Product p : products)
            if (p.getName().equals(name) && p.getPrice().equals(price))
                return p;
        return null;
    }
}
