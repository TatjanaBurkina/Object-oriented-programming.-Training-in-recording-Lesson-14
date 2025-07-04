package model.operations;

import model.ComplexNumber;
import java.util.logging.Logger;

public class DivisionOperation implements ComplexOperation {
    private static final Logger logger = Logger.getLogger(DivisionOperation.class.getName());

    @Override
    public ComplexNumber execute(ComplexNumber firstNumber, ComplexNumber secondNumber) {
        logger.info("Dividing numbers: " + firstNumber + " and " + secondNumber);

        double denominator = secondNumber.getReal() * secondNumber.getReal()
                           + secondNumber.getImaginary() * secondNumber.getImaginary();

        double realPart = (firstNumber.getReal() * secondNumber.getReal()
                         + firstNumber.getImaginary() * secondNumber.getImaginary()) / denominator;

        double imaginaryPart = (firstNumber.getImaginary() * secondNumber.getReal()
                              - firstNumber.getReal() * secondNumber.getImaginary()) / denominator;

        return new ComplexNumber(realPart, imaginaryPart);
    }
}
