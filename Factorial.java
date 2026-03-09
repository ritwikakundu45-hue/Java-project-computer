class Factorial {
    final int NUMBER = 5;   // Constant value

    // Member function to calculate factorial
    int calculateFactorial() {
        int fact = 1;
        for (int i = 1; i <= NUMBER; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        int result = obj.calculateFactorial();
        System.out.println("Factorial of " + obj.NUMBER + " is: " + result);
    }
}

