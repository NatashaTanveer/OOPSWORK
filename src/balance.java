import java.util.Scanner;
public class balance {
    int balance;
    public balance() {
        balance = 0;
    }
    public balance(int Setbalance) {
        balance = Setbalance;
    }
    public void depositBalance() {
        Scanner scanner_obj = new Scanner(System.in);
        System.out.println("The amount you are deposit!");
        int amount = scanner_obj.nextInt();
        balance += amount;
        System.out.println("your aomunt are deposit successfully!");
    }
    public void withdrawBalance() {
        Scanner scanner_obj = new Scanner(System.in);
        System.out.println("The amount you are withdraw!");
        int amount = scanner_obj.nextInt();
        if (amount < balance) {
            balance -= amount;
            System.out.println("your withdraw are successfully!");
        } else {
            System.out.println("insufficient balance!");
        }
    }
        public void displayBalance(){
            System.out.println("balance available in your account is:" + balance);
        }
    }



