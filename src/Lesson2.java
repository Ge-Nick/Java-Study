public class Lesson2 {
    public static void main(String[] args) {
        int meters = 6546;
        System.out.println(meters + " метров = " + metreConverterFirst(meters) + " километров");
        System.out.println(meters + " метров = " + metreConverterSecond(meters) + " километров (2-й вариант)\n");

        int number = 169;
        System.out.println(number + " - 13% = " + minus13Percent(number) + "\n");

        double rate = 2.64;
        int q = 543;
        System.out.println(buckToByConverter(rate, q) + "\n");

        int a = 34;
        int b = 56;
        System.out.println("( " + a + " + " + b + " ) + " + a + " * " + b + " = " + mathCalc(a, b) + "\n");

        int seconds = 2147483647;
        System.out.println(secondsConverter(seconds) + "\n");

        int twoDigitNumber = 18;
        System.out.println("Сумма цифр из которых состоит число " + twoDigitNumber + " равна " + twoNumbersSum(twoDigitNumber));
    }

    static double metreConverterFirst(int m) {
        return m / (double) 1000;
    }

    static double metreConverterSecond(int m) {
        return m / 1000.0;
    }

    static double minus13Percent(int number) {
        return number * .87;
    }

    static String buckToByConverter(double rate, int quantity) {
        int sum = (int) (rate * quantity);
        return quantity + " USD по курсу " + rate + " = " + sum + " руб.";
    }

    static int mathCalc(int number1, int number2) {
        return (number1 + number2) + number1 * number2;
    }

    //тут будет метод с секундами
    static String secondsConverter(int seconds) {
        int weeks = seconds / (60 * 60 * 24 * 7);
        int days = (seconds % (60 * 60 * 24 * 7)) / (60 * 60 * 24);
        int hours = ((seconds % (60 * 60 * 24 * 7)) % (60 * 60 * 24)) / (60 * 60);
        int minutes = (((seconds % (60 * 60 * 24 * 7)) % (60 * 60 * 24)) % (60 * 60)) / 60;
        int secondsRemainder = ((((seconds % (60 * 60 * 24 * 7)) % (60 * 60 * 24)) % (60 * 60)) % 60) % 60;
        return (seconds + " seconds " + "are equal to " + weeks + " weeks " + days + " days " + hours + " hours " + minutes + " minutes " + secondsRemainder + " seconds");
    }

    static int twoNumbersSum(int number) {
        int firstNumber = number / 10;
        int secondNumber = number % 10;
        return firstNumber + secondNumber;
    }
}
