class MaximumThree {
    int a, b, c;

    MaximumThree(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    void findMax() {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("Maximum = " + max);
    }

    public static void main(String[] args) {
        MaximumThree obj = new MaximumThree(10, 25, 15);
        obj.findMax();
    }
}

