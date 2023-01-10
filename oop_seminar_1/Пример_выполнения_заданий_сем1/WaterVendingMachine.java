package oop_seminar_1.Пример_выполнения_заданий_сем1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WaterVendingMachine extends VendingMachine {

    public WaterVendingMachine(Integer id, ArrayList<Product> products) {
        super(id, products);
    }
    public WaterVendingMachine(Integer id) {
        super(id);
    }

}
