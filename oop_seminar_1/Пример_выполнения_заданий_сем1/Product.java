package oop_seminar_1.Пример_выполнения_заданий_сем1;

public abstract class Product {
    private Integer price;
    private String name;

    public Product(Integer price, String name) {
        this.price = price;
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Я неизвестный продукт";
    }
}
