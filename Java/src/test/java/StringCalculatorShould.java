import com.codurance.stringcalculator.Calculator;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringCalculatorShould {

    @Test
    public void add_TakesEmptyString_ReturnsZero() {
        Calculator calculator = new Calculator();

        int result = calculator.add("");

        assertThat(result, is(0));
    }

    @Test
    public void add_TakesSingleDigit_ReturnsSingleDigit() {
        Calculator calculator = new Calculator();

        int result = calculator.add("4");

        assertThat(result, is(4));
    }

    @Test
    public void add_TakesTwoDigits_AddsAndReturnsSingleDigit() {
        Calculator calculator = new Calculator();

        int result = calculator.add("1,2");

        assertThat(result, is(3));
    }

    @Test
    public void add_TakesArbitraryNumberOfDigits_AddsAndReturnsSingleDigit() {
        Calculator calculator = new Calculator();

        int result = calculator.add("1,2,3");

        assertThat(result, is(6));
    }
}
