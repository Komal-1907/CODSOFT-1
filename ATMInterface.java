import java.util.Scanner;

class BankAccount {
        double balance = 10000;

        void deposit(double amount) {
                balance = balance + amount;
                System.out.println("Deposited Successfully");
        }

        void withdraw(double amount) {
                if (amount <= balance) {
                        balance = balance - amount;
                        System.out.println("Withdraw Successful");
                } else {
                        System.out.println("Insufficient Balance");
                }
        }

        void checkBalance() {
                System.out.println("Current Balance: ₹" + balance);
        }
}

public class ATMInterface {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                BankAccount acc = new BankAccount();
                int choice;

                do {
                        System.out.println("\n--- ATM MENU ---");
                        System.out.println("1. Deposit");
                        System.out.println("2. Withdraw");
                        System.out.println("3. Check Balance");
                        System.out.println("4. Exit");
                        System.out.print("Enter choice: ");

                        choice = sc.nextInt();

                        switch (choice) {

                                case 1:
                                        System.out.print("Enter amount to deposit: ");
                                        double d = sc.nextDouble();
                                        acc.deposit(d);
                                        break;

                                case 2:
                                        System.out.print("Enter amount to withdraw: ");
                                        double w = sc.nextDouble();
                                        acc.withdraw(w);
                                        break;

                                case 3:
                                        acc.checkBalance();
                                        break;

                                case 4:
                                        System.out.println("Thank you for using ATM");
                                        break;

                                default:
                                        System.out.println("Invalid Choice");
                        }

                } while (choice != 4);

                sc.close();
        }
}


