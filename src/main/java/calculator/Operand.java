package calculator;

import java.util.Objects;

public class Operand {
    private int number;

    public Operand(String number) {
        this.number = Integer.parseInt(number);
    }

    public Operand(int number) {
        this.number = number;
    }

    public int plus(Operand operand) {
        return this.number + operand.number;
    }

    public int minus(Operand operand) {
        return this.number - operand.number;
    }

    public int multiply(Operand operand) {
        return this.number * operand.number;
    }

    public int divide(Operand operand) {
        return this.number / operand.number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operand operand = (Operand) o;
        return number == operand.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
