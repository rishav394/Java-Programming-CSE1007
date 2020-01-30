/*
Write a program to demonstrate the knowledge of students in Inheritance.Eg:Assume that a bank maintains two kinds of accounts for customers,one called as savings account and the other as current account.The savings account provides compound interest and withdrawal facilities but no cheque book facility.The current account provides cheque book facility but no interest.Current account holders should maintain a minimum balance and if the balance falls below this level,a service charge is imposed.Create a

class account that stores customer name, account number and type of account. From this,
derive the classes cur_acct and sav_acct to make them more specific to their requirements. Include
necessary member functions in order to achieve the following tasks :
a) Accept deposit from a customer and update the balance.
b) Display the balance
c) Compute and deposit interest.
d) Permit withdrawal and update the balance.
e) Check for the minimum balance, impose penalty, necessary, and update the balance.
*/

import java.util.*;

class account {
    enum AccountType {
        savings, current
    }

    String name, accno;
    AccountType type;
    double balance;
    final double MINIMUM_BALANCE_REQUIRED = 5000.00;
    final double FINE = 120.00;
    final int RATE = 10;

    account(final String name, final String accno, final String type) {
        this.balance = 0;
        this.name = name;
        this.accno = accno;
        this.type = type.charAt(0) == 's' ? AccountType.savings : AccountType.current;
    }

    public double deposit(final double amount) {
        this.balance += amount;
        return this.balance;
    }

    public double withdraw(final int _withdroAmount) {
        System.out.println("Withdrawl not allowed");
        return this.balance;
    }

    public double interest() {
        System.out.println("Not eligible for interest");
        return 0;
    }

    public double penalty() {
        return 0;
    }

    public double getBalance() {
        return this.balance;
    }
}

class cur_acct extends account {
    cur_acct(final String name, final String accno) {
        super(name, accno, "current");
    }

    @Override
    public double penalty() {
        if (this.balance < this.MINIMUM_BALANCE_REQUIRED) {
            this.balance -= this.FINE;
            return this.FINE;
        } else {
            return 0;
        }
    }
}

class sav_acct extends account {
    sav_acct(final String name, final String accno) {
        super(name, accno, "savings");
    }

    @Override
    public double interest() {
        final double interest = this.balance * this.RATE * 1.00 / 100.00;
        this.balance += interest;
        return interest;
    }

    @Override
    public double withdraw(final int withdroAmount) {
        this.balance -= withdroAmount;
        return this.balance;
    }
}

public class CurrentAndSavingAccounts {
    public static void main(final String[] args) {
        final Scanner src = new Scanner(System.in);

        // Try for both or make user choose :)
        final sav_acct user_account = new sav_acct("Rishav", "010500008899");
        // cur_acct user_account = new cur_acct("Rishav", "010500008899");

        char choice = ' ';
        while (choice != 'q') {
            System.out.println("a) Accept deposit from a customer and update the balance.");
            System.out.println("b) Display the balance");
            System.out.println("c) Compute and deposit interest.");
            System.out.println("d) Permit withdrawal and update the balance.");
            System.out.println("e) Check for the minimum balance, impose penalty, necessary, and update the balance.");
            choice = src.nextLine().charAt(0);
            switch (choice) {
            case 'a':
                System.out.println("Enter deposit amount: ");
                System.out.println("Updated balance is " + user_account.deposit(Double.parseDouble(src.nextLine())));
                break;
            case 'b':
                System.out.println("Your current balance is " + user_account.deposit(0.0));
                break;
            case 'c':
                System.out.println("Your interest is " + user_account.interest());

            case 'd':
                System.out.println("Enter withdrawl balance: ");
                System.out.println("Updated balance is " + user_account.withdraw(Integer.parseInt(src.nextLine())));
                break;
            case 'e':
                System.out.println(
                        "You have been fined " + user_account.penalty() + " for not maintaining the minimum balance");
                System.out.println("Updated balance is " + user_account.getBalance());
                break;
            default:
                choice = 'q';
                break;
            }
        }

        src.close();
    }
}