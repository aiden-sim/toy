package calculator;

import java.util.Arrays;
import java.util.function.BiFunction;

public enum Operator {
    PLUS("+", Operand::plus),
    MINUS("-", Operand::minus),
    MULTIPLY("*", Operand::multiply),
    DIVIDE("/", Operand::divide);

    private final String operator;
    private final BiFunction<Operand, Operand, Integer> expression;

    Operator(String operator, BiFunction<Operand, Operand, Integer> expression) {
        this.operator = operator;
        this.expression = expression;
    }

    public static int calculate(Operand first, Operand second, String operator) {
        return getOperator(operator).expression.apply(first, second);
    }

    private static Operator getOperator(String operator) {
        return Arrays.stream(values())
                .filter(v -> v.operator.equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("사칙연산 기호가 아닙니다."));
    }
}
