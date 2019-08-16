import java.util.ArrayList;

public class NarcissisticNumber {


    public boolean isNarcissisticNumber(int number) {

        ArrayList<Integer> digits = new ArrayList<>();
        int d ;
        double calculatedNumber = 0;
        int check = number;
        while (number > 0) {
            d = number % 10;
            number = number / 10;
            digits.add(d);
        }
        for (int i = 0; i < digits.size(); i++) {
            calculatedNumber = calculatedNumber + Math.pow(digits.get(i), digits.size());
        }
        return check == calculatedNumber;
    }


//       String numberString = String.valueOf(number);
//        char[] digitChars = numberString.toCharArray();
//         double calculatedNumber = 0;
//
//        for (char digitChar : digitChars) {
//            int digitInt = Character.getNumericValue(digitChar);
//            calculatedNumber = calculatedNumber + Math.pow(digitInt, digitChars.length);
//        }
//
//        return number == calculatedNumber;
//    }


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
