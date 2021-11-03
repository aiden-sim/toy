package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    void 덧셈() {
        int number = Calculator.calculate("1 + 1");
        assertThat(number).isEqualTo(3);
    }

    @Test
    void 뺄셈() {
        int number = Calculator.calculate("2 - 1");
        assertThat(number).isEqualTo(1);
    }

    @Test
    void 곱셈() {

    }

    @Test
    void 나눗셈() {

    }
}
