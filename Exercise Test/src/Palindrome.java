public class Palindrome {

    public void palindrome(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input);
        stringBuilder.reverse();
        if (input.equals(stringBuilder.toString())) {
            System.out.println(input + " is palindrome");
        } else {
            System.out.println(input + " is not palindrome" + "because " + stringBuilder);
        }
    }
}
