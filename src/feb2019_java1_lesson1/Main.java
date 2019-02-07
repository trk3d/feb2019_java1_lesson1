package feb2019_java1_lesson1;


import java.util.Random;

public class Main {  // Task 1


    int aInt = 10;  //    Task 2
    long aLong = 2005L;
    byte aByte = 3;
    short aShort = 24;

    float aFloat = 600.0F;
    double aDouble = 150.0;

    boolean aBool = true;

    char aChar = 'a';
    String string = "lalala";


    public static void main(String[] args) {
        String result_task2;
        String result_task3;
        String result_task4;
        String result_task5;
        String result_task7;
        String result_task8;
        String result_task10;
        String result_task11;
        String result_task12;
        String result_task13;
        String result_task14;
        String result_task15;
        String result_task16;
        String result_task17;
        String result_task18;
        String result_task19;

        result_task2 = "" + Task3(1, 2, 3, 4); // Task 3
        System.out.println(result_task2);
        result_task3 = "" + Task4(10, 30); // Task 4
        System.out.println(result_task3);
        result_task5 = "" + Task5(-5); // Task 5
        System.out.println(result_task5);
        result_task4 = "" + Task4(-3); // Task 6
        System.out.println(result_task4);
        result_task7 = "" + Task7("Михаил");   // Task 7
        System.out.println("Доброго времени суток, " + result_task7);
        result_task8 = "" + Task8(true, true); // Task 8
        System.out.println(result_task8);

        //  (a && b ) || (a && !b) || (!a && b) || (!a && !b)   Task 9

        result_task10 = "" + Task10(10, 5);  // Task 10
        System.out.println(result_task10);
        result_task11 = "" + Task11(10, 4, 5); // Task 11
        System.out.println(result_task11);
        result_task12 = "" + Task12(1700); // Task 12
        System.out.println(result_task12);
        result_task13 = "" + Task13(6, 1); // Task 13
        System.out.println(result_task13);
        result_task14 = "" + Task14(6, 1); // Task 14
        System.out.println(result_task14);
        result_task15 = "" + Task15(10); // Task 15
        System.out.println(result_task15);
        result_task16 = "" + Task16(19, 6); // Task 16
        System.out.println(result_task16);
        result_task17 = "" + Task17(10,15,20);
        System.out.println(result_task17);
        result_task18 = "" + Task18(5,3,5); // Task 18
        System.out.println(result_task18);
        result_task19 = "" + Task19(0.4, 1); // Task 19
        System.out.println(result_task19);




    }


    public static int Task3(int a, int b, int c, int d) {
        int itog = a * (b + (c / d));
        return itog;
    }

    public static int Task4(int number1, int number2) {
        int summ;
        summ = number1 + number2;
        if (summ >= 10 && summ <= 20) {
            System.out.println("True");
        } else {
            System.out.println("False;");
        }
        return summ;
    }

    public static int Task5(int number1) {
        int Null = 0;
        if (number1 < 0) {
            System.out.println("True");
        } else {
            System.out.println("False;");
        }
        return number1;
    }

    public static int Task4(int number) {
        int Null = 0;
        if (number < Null) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        return number;
    }

    public static String Task7(String name) {
        System.out.println(name);
        return name;
    }

    private static boolean Task8(boolean a, boolean b) {
        boolean condition;
        if ((!(a && b) && (a || b)) || ((a && b) || !(a || b))) {
            condition = true;
        } else {
            condition = false;
        }
        return condition;


    }

    private static int Task10(int a, int b) {
        int c = a % b;
        if (c == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        return c;
    }

    private static int Task11(int a, int b, int c) {
        int summ = 0;
        if (a > b + c) {
            System.out.println("True");
            return a;
        } else if (b > a + c) {
            System.out.println("True");
            return b;
        } else if (c > a + b) {
            System.out.println("True");
            return c;
        } else {
            System.out.println("False");
            return summ;
        }
    }

    private static int Task12(int a) {
        if ((a % 400 == 0) || (a % 4 == 0 && a % 100 != 0)) {
            System.out.println("Год високосный!");
        } else {
            System.out.println("Год невисокосный!");
        }
        return a;
    }

    private static float Task13(int a, int b) {
        Random random = new Random();
        int num = (b + random.nextInt(a - b));
        return num;
    }

    private static int Task14(int a, int b) {
        Random random = new Random();
        int summ = (b + random.nextInt(a - b)) + (b + random.nextInt(a - b));
        return summ;
    }

    private static double Task15(double t) {
        double ololo = Math.sin(t) + Math.cos(t);
        return ololo;
    }

    private static int Task16(int a, int b) {
        if (a > 20 && a <= 31 && b == 3) {
            System.out.println("Дата в диапазоне.");
            return a;
        } else if (a >= 1 && a <= 30 && b == 4) {
            System.out.println("Дата в диапазоне.");
            return a;
        } else if (a >= 1 && a <= 31 && b == 5) {
            System.out.println("Дата в диапазоне.");
            return a;
        } else if (a >= 1 && a < 20 && b == 6) {
            System.out.println("Дата в диапазоне.");
            return a;
        } else {
            System.out.println("Дата не в диапазоне.");
        }
        return a;

    }

    private static float Task17(float r, float g, float b) {
        float computedC = 1 - (r/255);
        float computedM = 1 - (g/255);
        float computedY = 1 - (b/255);
        int minCMY = (int) Math.min(computedC, (int) Math.min(computedM, computedY));
        float c = (computedC - minCMY) / (1 - minCMY);
        float m = (computedM - minCMY) / (1 - minCMY);
        float y = (computedY - minCMY) / (1 - minCMY);
        System.out.println("C:" + c + " M:" + m + " Y:" + y + " K:" + minCMY);
        return r;
    }

    private static void z17(int r, int g, int b) {

        if ((r < 0) || (g < 0) || (b < 0) || (r > 255) || (g > 255) || (b > 255)) {
            System.out.println("Значение цвета в RGB должно быть в диапазоне 0-255");
            return;
        }
        float computedC = 1 - (r / 255);
        float computedM = 1 - (g / 255);
        float computedY = 1 - (b / 255);
        int minCMY = (int) Math.min(computedC, (int) Math.min(computedM, computedY));
        float c = (computedC - minCMY) / (1 - minCMY);
        float m = (computedM - minCMY) / (1 - minCMY);
        float y = (computedY - minCMY) / (1 - minCMY);
        System.out.println("C:" + c + " M:" + m + " Y:" + y + " K:" + minCMY);
    }

    private static int Task18(int a, int b, int c) {
        if (a == b && a == c){
            System.out.println("Числа равны.");
        } else {
            System.out.println("Числа неравны.");
        } return a;

    }

    private static double Task19(double x, double y) {
        if (x > 0 && x < 1 && y > 0 && y < 1) {
            System.out.println("Все четко.");
        } else {
            System.out.println("За пределами границ.");
        } return x;
    }
}