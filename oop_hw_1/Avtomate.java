import java.util.ArrayList;

import oop_seminar_1.task_1.Automate;
import oop_seminar_1.Пример_выполнения_заданий_сем1.Product;

//создать класс торгового автомата
public class Avtomate {
    private Integer id;
    private Integer size;
    private Integer price;
    private ArrayList<Product> nameProduct;

public Automate(Integer id, Integer size, Integer price, ArrayList<Product> nameProduct){
    this.id = id;
    this.size = size;
    this.price = price;
    this.nameProduct= nameProduct;
}

    // public Automate(Integer id){
    // this.id = id;
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

    public Product getName(Integer id) {
        for (int i = 0; i < nameProduct.size(); i++) {
            nameProduct.get(i);
        }
    }
}
