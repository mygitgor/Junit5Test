package seminars.third.coverage;

public class SomeService {

    /**
     * 3.1. Метод возвращает Fizz для чисел кратных 3, Buzz для кратных 5, и FizzBuzz для кратных 3 и 5 одновременно
     */
    public String fizzBuzz(int i) {
        String result = "";
        if(i != 0){
            if(i % 3 == 0){
                result = "Fizz";
            }
            if(i % 5 == 0){
                result = "Buzz";
            }
            if(i % 3 == 0 && i % 5 == 0){
                result = "FizzBuzz";
            }
        }
        return result;
    }

    /**
     * 3.2. Метод возвращает true для массивов, которые начинаются или заканчиваются 6,
     * и false - если 6 нет ни в начале ни в конце массива
     */
    public boolean firstLast6(int[] nums) {
        return (nums[0] == 6 || nums[nums.length - 1] == 6);
    }


    /**
     * 3.3. Метод подсчета скидки
     */
    public double calculatingDiscount(double purchaseAmount, int discountAmount) {
        double discount = purchaseAmount * discountAmount / 100;
        return purchaseAmount - discount;
    }


    /**
     * 3.4. Метод принимает на вход 3 числа (int a, b, c). Нужно вернуть их сумму. Однако, если одно из значений равно 13,
     * то оно не учитывается в сумме. Так, например, если b равно 13, то считается сумма только a и c.
     */
    public int calculateSum(int a, int b, int c){
        if (a == 13) {
            a = 0;
        }
        if(b == 13){
            b = 0;
        }
        if(c == 13){
            c = 0;
        }
        return a + b + c;
    }


}