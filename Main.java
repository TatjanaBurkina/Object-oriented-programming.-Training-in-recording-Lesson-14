// Запуск калькулятора комплексных чисел
public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        Calculator calculator = new Calculator(logger);

        ComplexNumber num1 = new ComplexNumber(3, 2);
        ComplexNumber num2 = new ComplexNumber(1, 4);

        System.out.println("Число 1: " + num1);
        System.out.println("Число 2: " + num2);

        System.out.println("\nСложение:");
        calculator.calculate(new Addition(), num1, num2);

        System.out.println("\nУмножение:");
        calculator.calculate(new Multiplication(), num1, num2);

        System.out.println("\nДеление:");
        calculator.calculate(new Division(), num1, num2);
    }
}
