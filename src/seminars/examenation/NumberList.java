package seminars.examenation;

import java.util.ArrayList;
import java.util.List;

public class NumberList {
    private List<Double> numbers;

    public NumberList(){
        this.numbers = new ArrayList<>();
    }

    public void addNumber(double number){
        numbers.add(number);
    }

    public double calculateAverage(){
        if (numbers.isEmpty()) {
            return 0.0;
        }

        double sum = 0;

        for (Double number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }

}
