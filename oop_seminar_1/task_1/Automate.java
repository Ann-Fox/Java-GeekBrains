package oop_seminar_1.task_1;

public class Automate {
    private Integer id;
    private Integer size;
    private Integer price;
    private ArrayList<Product> nameProduct;

    // Задание 2
    // Реализовать конструкторы, get/set методы, построить логику ТорговогоАвтомата на основе кода, сделанного в задании 1.2
    public Automate(Integer id, Integer size, Integer price, ArrayList<Product> nameProduct) {
        this.id = id;
        this.size = size;
        this.price = price;
        this.nameProduct = nameProduct;
    }

    // public Automate(Integer id) {
    //     this.id = id;
    // }

    public Integer getId() {
        return id;
    }

    public Integer getSize() {
        return size;
    }

    public Integer getPrice() {
        return price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Product getName(integer id) {
        for (int i = 0; i < nameProduct.size(); i++) {
            nameProduct.get(i);
        }
    }

    // Задание 4б
    // Создать перегруженный метод выдачи товара ТорговымАвтоматом, включив дополнительный входной параметр (пример: getProduct(String name), выдающий товар по имени; создать метод, возвращающий товар по имени и какому-либо параметру товара getProduct(String name, int volume)

    public void getName(Integer id, Integer size) {
        for (int i = 0; i < nameProduct.size(); i++) {
        if()
    }
}
}
