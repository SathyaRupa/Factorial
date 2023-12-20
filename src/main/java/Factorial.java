public class Factorial {

    private int factorial = 1;

    public int find(int number) {
        if (number == 0) {
            return 1;
        } else if (number < 0) {
            return number;
        } else {
            for (int iterator = 1; iterator <= number; iterator++) {
                factorial = factorial * iterator;
            }
            return factorial;
        }
    }
}
