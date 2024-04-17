public class Main {
    public static void main(String[] args) {

        int num = factorial(6);
        System.out.println(num);
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

