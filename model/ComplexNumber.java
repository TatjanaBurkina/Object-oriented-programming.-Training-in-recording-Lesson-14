package model;

import java.util.logging.Logger;

public class ComplexNumber {
    private static final Logger logger = Logger.getLogger(ComplexNumber.class.getName());

    private final double real;
    private final double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
        logger.info("Created ComplexNumber object: " + this);
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public String toString() {
        if (imaginary == 0) return real + "";
        if (real == 0) return imaginary + "i";
        return imaginary < 0
                ? real + " - " + (-imaginary) + "i"
                : real + " + " + imaginary + "i";
    }
}
