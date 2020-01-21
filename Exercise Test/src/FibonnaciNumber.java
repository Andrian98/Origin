

import java.util.ArrayList;

public class FibonnaciNumber {

    public int fiboncaciLoop(int n) {
        int number = 0;
        int number1 = 1;
        int fibon = 0;
        for (int i = 2; i <= n; i++) {
            fibon = number + number1;
            number = number1;
            number1 = fibon;
            System.out.println(fibon);
        }
        return fibon;
    }


    public int fibonnaciRecursion(int n) {
        int fibNumber;
        if (n == 0) {
            return 0;
        } else if (n <= 2) {
            return 1;
        } else {
            fibNumber = fibonnaciRecursion(n - 1) + fibonnaciRecursion(n - 2);
        }
        return fibNumber;
    }

    public void showFibonacciNumbers(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(fibonnaciRecursion(i) + " ");
        }
    }


    public boolean isFibonaaci(int n) {
        ArrayList<Integer> fibonaci = new ArrayList<>();
        int number = 0;
        int number1 = 1;
        int fibon;
        for (int i = 0; i <= n; i++) {
            fibon = number + number1;
            number = number1;
            number1 = fibon;
            fibonaci.add(fibon);
            if (fibon > n) {
                break;
            }
        }
        return fibonaci.contains(n);
    }

    public void fibonnaciRange(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isFibonaaci(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
