
package ee.bcs.valiit.tasks;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;

public class Lesson2 {

    public static void main(String[] args) {
        System.out.println(exercise5(0, 10000));
    }

    public static void exercise1() {
        // TODO loo 10 elemendile täisarvude massiv
        // TODO loe sisse konsoolist 10 täisarvu
        // TODO trüki arvud välja vastupidises järiekorras
        Scanner scanner = new Scanner(System.in);
        //System.out.println(Arrays.toString(a));
        int[] intArray = new int[10];
        for (int i = 0; i <= 9; i++) {
            intArray[i] = scanner.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(intArray[i]);
        }


    }


    public static void exercise2(int x) {
        // TODO prindi välja x esimest paaris arvu
        // Näide:
        // Sisend 5
        // Väljund 2 4 6 8 10
        if (x >= 0) {
            for (int i = 2; i <= x * 2; i = i + 2) {
                System.out.println(i);
            }

        } else {
            System.out.println("Your number is lower or equal to 0");
        }
    }

    public static void exercise3(int x, int y) {
        // TODO trüki välja korrutustabel mis on x ühikut lai ja y ühikut kõrge
        // TODO näiteks x = 3 y = 3
        // TODO väljund
        // 1 2 3
        // 2 4 6
        // 3 6 9
        // TODO 1 trüki välja korrutustabeli esimene rida (numbrid 1 - x)
        // TODO 2 lisa + " " print funktsiooni ja kasuta print mitte println
        // TODO 3 trüki seda sama rida y korda
        // TODO 4 Kuskile võiks kirjutada System.out.println(),
        // et saada tabeli kuju
        // TODO 5 võrdle ridu. Kas on mingi seaduspärasus ridade vahel
        // mis on ja mis võiks olla. Äkki tuleb mõni idee

        for (int j = 1; j <= y; j++) {
            for (int i = 1; i <= x; i++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

    public static int fibonacci(int n) {
        // TODO
        // Fibonacci jada on fib(n) = fib(n-1) + fib(n-2);
        // 0, 1, 1, 2, 3, 5, 8, 13, 21
        // Tagasta fibonacci jada n element
        int num1 = 0, num2 = 1;

        int counter = 0;

        // Iterate till counter is n
        while (counter < n) {

            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
        return num1 + num2;
    }

    public static int exercise5(int i, int j) {
        // https://onlinejudge.org/index.php?option=onlinejudge&Itemid=8&page=show_problem&problem=36
        // TODO 1 tee alamfunktsioon mis leiab 3n+1 sequenci pikkuse
        // kui on paaris / 2 kui on paaritu *3+1
        // TODO 2 tee tsükkel mis leiab i->j kõige suurema tsükli pikkuse
        //Consider the following algorithm:
        //1. input n
        //2. print n
        //3. if n = 1 then STOP
        //4. if n is odd then n ←− 3n + 1
        //5. else n ←− n/2
        //6. GOTO 2
        int a = 0;
        for (; i <= j; i++) {
            a = Math.max(exercise5_1(i), a);
        }
        return a;

    }

    public static int exercise5_1(int n) {
        int counter = 1;

        if (n == 1) {
            System.out.println(n);
        } else if (n <= 0) {
            System.out.println("Please input integer greater than zero!");
        }
        while (n > 1) {
            if (n % 2 == 1) {
                n = 3 * n + 1;
            } else {
                n = n / 2;
            }
            counter = counter + 1;
        }
        return counter;
    }

    public static void exercise6() throws FileNotFoundException {
        /*
            Kirjutada Java programm, mis loeb failist visits.txt sisse looduspargi
            külastajad erinevatel jaanuari päevadel ning
            a) sorteerib külastuspäevad külastajate arvu järgi kasvavalt ning
            prindib tulemuse konsoolile;
            b) prindib konsoolile päeva, mil külastajaid oli kõige rohkem.
            Faili asukoht tuleb programmile ette anda käsurea parameetrina.
         */
        //Declare global variables
        int numOfVisits = 0;

        //Initialize classes
        File visitsFile = new File("visits.txt");
        Scanner scanner = new Scanner(visitsFile);
        //Get number of movies
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            //visitsFile += (line + "\n");
            numOfVisits++;
        }
        //Print test number of movies
        System.out.println("Number of visitors: " + numOfVisits);

    }

    public static void exercise7() {
        // TODO arvuta kasutades BigDecimali 1.89 * ((394486820340 / 15 ) - 4 )
        BigDecimal a = new BigDecimal("1.89");
        BigDecimal b = new BigDecimal("394486820345");
        BigDecimal c = new BigDecimal("15");
        BigDecimal d = new BigDecimal("4");

        System.out.println(b.divide(c, 4, RoundingMode.HALF_UP));
    }

    public static void exercise8() {
        /*
        Failis nums.txt on üksteise all 150 60-kohalist numbrit.

        Kirjuta programm, mis loeks antud numbrid failist sisse ja liidaks need arvud kokku ning kuvaks ekraanil summa.
        Faili nimi tuleb programmile ette anda käsurea parameetrina.

        VASTUS:
        Õige summa: 77378062799264987173249634924670947389130820063105651135266574
         */
    }

    public static void exercise9() {
        /* TODO
        Sama mis eelmises ülesandes aga ära kasuta BigInt ega BigDecimal klassi
         */
    }

}
