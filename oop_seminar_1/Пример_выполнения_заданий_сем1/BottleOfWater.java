package oop_seminar_1.Пример_выполнения_заданий_сем1;

public class BottleOfWater extends Product {
    private final int liters;

    public BottleOfWater(int price, String name, int liters) {
        super(price, name);
        this.liters = liters;
    }

    public int getLiters() {
        return liters;
    }

    @Override
    public String toString() {
        return "Я бутылка воды {" +
                " liters=" + liters +
                " price=" + getPrice() +
                " name=" + getName() +
                " }";
    }
}
