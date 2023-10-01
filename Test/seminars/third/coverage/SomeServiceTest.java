package seminars.third.coverage;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {

    @Test
    void fizzBuzz() {
        SomeService someService = new SomeService();
        assertThat(someService.fizzBuzz(3)).isEqualTo("Fizz");
        assertThat(someService.fizzBuzz(10)).isEqualTo("Buzz");
        assertThat(someService.fizzBuzz(15)).isEqualTo("FizzBuzz");
    }

    @Test
    void firstLast6() {
        SomeService someService = new SomeService();
        int[] array = new int[]{1,2,3,4,6};
        assertThat(someService.firstLast6(array)).isEqualTo(true);
    }

    @Test
    void calculatingDiscount() {
        SomeService someService = new SomeService();
        assertThat(someService.calculatingDiscount(100,10)).isEqualTo(90);
    }

    @Test
    void calculateSum() {
        SomeService someService = new SomeService();
        assertThat(someService.calculateSum(13,13,13)).isEqualTo(0);
        assertThat(someService.calculateSum(10,13,13)).isEqualTo(10);
        assertThat(someService.calculateSum(5,10,13)).isEqualTo(15);
        assertThat(someService.calculateSum(5,10,15)).isEqualTo(30);
    }
}