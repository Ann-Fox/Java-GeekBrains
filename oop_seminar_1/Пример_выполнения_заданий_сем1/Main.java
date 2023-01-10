package oop_seminar_1.Пример_выполнения_заданий_сем1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> bottleOfWaters = new ArrayList<>();
        bottleOfWaters.add(new BottleOfWater(1, "1", 1));
        bottleOfWaters.add(new BottleOfWater(2, "2", 2));
        bottleOfWaters.add(new BottleOfWater(3, "3", 3));

        WaterVendingMachine vendingMachine = new WaterVendingMachine(1, bottleOfWaters);
        System.out.println(vendingMachine.getProduct("1", 1));
        System.out.println(vendingMachine.getProduct("3"));
        System.out.println(vendingMachine.getProduct("2", 1));
    }


}
