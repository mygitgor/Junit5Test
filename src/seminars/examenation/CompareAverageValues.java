package seminars.examenation;

public class CompareAverageValues {
    public static void main(String[] args) {

        NumberList perviySpisok = new NumberList();
        NumberList vtoroySpisok = new NumberList();

        // Добавляем числа в первый список
        perviySpisok.addNumber(5.6);
        perviySpisok.addNumber(2.5);
        perviySpisok.addNumber(3.2);

        // Добавляем числа во второй список
        vtoroySpisok.addNumber(5.5);
        vtoroySpisok.addNumber(2.5);
        vtoroySpisok.addNumber(3.2);


        double pervispisok = perviySpisok.calculateAverage();
        double vtoroyspisok = vtoroySpisok.calculateAverage();

        System.out.println("Среднее значение первого списка: " + pervispisok);
        System.out.println("Среднее значение второго списка: " + vtoroyspisok);

        // Сравнения списков
        compareAverageValues(pervispisok,vtoroyspisok);

    }

    // Метод сравнения списков
    public static String compareAverageValues(double spisok1, double spisok2) {

        if (spisok1 > spisok2){
            return "Первый список имеет большее среднее значение";
        } else if (spisok2 > spisok1) {
            return"Второй список имеет большее среднее значение";
        }else {
            return"Средние значения равны";
        }
    }

}
