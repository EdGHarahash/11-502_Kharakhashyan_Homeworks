package ru.itis.inform;


public class RationalNum {
    private int numerator;
    private int denominator;

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public RationalNum(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator==0){
            throw new IllegalArgumentException();
        }
        else this.denominator = denominator;
    }
}
