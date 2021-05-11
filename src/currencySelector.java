

public class currencySelector {

    String[] currencyTypes = {"USD", "EUR", "JPY", "GBP", "CAD"};
    String newCurrencyType = "";
    String currentCurrencyType = "";

    public String selectCurrentType(int inputParsed){

        switch (inputParsed) {
            case 1 -> currentCurrencyType = currencyTypes[0];
            case 2 -> currentCurrencyType = currencyTypes[1];
            case 3 -> currentCurrencyType = currencyTypes[2];
            case 4 -> currentCurrencyType = currencyTypes[3];
            case 5 -> currentCurrencyType = currencyTypes[4];
            default -> System.out.println("Select a valid currency");
        }

        //System.out.println(currentCurrencyType);
        return currentCurrencyType;

    }

    public String selectNewCurrency(int newInputParsed){

        switch (newInputParsed) {
            case 1 -> newCurrencyType = currencyTypes[0];
            case 2 -> newCurrencyType = currencyTypes[1];
            case 3 -> newCurrencyType = currencyTypes[2];
            case 4 -> newCurrencyType = currencyTypes[3];
            case 5 -> newCurrencyType = currencyTypes[4];
            default -> System.out.println("Select a valid currency");
        }

        //System.out.println(newCurrencyType);
        return newCurrencyType;
    }
}
