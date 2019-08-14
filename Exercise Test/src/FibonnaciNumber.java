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

    int number = 0;
    int number1 = 1;
    int fibon;

    public void fibonnaciRecursion(int n) {
        if (n > 0) {
            fibon = number + number1;
            number = number1;
            number1 = fibon;
            System.out.println(fibon);
            fibonnaciRecursion(n - 1);
        }
    }


    public boolean isFibonaaci(int n) {
        ArrayList<Integer> fibonaci = new ArrayList<>();
        int number = 0;
        int number1 = 1;
        int fibon = 0;
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
