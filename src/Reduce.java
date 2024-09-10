public class Reduce {
    public static void main(String[] args) {
        // Save the arguments to a variable

        int n = Integer.parseInt(args[0]);

        int steps = 0;
        while (n > 0){
            boolean even = n % 2 == 0;
            if (even) {
                steps++;
                n = n / 2;
            }
            else {
                steps++;
                n--;
            }
        }
        System.out.println(steps);
    }
}
