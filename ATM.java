/* 
 Create a class to represent the ATM machine.
2. Design the user interface for the ATM, including options such as withdrawing, depositing, and
checking the balance.
3. Implement methods for each option, such as withdraw(amount), deposit(amount), and
checkBalance().
4. Create a class to represent the user's bank account, which stores the account balance.
5. Connect the ATM class with the user's bank account class to access and modify the account
balance.
6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).
7. Display appropriate messages to the user based on their chosen options and the success or failure
of their transactions.
 */
import java.util.Scanner;

interface InnerATM {
    void withdraw(double amount);

    void deposit(double amount);

    double checkBalance();

}

class bankAccount implements InnerATM {
    private double balance;

    public bankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal Successful");
        }
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposit Successful");
    }

    public double checkBalance() {
        return balance;
    }
}

public class ATM {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the balance: ");
            double balance = sc.nextDouble();
            bankAccount ba = new bankAccount(balance);
            while (true) {
                System.out.print("1. Check Balance\n2. Withdraw\n3. Deposit\n4. Exit\nEnter your choice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Your balance is: " + ba.checkBalance());
                        break;
                    case 2:
                        System.out.print("Enter the amount you want to withdraw: ");
                        double amount = sc.nextDouble();
                        ba.withdraw(amount);
                        break;
                    case 3:
                        System.out.print("Enter the amount you want to deposit: ");
                        amount = sc.nextDouble();
                        ba.deposit(amount);
                        break;
                    case 4:
                        System.out.print("Thank you for using our ATM");
                        System.exit(0);
                }
            }
        }
    }
}


