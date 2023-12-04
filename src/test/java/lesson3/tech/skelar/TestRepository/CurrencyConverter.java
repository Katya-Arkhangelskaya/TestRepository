package lesson3.tech.skelar.TestRepository;

public class CurrencyConverter {

    private int commission;
    private float exchangeRate;

    public CurrencyConverter(int commission, float exchangeRate) {
        this.commission = commission;
        this.exchangeRate = exchangeRate;
    }

    private float convertUsdToUah(int usd) {
        return exchangeRate * usd;
    }

    private float calculateCommission(float uah) {
        return (commission * uah) / 100;
    }

    public float calculateTotalAmount (int usd) {
        float uah = convertUsdToUah(usd);
        float commission = calculateCommission(uah);

        return uah - commission;
    }
}
