import java.util.Locale;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Type your account number: ");
        int accountNumber = scanner.nextInt();

        System.out.println("Type your agency: ");
        String agency = scanner.next();

        System.out.println("Type your name: ");
        String nameClient = scanner.next();
        
    
        double balance = 000;

        System.out.println(
            "Hello, " + nameClient +
            ", thank you por create an account with us, your agency is " + agency +
            ", account number " + accountNumber +
            " and your balance is " + balance
        );

    }
}
