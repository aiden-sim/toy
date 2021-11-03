package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OperandTest {

    @Test
    void create() {
        assertThat(new Operand("1")).isEqualTo(new Operand(1));
    }

    @Test
    void plus() {
        assertThat(new Operand("1").plus(new Operand(2))).isEqualTo(3);
    }

    @Test
    void minus() {
        assertThat(new Operand("4").minus(new Operand(2))).isEqualTo(2);
    }

    @Test
    void multiply() {
        assertThat(new Operand("2").multiply(new Operand(3))).isEqualTo(6);
    }

    @Test
    void divide() {
        assertThat(new Operand("4").divide(new Operand(2))).isEqualTo(2);
    }

}
