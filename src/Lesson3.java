import java.math.BigInteger;

public class Lesson3 {
    public static void main(String[] args) {
        //6
        int digit = -7;
        System.out.println(isSeven(digit) + "\n");

        //7
        System.out.println(rectangleOverCircle(8, 9, 4) + "\n");

        //8
        int rub = 1013;
        System.out.println(rub + rubles(rub) + "\n");

        //9
        int d = 31;
        int m = 12;
        int y = 2020;
        System.out.println(nextDate(d, m, y));

        //12
        int number = 25;
        System.out.print(number + "! = ");
        System.out.printf("%.0f", factorialFloat(number));
        System.out.println("");
        System.out.println(number + "!" + " = " + factorial(number));

        //13
        System.out.println(number + "!" + " = " + mathCalc(number) + "\n");

        //14
        long numTask14 = 7_893_823_445l;
        System.out.println("Сумма цифр в числе " + numTask14 + " = " + numSum(numTask14) + "\n");
        divide7();

        //10
        int land1 = 10;
        int land2 = 20;
        int a1 = 10;
        int a2 = 9;
        int b1 = 12;
        int b2 = 6;
        if (placeHouses(land1, land2, a1, a2, b1, b2) == true)
        {
            System.out.println("Ваши дома поместятся на заданном участке");
        }
        else {
            System.out.println("Нельзя впихнуть невпихуемое :)");
        }
    }
    //6
    static boolean isSeven(int num) {
        return (Math.abs(num % 10) == 7);
    }

    //7
    static String rectangleOverCircle(int a, int b, int r) {
        String answer;
        if ((r * 2) <= a && (r * 2) <= b) {
            answer = "Прямоугольником с размерами " + a + " x " + b + " можно закрыть круг радиусом " + r;
        } else answer = "Прямоугольником с размерами " + a + " x " + b + " нельзя закрыть круг радиусом " + r;
        return answer;
    }
    //8
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

    //9
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
    //12
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

    //13
    static BigInteger mathCalc(int number) {
        BigInteger f = BigInteger.ONE;
        int i = 0;
        do {
            i++;
            f = f.multiply(BigInteger.valueOf(i));
        } while (i < number);
        return f;
    }

    //14
    static int numSum(long num) {
        int result = 0;
        do {
            result += num % 10;
            num /= 10;
        } while (num > 0);
        return result;
    }

    //16
    static void divide7() {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i + " Hope! ");
            }
        }
    }


    //10
    static boolean placeHouses(int landDim1, int landDim2, int a1, int a2, int b1, int b2) {
        return  ((((landDim1) >= (a1 + b1)) && ((landDim2 >= a2) && (landDim2 >= b2))) ||
                (((landDim1) >= (a1 + b2)) && ((landDim2 >= a2) && (landDim2 >= b1))) ||
                (((landDim1) >= (a2 + b1)) && ((landDim2 >= a1) && (landDim2 >= b2))) ||
                (((landDim1) >= (a2 + b2)) && ((landDim2 >= a1) && (landDim2 >= b1))) ||
                (((landDim2) >= (a1 + b1)) && ((landDim1 >= a2) && (landDim1 >= b2))) ||
                (((landDim2) >= (a1 + b2)) && ((landDim1 >= a2) && (landDim1 >= b1))) ||
                (((landDim2) >= (a2 + b1)) && ((landDim1 >= a1) && (landDim1 >= b2))) ||
                (((landDim2) >= (a2 + b2)) && ((landDim1 >= a1) && (landDim1 >= b1))));
    }
}
