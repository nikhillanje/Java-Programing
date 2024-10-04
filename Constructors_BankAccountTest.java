// Nmae :- Nikhil Lanje
//class :-SY-1
//Roll No:-113
//subject:- OOP in Java

import java.util.Scanner;

class BankAccount {
    private double accountBalance;

    public BankAccount(double initialAmount) {
        if (initialAmount > 0.0) {
            accountBalance = initialAmount;
        }
    }

    public void deposit(double amount) {
        accountBalance = accountBalance + amount;
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > accountBalance) {
            withdrawAmount = 0.0;
            System.out.println("Withdraw amount exceeded account balance.");
        }
        accountBalance = accountBalance - withdrawAmount;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount holder1 = new BankAccount(5000.00);
        BankAccount holder2 = new BankAccount(1000.00);

        System.out.printf("Holder1 balance: $%.2f\n", holder1.getAccountBalance());
        System.out.printf("Holder2 balance: $%.2f\n\n", holder2.getAccountBalance());

        Scanner scanner = new Scanner(System.in);
        double amountToWithdraw;

        System.out.print("Enter withdraw amount for holder1: ");
        amountToWithdraw = scanner.nextDouble();
        System.out.printf("\nWithdrawing %.2f from holder1 balance\n\n", amountToWithdraw);
        holder1.withdraw(amountToWithdraw);

        System.out.printf("Holder1 balance: $%.2f\n", holder1.getAccountBalance());
        System.out.printf("Holder2 balance: $%.2f\n\n", holder2.getAccountBalance());

        System.out.print("Enter withdraw amount for holder2: ");
        amountToWithdraw = scanner.nextDouble();
        System.out.printf("\nWithdrawing %.2f from holder2 balance\n\n", amountToWithdraw);
        holder2.withdraw(amountToWithdraw);

        System.out.printf("Holder1 balance: $%.2f\n", holder1.getAccountBalance());
        System.out.printf("Holder2 balance: $%.2f\n", holder2.getAccountBalance());
    }
}

/* Example Output:
Holder1 balance: $5000.00
Holder2 balance: $1000.00

Enter withdraw amount for holder1: 2000.00

Withdrawing 2000.00 from holder1 balance

Holder1 balance: $3000.00
Holder2 balance: $1000.00

Enter withdraw amount for holder2: 1500.00

Withdraw amount exceeded account balance.
Withdrawing 1500.00 from holder2 balance

Holder1 balance: $3000.00
Holder2 balance: $1000.00
*/

