class Fibonacci {
    int n;

    Fibonacci(int n) {
        this.n = n;
    }

    void generate() {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci(10);
        obj.generate();
    }
}

