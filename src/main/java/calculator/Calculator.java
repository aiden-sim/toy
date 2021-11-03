package calculator;

public class Calculator {
    public static int calculate(String text) {
        String[] values = text.split(" ");
        Operand first = new Operand(values[0]);
        Operand second = new Operand(values[2]);
        String operator = values[1];

        return calculate(first, second, operator);
    }

    private static int calculate(Operand first, Operand second, String operator) {
        if (operator.equals("+")) {
            return first.plus(second);
        }

        if (operator.equals("-")) {
            return first.minus(second);
        }

        if (operator.equals("*")) {
            return first.multiply(second);
        }

        if (operator.equals("/")) {
            return first.divide(second);
        }

        throw new IllegalArgumentException("사칙 연산이 올바르지 않습니다.");
    }
}
