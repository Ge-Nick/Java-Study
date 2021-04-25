import java.math.BigInteger;

public class Lesson3 {
    public static void main(String[] args) {
        int digit = 4;
        System.out.println(isSeven(digit));

        System.out.println(isSevenCase(digit) + "\n");

        System.out.println(rectangleOverCircle(8, 9, 4) + "\n");

        int rub = 1013;
        System.out.println(rub + rubles(rub) + "\n");

        int number = 25;
        System.out.print(number + "! = ");
        System.out.printf("%.0f", factorialFloat(number));
        System.out.println("");
        System.out.println(number + "!" + " = " + factorial(number));
        System.out.println(number + "!" + " = " + mathCalc(number) + "\n");

        long numTask14 = 7_893_823_445l;
        System.out.println("Сумма цифр в числе " + numTask14 + " = " + numSum(numTask14) + "\n");
        divide7();

        int d = 31;
        int m = 12;
        int y = 2020;
        System.out.println(nextDate(d, m, y));

        int land1 = 45;
        int land2 = 89;
        int a1 = 45;
        int a2 = 75;
        int b1 = 41;
        int b2 = 15;
        if (placeHouses(land1, land2, a1, a2, b1, b2) == true)
        {
            System.out.println("Ваши дома поместятся на заданном участке");
        }
        else {
            System.out.println("Нельзя впихнуть невпихуемое");
        }
    }

    static boolean isSeven(int num) {
        return (num == 7);
    }

    static boolean isSevenCase(int num) {
        boolean isTrue;
        switch (num) {
            case 7:
                isTrue = true;
                break;
            default:
                isTrue = false;
        }
        return isTrue;
    }

    //7
    static String rectangleOverCircle(int a, int b, int r) {
        String answer;
        if ((r * 2) <= a && (r * 2) <= b) {
            answer = "Прямоугольником с размерами " + a + " x " + b + " можно закрыть круг радиусом " + r;
        } else answer = "Прямоугольником с размерами " + a + " x " + b + " нельзя закрыть круг радиусом " + r;
        return answer;
    }

    static String rubles(int rub) {
        String str;
        if ((4 < rub && rub < 21) || (4 < (rub - (rub - rub % 100)) && (rub - (rub - rub % 100)) < 21)) {
            str = " рублей";
        } else {
            switch (rub - (rub - rub % 10)) {
                case 1:
                    str = " рубль";
                    break;
                case 2:
                case 3:
                case 4:
                    str = " рубля";
                    break;
                default:
                    str = " рублей";
            }
        }
        return str;
    }

    static double factorialFloat(int number) {
        int i = 1;
        double factorial = 1f;
        while (i <= number) {
            factorial *= i;
            i++;
        }
        return factorial;
    }

    static BigInteger factorial(int number) {
        int i = 1;
        BigInteger factorial = BigInteger.ONE;
        while (i <= number) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
            i++;
        }
        return factorial;
    }

    static BigInteger mathCalc(int number) {
        BigInteger f = BigInteger.ONE;
        int i = 0;
        do {
            i++;
            f = f.multiply(BigInteger.valueOf(i));
        } while (i < number);
        return f;
    }

    static int numSum(long num) {
        int result = 0;
        do {
            result += num % 10;
            num /= 10;
        } while (num > 0);
        return result;
    }

    static void divide7() {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i + " Hope! ");
            }
        }
    }

    static String nextDate(int d, int m, int y) {
        String newDay;
        String oldDate = "За " + d + "." + m + "." + y + " следует ";
        if ((d > 31) ||
            (m > 12) ||
            ((m == 4 || m == 6 || m == 9 || m == 11) && (d > 30)) ||
            ((m == 2) && (d > 28) && (y % 4 != 0)) ||
            ((m == 2) && (d > 29) && (y % 4 == 0)))
        {
            newDay = "Ты только что подарил миру новый день и заслуживаешь Нобелевской премии! :)";
            return newDay;
        }
        if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10) && (d == 31)) {
            d = 1;
            m++;
        } else if ((m == 4 || m == 6 || m == 9 || m == 11) && (d == 30)) {
            d = 1;
            m++;
        } else if ((m == 2) && (d == 28) && (y % 4 != 0)) {
            d = 1;
            m++;
        } else if ((m == 2) && (d == 29) && (y % 4 == 0)) {
            d = 1;
            m++;
        } else if ((m == 12) && (d == 31)) {
            d = 1;
            m = 1;
            y++;
        } else {
            d++;
        }
        newDay = oldDate + d + "." +  m + "." +  y;
        return newDay;
    }

    static boolean placeHouses(int landDim1, int landDim2, int a1, int a2, int b1, int b2) {
        return (((landDim1) >= (a1 + b1)) && ((landDim2 >= a2) && (landDim2 >= b2))) ||
        (((landDim1) >= (a1 + b2)) && ((landDim2 >= a2) && (landDim2 >= b1))) ||
                (((landDim1) >= (a2 + b1)) && ((landDim2 >= a1) && (landDim2 >= b2))) ||
                (((landDim1) >= (a2 + b2)) && ((landDim2 >= a1) && (landDim2 >= b1))) ||

                (((landDim2) >= (a1 + b1)) && ((landDim1 >= a2) && (landDim1 >= b2))) ||
                (((landDim2) >= (a1 + b2)) && ((landDim1 >= a2) && (landDim1 >= b1))) ||
                (((landDim2) >= (a2 + b1)) && ((landDim1 >= a1) && (landDim1 >= b2))) ||
                (((landDim2) >= (a2 + b2)) && ((landDim1 >= a1) && (landDim1 >= b1)));
    }
}
