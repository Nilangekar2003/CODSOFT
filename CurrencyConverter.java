import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    private Map<String, Double> exchangeRates;

    public CurrencyConverter() {
        // Initialize exchange rates (replace with real-time rates fetched from API)
        exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.88);
        exchangeRates.put("GBP", 0.77);
        // Add more currencies and their rates as needed
    }

    public double convertCurrency(double amount, String baseCurrency, String targetCurrency) {
        double baseRate = exchangeRates.getOrDefault(baseCurrency, 1.0);
        double targetRate = exchangeRates.getOrDefault(targetCurrency, 1.0);
        return (amount / baseRate) * targetRate;
    }

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Currency Converter");
        System.out.println("Available currencies: USD, EUR, GBP");

        System.out.print("Enter base currency: ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter target currency: ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();

        double convertedAmount = converter.convertCurrency(amount, baseCurrency, targetCurrency);
        System.out.printf("%.2f %s = %.2f %s\n", amount, baseCurrency, convertedAmount, targetCurrency);

        scanner.close();
    }
}
