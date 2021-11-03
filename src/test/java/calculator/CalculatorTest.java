package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    @Test
    void 덧셈() {
        int number = Calculator.calculate("1 + 1");
        assertThat(number).isEqualTo(2);
    }

    @Test
    void 뺄셈() {
        int number = Calculator.calculate("2 - 1");
        assertThat(number).isEqualTo(1);
    }

    @Test
    void 곱셈() {
        int number = Calculator.calculate("2 * 1");
        assertThat(number).isEqualTo(2);
    }

    @Test
    void 나눗셈() {
        int number = Calculator.calculate("4 / 2");
        assertThat(number).isEqualTo(2);
    }
}
