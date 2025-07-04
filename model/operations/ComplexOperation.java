package model.operations;

import model.ComplexNumber;

public interface ComplexOperation {
    ComplexNumber execute(ComplexNumber firstNumber, ComplexNumber secondNumber);
}
