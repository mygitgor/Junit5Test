package seminars.fourth.weather;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class WeatherReporterTest {

    @Test
    void weatherReporterTest(){
        WeatherService weatherService = mock(WeatherService.class);
        WeatherReporter weatherReporter = mock(WeatherReporter.class);
        String report = weatherReporter.generateReport();

    }


}