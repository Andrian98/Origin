

public class NarcissisticNumber {


    public boolean isNarcissisticNumber(int number) {
        String numberString = String.valueOf(number);
        char[] digitChars = numberString.toCharArray();
        double calculatedNumber = 0;

        for (char digitChar : digitChars) {
            int digitInt = Character.getNumericValue(digitChar);
            calculatedNumber = calculatedNumber + Math.pow(digitInt, digitChars.length);
        }

        return number == calculatedNumber;
    }


    public void narcissisticNumbers(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isNarcissisticNumber(i)) {
                count = count + 1;
                System.out.println(i);
            }
        }
        System.out.println("Total: " + count);
    }


}
