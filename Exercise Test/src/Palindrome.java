public class Palindrome {

    public void palindrome(int input) {
        int d ;
        int sum = 0;
        int check;
        check = input;
        // alternativ loop:
        for (int i = 0; i < input; i++) {


       //       while (input > 0) {
            d = input % 10;
            sum = (sum * 10) + d;
            input = input / 10;
            i--;
        }
        if (check == sum) {
            System.out.println(check + " is palindrome number");
        } else {
            System.out.println(check + " is not a palindrome number");
        }


// In case of String input:
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(input);
//        stringBuilder.reverse();
//        if (input.equals(stringBuilder.toString())) {
//            System.out.println(input + " is palindrome");
//        } else {
//            System.out.println(input + " is not palindrome" + "because " + stringBuilder);
//        }
    }
}
