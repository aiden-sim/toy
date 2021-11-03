package calculator;

public class Calculator {
    public static int calculate(String text) {
        String[] values = text.split(" ");
        int first = Integer.parseInt(values[0]);
        int second = Integer.parseInt(values[2]);
        String operator = values[1];

        int result = 0;
        if (operator.equals("+")) {
            result = first + second;
        } else if (operator.equals("-")) {
            result = first - second;
        } else if (operator.equals("*")) {
            result = first * second;
        } else if (operator.equals("/")) {
            result = first / second;
        }

        return result;
    }
}
