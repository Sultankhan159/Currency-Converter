import java.util.Scanner;

public class CurrencyConverter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Exchange rates (you can update these)
        double usdToInr = 82.50, usdToEur = 0.91, usdToGbp = 0.76;
        double eurToUsd = 1.10, eurToInr = 90.75, eurToGbp = 0.84;
        double gbpToUsd = 1.32, gbpToEur = 1.19, gbpToInr = 108.60;
        double inrToUsd = 0.012, inrToEur = 0.011, inrToGbp = 0.0092;
        
        System.out.println("Welcome to Currency Converter!");
        System.out.println("Choose the currency to convert FROM:");
        System.out.println("1. USD\n2. EUR\n3. GBP\n4. INR");
        int fromCurrency = scanner.nextInt();
        
        System.out.println("Choose the currency to convert TO:");
        System.out.println("1. USD\n2. EUR\n3. GBP\n4. INR");
        int toCurrency = scanner.nextInt();
        
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();
        double convertedAmount = 0;

        // Conversion logic
        switch (fromCurrency) {
            case 1: // USD
                if (toCurrency == 2) convertedAmount = amount * usdToEur;
                else if (toCurrency == 3) convertedAmount = amount * usdToGbp;
                else if (toCurrency == 4) convertedAmount = amount * usdToInr;
                break;
            case 2: // EUR
                if (toCurrency == 1) convertedAmount = amount * eurToUsd;
                else if (toCurrency == 3) convertedAmount = amount * eurToGbp;
                else if (toCurrency == 4) convertedAmount = amount * eurToInr;
                break;
            case 3: // GBP
                if (toCurrency == 1) convertedAmount = amount * gbpToUsd;
                else if (toCurrency == 2) convertedAmount = amount * gbpToEur;
                else if (toCurrency == 4) convertedAmount = amount * gbpToInr;
                break;
            case 4: // INR
                if (toCurrency == 1) convertedAmount = amount * inrToUsd;
                else if (toCurrency == 2) convertedAmount = amount * inrToEur;
                else if (toCurrency == 3) convertedAmount = amount * inrToGbp;
                break;
            default:
                System.out.println("Invalid currency selection!");
                
        }

        System.out.println("Converted Amount: " + convertedAmount);
        scanner.close();
    }
}

    
