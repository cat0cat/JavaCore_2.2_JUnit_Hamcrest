import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.IsNull.notNullValue;

class NumbersTest {
    Numbers numbers;

    @BeforeEach
    void setUp() {
        numbers = new Numbers();
    }

    @Test
    @DisplayName("Проверка корректности проверки простого числа")
    void isPrime() {
        // given:
        final int num = 67;
        final boolean expected = true;
        // when:
        boolean actual = numbers.isPrime(num);
        // then:
        assertThat(num, allOf(greaterThan(0)));
        assertThat(expected, Matchers.is(actual));
        assertThat(true, Matchers.equalTo(actual));
    }

    @Test
    @DisplayName("Проверка корректности суммы чисел от 0 до заданного числа")
    void sumNumbers() {
        // given:
        final int num = 34;
        final int expected = 595;
        // when:
        int actual = numbers.sumNumbers(num);
        // then:
        assertThat(expected, Matchers.is(actual));
    }

    @Test
    @DisplayName("Проверка корректности суммы цифр заданного числа")
    void sumDigits() {
        // given:
        final int num = 32151;
        final long expected = 12;
        // when:
        long actual = numbers.sumDigits(num);
        // then:
        assertThat(expected, Matchers.is(actual));
    }

    @Test
    @DisplayName("Проверка корректности факториала заданного числа")
    void getFactorial() {
        // given:
        final int num = 7;
        final BigInteger expected = BigInteger.valueOf(5040);
        // when:
        BigInteger actual = numbers.getFactorial(num);
        // then:
        assertThat(expected, Matchers.is(actual));
    }

    @Test
    @DisplayName("Проверка перевода строки в число")
    void strToInt() {
        // given:
        final String s = "38";
        final int expected = 38;
        // when:
        int actual = numbers.strToInt(s);
        // then:
        assertThat(s, notNullValue());
        assertThat(expected, Matchers.is(actual));
    }
}