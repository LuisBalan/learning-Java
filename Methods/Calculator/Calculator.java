public class Calculator{

    public Calculator(){

    }

    // addition method
    public String add(int a, int b){
        int result = a + b;
        return "The result is: "+ result;
    }
    // substraction method
    public String substract(int a, int b){
        int result = a - b;
        return "The result is: "+ result;
    }

    //multiplication method
    public String multiply(int a, int b){
        int result = a * b;
        return "The result is: " + result;
    }
    //division method
    public String divide(double a, double b){
        double result = a / b;
        return "The result is: "+ result;
    }
    //modulo method
    public String modulo(int a, int b){
        int result = a % b;
        return "The result is: " + result;
    }

    public static void main(String[] args){
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5, 7));
        System.out.println(myCalculator.substract(45, 11));
        System.out.println(myCalculator.multiply(10, 11));
        System.out.println(myCalculator.divide(15, 4));
        System.out.println(myCalculator.modulo(18, 5));
    }
}