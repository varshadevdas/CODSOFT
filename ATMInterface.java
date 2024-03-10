import java.util.Scanner;

public class ATMInterface {

    private int initialBalance = 10000;
     Scanner scanner = new Scanner(System.in);

    public void displayBalance() {
        System.out.println("Available Balance: $" + initialBalance);
    }

    public void deposit() {
        System.out.println("Enter the amount to deposit:");
        int depositAmount = scanner.nextInt();
        System.out.println("Deposit Successful: $" + depositAmount);
        initialBalance += depositAmount;
        System.out.println("Updated Balance: $" + initialBalance);
    }

    public void withdraw() {
        System.out.println("Enter the amount to withdraw:");
        int withdrawAmount = scanner.nextInt();

        if (withdrawAmount <= initialBalance) {
            System.out.println("Withdrawal Successful: $" + withdrawAmount);
            initialBalance -= withdrawAmount;
            System.out.println("Updated Balance: $" + initialBalance);
        } else {
            System.out.println("Insufficient Funds. Current balance: $" + initialBalance);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------Welcome To Your Bank Account------");

        char choice = 'y'; 
        ATMInterface bankAccount = new ATMInterface();

        while (choice == 'y' || choice == 'Y') { 
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Check Current Balance");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Exit");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    bankAccount.displayBalance();
                    break;
                case 2:
                    bankAccount.deposit();
                    break;
                case 3:
                    bankAccount.withdraw();
                    break;
                case 4:
                    choice = 'n';
                    System.out.println("Thank you for using your Bank Account.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            System.out.println("\nDo you want to perform another transaction? (y/n)");
            choice = scanner.next().charAt(0); 
        }

        scanner.close();
    }
}
