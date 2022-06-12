public class Store{
    //instance fields
    String productType;
    double price;

    //constructor method
    public Store(String product, double initialPrice){
        productType= product;
        price = initialPrice;
    }

    //increase method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;

        price = newPrice;
    }
 

    //main method
    public static void main(String[] args){
        lemonadeStand.increasePrice(1.5);
        Store lemonadeStand = new Store("Lemonade", 3.75);
        System.out.println(lemonadeStand.price);
    }
}