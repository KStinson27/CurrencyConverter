

public class currencyConverter {
    public double currencyConverter(String currentCurrency, String newCurrency, double amountOfMoney){

        //exchange rates - USD

        double usdToCAD = 1.20;
        double usdToGBP = 0.70;
        double usdToJPY = 108.61;
        double usdToEUR = 0.822;

        //exchange rates - CAD

        double cadToUSD = 0.82;
        double cadToGBP = 0.58;
        double cadToJPY = 89.86;
        double cadToEUR = 0.68;

        //exchange rates - EUR

        double eurToUSD = 1.21;
        double eurToCAD = 1.46;
        double eurToJPY = 132.04;
        double eurToGBP = 0.85;

        //exchange rates - JPY

        double jpyToEUR = 0.0075 ;
        double jpyToCAD = 0.0111;
        double jpyToGBP = 0.0065 ;
        double jpyToUSD = 0.0092;

        //exchange rates - GBP

        double gbpToEUR = 1.164;
        double gbpToUSD = 1.416;
        double gbpToCAD = 1.71;
        double gbpToJPY = 153.81;

        double convertedAmount = 0.00;

        currencySelector cs = new currencySelector();

        switch(currentCurrency){
            case "USD":
                if (newCurrency.equals("EUR")){

                    convertedAmount = amountOfMoney * usdToEUR;
                    System.out.println("USD to EUR = € "+ convertedAmount);

                } else if(newCurrency.equals("GBP")){

                    convertedAmount = amountOfMoney / usdToGBP;
                    System.out.println("USD to GBP = £ "+ convertedAmount);

                }else if (newCurrency.equals("JPY")){

                    convertedAmount = amountOfMoney * usdToJPY;
                    System.out.println("USD to JPY = ¥ "+ convertedAmount);

                }else if (newCurrency.equals("CAD")){

                    convertedAmount = amountOfMoney * usdToCAD;
                    System.out.println("USD to CAD = $ "+ convertedAmount);
                }else {
                    convertedAmount = amountOfMoney;
                    System.out.println("USD to USD = $ "+ amountOfMoney);
                }
                break;
            case "EUR":
                if (newCurrency.equals("USD")){

                    convertedAmount = amountOfMoney * eurToUSD;
                    System.out.println("EUR to USD = $ "+ convertedAmount);

                } else if(newCurrency.equals("GBP")){

                    convertedAmount = amountOfMoney * eurToGBP;
                    System.out.println("EUR to GBP = £ "+ convertedAmount);

                }else if (newCurrency.equals("JPY")){

                    convertedAmount = amountOfMoney * eurToJPY;
                    System.out.println("EUR to JPY = ¥ "+ convertedAmount);

                }else if (newCurrency.equals("CAD")){
                    convertedAmount = amountOfMoney * eurToCAD;
                    System.out.println("EUR to CAD = $ "+ convertedAmount);

                }else {
                    convertedAmount = amountOfMoney;
                    System.out.println("EUR to EUR = € "+ amountOfMoney);
                }
                break;
            case "JPY":
                if (newCurrency.equals("USD")){

                    convertedAmount = amountOfMoney * jpyToUSD;
                    System.out.println("JPY to USD = $ "+ convertedAmount);

                } else if(newCurrency.equals("GBP")){

                    convertedAmount = amountOfMoney * jpyToGBP;
                    System.out.println("JPY to GBP = £ "+ convertedAmount);

                }else if (newCurrency.equals("EUR")){

                    convertedAmount = amountOfMoney * jpyToEUR;
                    System.out.println("JPY to EUR = € "+ convertedAmount);

                }else if (newCurrency.equals("CAD")){
                    convertedAmount = amountOfMoney * jpyToCAD;
                    System.out.println("JPY to CAD = $ "+ convertedAmount);

                }else {
                    convertedAmount = amountOfMoney;
                    System.out.println("JPY to JPY = ¥ "+ amountOfMoney);
                }
                break;
            case "CAD":
                if (newCurrency.equals("USD")){

                    convertedAmount = amountOfMoney * cadToUSD;
                    System.out.println("CAD to USD = $ "+ convertedAmount);

                } else if(newCurrency.equals("GBP")){

                    convertedAmount = amountOfMoney * cadToGBP;
                    System.out.println("CAD to GBP = £ "+ convertedAmount);

                }else if (newCurrency.equals("EUR")){

                    convertedAmount = amountOfMoney * cadToEUR;
                    System.out.println("CAD to EUR = € "+ convertedAmount);

                }else if (newCurrency.equals("JPY")){
                    convertedAmount = amountOfMoney * cadToJPY;
                    System.out.println("CAD to JPY = ¥ "+ convertedAmount);

                }else {
                    convertedAmount = amountOfMoney;
                    System.out.println("CAD to CAD = $ "+ amountOfMoney);
                }
                break;
            case "GBP":
                if (newCurrency.equals("USD")){

                    convertedAmount = amountOfMoney * gbpToUSD;
                    System.out.println("GBP to USD = $ "+ convertedAmount);

                } else if(newCurrency.equals("CAD")){

                    convertedAmount = amountOfMoney * gbpToCAD;
                    System.out.println("GBP to CAD = $ "+ convertedAmount);

                }else if (newCurrency.equals("EUR")){

                    convertedAmount = amountOfMoney * gbpToEUR;
                    System.out.println("CAD to EUR = € "+ convertedAmount);

                }else if (newCurrency.equals("JPY")){
                    convertedAmount = amountOfMoney * gbpToJPY;
                    System.out.println("GBP to JPY = ¥ "+ convertedAmount);

                }else {
                    convertedAmount = amountOfMoney;
                    System.out.println("GBP to GBP = £ "+ amountOfMoney);
                }
                break;
            default:
                System.out.println("error");
        }
        return convertedAmount;
    }
}
