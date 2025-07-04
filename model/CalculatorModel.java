package model;

import model.operations.ComplexOperation;
import model.ComplexNumber;
import service.OperationLogger;

public class CalculatorModel {
    private final OperationLogger logger;

    public CalculatorModel(OperationLogger logger) {
        this.logger = logger;
    }

    public ComplexNumber calculate(ComplexOperation operation, ComplexNumber firstNumber, ComplexNumber secondNumber) {
        logger.log("Starting operation: " + operation.getClass().getSimpleName());
        logger.log("Operand 1: " + firstNumber);
        logger.log("Operand 2: " + secondNumber);

        ComplexNumber result = operation.execute(firstNumber, secondNumber);

        logger.log("Operation complete. Result: " + result);
        return result;
    }
}
