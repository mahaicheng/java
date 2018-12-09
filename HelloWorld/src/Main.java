public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int c = a + b;

        for (int i = a; i < b; ++i) {
            System.out.println(i);
        }
        System.out.print(c);
        System.out.println("Hello World!");

        System.out.print(add(a, b));
        System.out.println(fibonacci(40));
        System.out.println(add(fibonacci(40), fibonacci(42)));
    }

    private static int add(int lhs, int rhs) {
        return lhs + rhs;
    }

    private static int fibonacci(int i) {
        if (i < 1) {
            return 0;
        }
        return i <= 2 ? 1 : fibonacci(i - 1) + fibonacci(i - 2);
    }
}
