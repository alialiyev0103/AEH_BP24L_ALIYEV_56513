package pl.pp;
import pl.pp.Task2_Account;
public class Task2_Main {
    public static void main(String[] args) {
        // Example usage
        Task2_Account account = new Task2_Account("10011000\n", 400.0, "ali aliyev", "ali@aliyev.com", "+214521512");
        account.withdraw(500);
        account.credit(250.0);
        account.withdraw(50.0);
        account.withdraw(300.0);
    }
}