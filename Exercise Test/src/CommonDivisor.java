public class CommonDivisor {

    public int commonDivisor(int first, int second) {
        double limit = Math.min(first,second);
        int greater = 1;
        for (int i = 1; i < limit; i++) {
            if (first % i == 0) {
                if (second % i == 0) {
                    greater = i;
                }
            }
        }
        System.out.println(greater);
        return greater;
    }



}
