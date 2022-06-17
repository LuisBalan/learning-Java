public class Order {
    boolean isFilled;
    double billAmount;
    String shipping;
    
    public Order(boolean filled, double cost, String shippingMethod) {
          if (cost > 24.00) {
        System.out.println("High value item!");
      } else {
        System.out.println("Low value item!");
      }
      isFilled = filled;
      billAmount = cost;
      shipping = shippingMethod;
    }
    public double calculateShipping() {
      double shippingCost;
      switch (shipping) {
        case "Regular":
          shippingCost = 0;
          break;
        case "Express":    
          shippingCost = 1.75;
          break;
        default:
          shippingCost = .50; 
      }
      return shippingCost;
       }
    
    public void ship() {
      if (isFilled) {
        System.out.println("Shipping");
      } else {
        System.out.println("Order not ready");
      }
      
      double shippingCost = calculateShipping();
      
      System.out.println("Shipping cost: ");
      System.out.println(shippingCost);
    }
    
    
    public static void main(String[] args) {
      // create instances and call methods here!
        Order guitars = new Order(true, 16.5, "Regular");
        Order computers = new Order(true, 34.5, "Express");
        Order stoves = new Order(true, 43.50, "Fast");
        guitars.ship();
        computers.ship();
        stoves.ship();

    }
  }