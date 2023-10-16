package seminars.examenation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CompareAverageValuesTest {

    //отчет о покрытии кода тестами
    @Test
    void main() {
        CompareAverageValues compareAverage = new CompareAverageValues();
        assertThat(compareAverage.compareAverageValues( 7.5, 5.1)).isEqualTo( "Первый список имеет большее среднее значение");
        assertThat(compareAverage.compareAverageValues( 5.2, 7.1)).isEqualTo( "Второй список имеет большее среднее значение");
        assertThat(compareAverage.compareAverageValues( 5.0, 5.0)).isEqualTo( "Средние значения равны");
    }
}