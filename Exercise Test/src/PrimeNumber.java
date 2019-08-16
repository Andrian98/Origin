public class PrimeNumber {


    boolean isPrimeNumber(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public void primeNumbers(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrimeNumber(i)) {
                count = count + 1;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }


}
