package bank;

import bank.*;
import java.util.*;

public class DemoClass {
    private static Account[] accounts = new Account[4];
    private static int numCurrent = 0;
    private static int numSavings = 0;

    public static void main(String[] args) {
        while (true) {
            int input = showMenu();
            switch (input) {
                case 1:     // add account
                    addAccount();
                    break;

                case 2:     // show accounts
                    showAccounts();
                    break;

                case 3:     // exit
                    return;

                default:
                    System.out.println("wrong input");
            }
        }
    }

    private static int showMenu() {
        System.out.println("Menu");
        System.out.println("1. Add account");
        System.out.println("2. Show accounts");
        System.out.println("3. Exit");

        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void addAccount() {
        int numAccounts = numCurrent + numSavings;
        if (numAccounts >= 4) {
            System.out.println("No more account!!");
            return;
        }

        System.out.println("Type of account (Current: 1, Savings: 2)");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        Account.Type type;

        if (input == 1) {
            type = Account.Type.CURRENT;
        } else if (input == 2) {
            type = Account.Type.SAVINGS;
        } else {
            System.out.println("invalid input");
            return;
        }

        if (type == Account.Type.CURRENT && numCurrent >= 2) {
            System.out.println("No more current account!!");
            return;
        } else if (type == Account.Type.SAVINGS && numSavings >= 2) {
            System.out.println("No more savings account!!");
            return;
        }

        String name;
        String number;
        int balance;

        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("Number: ");
        number = sc.nextLine();
        System.out.println("Balance: ");
        balance = sc.nextInt();

        Account acc;
        if (type == Account.Type.CURRENT) {
            acc = new CurrentAccount(name, number, balance);
            ++numCurrent;
        } else if (type == Account.Type.SAVINGS) {
            acc = new SavingsAccount(name, number, balance);
            ++numSavings;
        }

        accounts[numAccounts] = acc;
    }
}
