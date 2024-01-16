package codesoft.tasks.task3;

import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
            return false;
        }
        balance = balance - amount;
        return true;
    }
}

class ATM {
    private BankAccount userAccount;

    public ATM(BankAccount account) {
        this.userAccount = account;
    }

    public void displayMenu() {
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void processOption(int option) {
        Scanner scanner = new Scanner(System.in);

        switch (option) {
            case 1:
                System.out.print("Enter withdrawal amount: ");
                double withdrawalAmount = scanner.nextDouble();
                if (withdrawalAmount >= 0) {
                    if (userAccount.withdraw(withdrawalAmount)) {
                        System.out.println("Withdrawal successful. Remaining balance: " + userAccount.getBalance());
                    }
                } else {
                    System.out.println("Invalid amount. Withdrawal failed.");
                }
                break;

            case 2:
                System.out.print("Enter deposit amount: ");
                double depositAmount = scanner.nextDouble();
                if (depositAmount >= 0) {
                    userAccount.deposit(depositAmount);
                    System.out.println("Deposit successful. New balance: " + userAccount.getBalance());
                } else {
                    System.out.println("Invalid amount. Deposit failed.");
                }
                break;

            case 3:
                System.out.println("Current balance: " + userAccount.getBalance());
                break;

            case 4:
                System.out.println("Exiting ATM. Thank you!");
                System.exit(0);
                break;

            default:
                System.out.println("Invalid option. Please choose a valid option.");
        }
    }
}

public class ATM_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        BankAccount userAccount = new BankAccount(1000.0);

        
        ATM atm = new ATM(userAccount);

        while (true) {
            
            atm.displayMenu();


            Scanner sc = new Scanner(System.in);
            System.out.print("Choose an option (1-4): ");
            int option = sc.nextInt();

           
            atm.processOption(option);
        }

	}

}



