package lesson5.tech.skelar.TestRepository;

public class Fraction {

    private float numerator;
    private float denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public boolean equals(Object o) {
        Fraction fraction = (Fraction) o;
        float division = numerator / denominator;
        float division2 = fraction.numerator / fraction.denominator;
        return division == division2;
    }
}
