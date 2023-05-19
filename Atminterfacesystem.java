public class Atminterfacesystem {

    public static void main(String[] args) {
        int balance = 50000;
        int withdrawamount = 20000;
        int depositamount = 4000;
        ShowBalance(balance);
        balance = Withdrawamt(balance, withdrawamount);
        balance = Depositingamount(balance, depositamount);
        System.out.println("Thanks..... ");

    }

    public static void ShowBalance(int balance) {
        System.out.println("your current balance is:" + balance);
        System.out.println("Minimum balanced Maintain your account 500");
        System.out.println();

    }

    public static int Withdrawamt(int balance, int withdrawamount) {
        System.out.println("withdraw amount status:");
        System.out.println("withdraw amount :" + withdrawamount);
        System.out.println();

        if (balance >= withdrawamount) {
            balance = balance - withdrawamount;
            System.out.println("please collect your money");
            System.out.println("Do not forget collect your card");
            System.out.println();
            ShowBalance(balance);

        } else {
            System.out.println("you are not having a sufficient amount");
            System.out.println();
        }
        return balance;

    }

    public static int Depositingamount(int balance, int depositamount) {
        System.out.println();
        System.out.println("Deposit amount status:");
        System.out.println("Deposit amount:" + depositamount);
        balance = balance + depositamount;
        System.out.println("your money is sucessfully deposited in your amount");
        ShowBalance(balance);
        return balance;
    }
}
