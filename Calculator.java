// Калькулятор для выполнения операций с логированием
public class Calculator {
    private final Logger logger;

    // Конструктор принимает объект логирования
    public Calculator(Logger logger) {
        this.logger = logger;
    }

    // Метод вычисления, принимающий операцию и два комплексных числа
    public ComplexNumber calculate(Operation operation, ComplexNumber a, ComplexNumber b) {
        // Отладочный вывод перед выполнением операции
        logger.log("Начало операции: " + operation.getClass().getSimpleName());
        System.out.println("Перед выполнением операции: " + operation.getClass().getSimpleName());
        System.out.println("Число 1: " + a);
        System.out.println("Число 2: " + b);

        // Выполнение операции
        ComplexNumber result = operation.execute(a, b);

        // Логируем результат
        logger.log("Результат операции: " + result);
        System.out.println("Операция завершена! Результат: " + result);

        return result;
    }
}
