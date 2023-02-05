import Machines.VendingMachine;
import Products.Drink;

public class Main {
    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine(111);

        vendingMachine.makeDrink("tea", 250, 50, 60);
        Drink teaDrink = vendingMachine.getDrink();

        System.out.println(teaDrink);
        
        vendingMachine.makeDrink("water", 300, 100);
        Drink waterDrink = vendingMachine.getDrink();

        System.out.println(waterDrink);

        vendingMachine.makeDrink("juice", 200, 300);
        Drink juiceDrink= vendingMachine.getDrink();

        System.out.println(juiceDrink);



    }

}