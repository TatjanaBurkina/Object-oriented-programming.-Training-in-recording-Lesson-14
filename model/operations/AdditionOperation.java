package model.operations;

import model.ComplexNumber;
import java.util.logging.Logger;

public class AdditionOperation implements ComplexOperation {
    private static final Logger logger = Logger.getLogger(AdditionOperation.class.getName());

    @Override
    public ComplexNumber execute(ComplexNumber firstNumber, ComplexNumber secondNumber) {
        logger.info("Adding numbers: " + firstNumber + " and " + secondNumber);
        return new ComplexNumber(
            firstNumber.getReal() + secondNumber.getReal(),
            firstNumber.getImaginary() + secondNumber.getImaginary()
        );
    }
}
