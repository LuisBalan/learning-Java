//for a method the word void indicates that there is not any value to return
public class Store{
    String productType;
    double price;

    public Store(String product, double initialPrice){
        productType = product;
        price = initialPrice;
    }

    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    public double getPriceWithTax(){
        double totalPrice = price + price*0.08;
        return totalPrice;
    }

    public static void main(String[] args){
        Store lemonadeStand = new Store("Lemonade", 3.75);
        double lemonadePrice = lemonadeStand.getPriceWithTax();
        System.out.println(lemonadePrice);
    }
}