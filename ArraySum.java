class ArraySum {

    
    void calculateSum() {
        int[] arr = {10, 20, 30, 40};
        int sum = 0;

        
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum of array elements = " + sum);
    }

    public static void main(String[] args) {
        
        ArraySum obj = new ArraySum();
        obj.calculateSum();
    }
}
