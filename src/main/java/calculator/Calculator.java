package calculator;

public class Calculator {
    public static int calculate(String text) {
        String[] values = text.split(" ");
        Operand first = new Operand(values[0]);
        Operand second = new Operand(values[2]);
        String operator = values[1];

        return Operator.calculate(first, second, operator);
    }
}
