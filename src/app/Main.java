package app;

import model.CalculatorModel;
import model.ComplexNumber;
import model.operations.AdditionOperation;
import model.operations.DivisionOperation;
import model.operations.MultiplicationOperation;
import service.OperationLogger;

public class Main {
    public static void main(String[] args) {
        OperationLogger logger = new OperationLogger();
        CalculatorModel calculator = new CalculatorModel(logger);

        ComplexNumber num1 = new ComplexNumber(3, 2);
        ComplexNumber num2 = new ComplexNumber(1, 4);

        logger.log("Complex Number 1: " + num1);
        logger.log("Complex Number 2: " + num2);

        logger.log("\n--- Addition ---");
        ComplexNumber sum = calculator.calculate(new AdditionOperation(), num1, num2);
        System.out.println("Result: " + sum);

        logger.log("\n--- Multiplication ---");
        ComplexNumber product = calculator.calculate(new MultiplicationOperation(), num1, num2);
        System.out.println("Result: " + product);

        logger.log("\n--- Division ---");
        ComplexNumber quotient = calculator.calculate(new DivisionOperation(), num1, num2);
        System.out.println("Result: " + quotient);
    }
}
