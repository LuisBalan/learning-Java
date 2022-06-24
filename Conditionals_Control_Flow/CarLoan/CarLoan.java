public class CarLoan {
    
    int carLoan = 10000;
    int loanLength = 3;
    int interestRate = 5;
    int downPayment = 200;

    public CarLoan(int loan, int length, int interest, int dPayment){
        carLoan = loan;
        loanLength = length;
        interestRate = interest;
        downPayment = dPayment;
    }

    public static void main(String[] args){
        
        CarLoan myCarLoan = new CarLoan(10000, 3, 5, 200);
        
        if(myCarLoan.loanLength <= 0 || myCarLoan.interestRate <= 0){
            System.out.println("Error! You must take out a  valid car Loan");
        }else if(myCarLoan.downPayment >= myCarLoan.carLoan){
            System.out.println("The car can be paid in full.");
        }else{
            int remainingBalance = myCarLoan.carLoan - myCarLoan.downPayment;
            int months = myCarLoan.loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = monthlyBalance * myCarLoan.interestRate / 100;
            int monthlyPayment = monthlyBalance + interest;
        }    
        System.out.println(monthlyPayment);
    }
    
}
