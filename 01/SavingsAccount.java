public class SavingsAccount{
    int balance;

    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }

    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(2000);

        //check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is " + savings.balance);
        
        //Withdrawing:
        int afterWithdraw = savings.balance - 300;
        savings.balance = afterWithdraw;
        System.out.println("You just withdrew " + 300);

        //Check balance:

    }


}