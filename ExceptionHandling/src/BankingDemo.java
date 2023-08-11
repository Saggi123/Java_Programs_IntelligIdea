import java.util.Scanner;

public class BankingDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();

        while (true) {
            System.out.println("Enter 'd' to deposit or 'w' to withdraw (q to quit): ");
            String action = scanner.nextLine();

            if (action.equals("q")) {
                break;
            }

            try {
                System.out.println("Enter amount: ");
                double amount = Double.parseDouble(scanner.nextLine());

                if (amount <= 0) {
                    throw new InvalidAmountException("Amount must be positive.");
                }

                if (action.equals("w")) {
                    if (amount > account.getBalance()) {
                        throw new InsufficientFundsException("Insufficient funds.");
                    } else {
                        account.withdraw(amount);
                        System.out.println("Withdrawal successful. Current balance: " + account.getBalance());
                    }
                } else if (action.equals("d")) {
                    account.deposit(amount);
                    System.out.println("Deposit successful. Current balance: " + account.getBalance());
                } else {
                    throw new InvalidActionException("Invalid action.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            } catch (InvalidAmountException | InsufficientFundsException | InvalidActionException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Goodbye!");
    }
}

class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class InvalidActionException extends Exception {
    public InvalidActionException(String message) {
        super(message);
    }
}
