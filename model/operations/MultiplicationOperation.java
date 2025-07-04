package model.operations;

import model.ComplexNumber;
import java.util.logging.Logger;

public class MultiplicationOperation implements ComplexOperation {
    private static final Logger logger = Logger.getLogger(MultiplicationOperation.class.getName());

    @Override
    public ComplexNumber execute(ComplexNumber firstNumber, ComplexNumber secondNumber) {
        logger.info("Multiplying numbers: " + firstNumber + " and " + secondNumber);

        double realPart = firstNumber.getReal() * secondNumber.getReal()
                        - firstNumber.getImaginary() * secondNumber.getImaginary();

        double imaginaryPart = firstNumber.getReal() * secondNumber.getImaginary()
                             + firstNumber.getImaginary() * secondNumber.getReal();

        return new ComplexNumber(realPart, imaginaryPart);
    }
}
