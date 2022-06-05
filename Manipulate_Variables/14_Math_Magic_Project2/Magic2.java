public class Magic2{
    public static void main(String[] args){
        int myNumber = 999999;
        int magicNumber = (((((myNumber*myNumber) + myNumber) / myNumber) + 17 ) - myNumber)/6;
        System.out.println(magicNumber);
    }
}