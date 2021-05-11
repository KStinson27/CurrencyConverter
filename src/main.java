import java.util.Scanner;

public class main {
    public static void main(String[] args){

        System.out.println("Select Currency Type: ");
        System.out.println("1: U.S. Dollar , 2: Euros, 3: Japanese Yen, 4: British Pound, 5: Canadian Dollar");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        int currentCurrency = Integer.parseInt(userInput);

         currencySelector cs = new currencySelector();
         cs.selectCurrentType(currentCurrency);

        System.out.println("What do you want to convert to?");
        System.out.println("1: U.S. Dollar , 2: Euros, 3: Japanese Yen, 4: British Pound, 5: Canadian Dollar");
        String newUserInput = scanner.nextLine();
        int newCurrencyType = Integer.parseInt(newUserInput);

        System.out.println("Your currency currency is: " + cs.selectCurrentType(currentCurrency) + " and you want to convert to: " + cs.selectNewCurrency(newCurrencyType));
        System.out.println("Enter amount of money to convert: ");
        String money = scanner.nextLine();
        double moneyAmount = Double.parseDouble(money);

        currencyConverter cc = new currencyConverter();
        cc.currencyConverter(cs.selectCurrentType(currentCurrency),cs.selectNewCurrency(newCurrencyType),moneyAmount);
    }
}
