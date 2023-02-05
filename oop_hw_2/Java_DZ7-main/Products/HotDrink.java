package Products;
public class HotDrink extends Drink {
    
    private Integer temperature;

    public HotDrink(String name, Integer volume, Integer price, Integer temperature){
        super(name, volume, price);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() +" temperature = " + temperature;
    }
}
