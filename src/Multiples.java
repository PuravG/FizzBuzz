public class Multiples {

    public static void main(String[] args) {

        int limit = Integer.parseInt(args[0]);

        int numMultiples = 0;
        for (int i = 1; i < limit; i++) {
            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 || divisibleBy5) {
                numMultiples++;
            }
        }
        System.out.println(numMultiples);
    }
}