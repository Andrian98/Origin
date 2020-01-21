public class Main {

    public static void main(String[] args) {

        long start =  System.currentTimeMillis();

//        PrimeNumber primeNumber = new PrimeNumber();
//        primeNumber.primeNumbers(2, 1000000);
//
//        NarcissisticNumber narcissisticNumber = new NarcissisticNumber();
//        narcissisticNumber.narcissisticNumbers(2, 1000);
//
//        Palindrome palindrome = new Palindrome();
//        palindrome.palindrome(122252221);
//
//        GreaterCommonDivisor commonDivisor = new GreaterCommonDivisor();
//        commonDivisor.greaterCommonDivisor(66, 98);
//
        FibonnaciNumber fibonnaciNumber = new FibonnaciNumber();
//        fibonnaciNumber.fiboncaciLoop(20);
        fibonnaciNumber.showFibonacciNumbers(10);
       // fibonnaciNumber.fibonnaciRange(2, 1000);


        long end = System.currentTimeMillis();

        System.out.println("Duration: " + (end - start));

    }
}
