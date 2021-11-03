package calculator;

public class Calculator {
    public static int calculate(String text) {
        String[] values = text.split(" ");
        int first = Integer.parseInt(values[0]);
        int second = Integer.parseInt(values[2]);
        String operator = values[1];

        if (operator.equals("+")) {
            return first + second;
        } else if (operator.equals("-")) {
            return first - second;
        } else if (operator.equals("*")) {
            return first * second;
        } else if (operator.equals("/")) {
            return first / second;
        }

        throw new IllegalArgumentException("사칙 연산이 올바르지 않습니다.");
    }
}
