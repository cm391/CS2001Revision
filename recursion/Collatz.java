package recursion;

public class Collatz {

    public static int puzzle(int n) {
        if (n == 1) return 1;
        if (n % 2 == 0) return puzzle(n / 2);
        else return puzzle(3 * n + 1);
    }

    public static void main(String[] args) {
        int n = 1;
        while (n < 30) {
            System.out.println(n + ": " + puzzle(n));
            n++;
        }
    }
}
