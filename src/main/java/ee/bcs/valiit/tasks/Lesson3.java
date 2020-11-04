package ee.bcs.valiit.tasks;

import java.util.*;

public class Lesson3 {

    public static void main(String[] args) {
        reverseString("Artur");
    }


    public static int uusSumma(int x, int y) {
        // TODO liida kokku ja tagasta x ja y väärtus
        int c = x + y;
        return c;
    }

    public static int sum(int[] x) {
        // Todo liida kokku kõik numbrid massivis x
        int sum = 0;
        for (int i = 0; i <= x.length - 1; i++) {
            sum += x[i];
        }
        return sum;
    }

    public static int factorial(int x) {
        // TODO tagasta x faktoriaal.
        // Näiteks
        // x = 5
        // return 4*3*2*1 = 24
        int faktoriaal = 1;
        if (x > 0) {
            for (int i = 1; i <= x; i++) {
                faktoriaal *= i;
            }
            return faktoriaal;
        } else return 0;
    }

    public static int[] sort(int[] a) {
        // TODO sorteeri massiiv suuruse järgi
        // Näiteks {2, 6, 8, 1}
        // Väljund {1, 2, 6, 8}
        int n = a.length;
        //int[] intArray = new int[n];
        int tmp = 0;
        for (int j = 0; j < n; j++)
            for (int i = j + 1; i < n; i++) {
                if (a[i] < a[j]) {
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
                ;
            }
        return a;
    }

    public static String reverseString(String a) {
        // TODO tagasta string tagurpidi
        // Näiteks:
        // a = "Test";
        // return tseT";
        int size=a.length();
        int[] StringArray = new int[size-1];
        int[] StringArray1 = new int[size-1];

        for (int i = size-1; i >= 0; i--) {
            StringArray[i] = a.charAt(i);
        }
        for (int i = size-1; i>=0; i--) {
            StringArray1[i] = a.charAt(i);
        }

        return ;
    }

    public static boolean isPrime(int x) {
        // TODO tagasta kas sisestatud arv on primaar arv (jagub ainult 1 ja iseendaga)
        return false;
    }

}
