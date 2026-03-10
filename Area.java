class Area {

    // Area of square
    int area(int side) {
        return side * side;
    }

    // Area of rectangle
    int area(int length, int breadth) {
        return length * breadth;
    }

    // Area of circle
    double area(double radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String args[]) {
        Area a = new Area();

        System.out.println("Area of square: " + a.area(4));
        System.out.println("Area of rectangle: " + a.area(5, 6));
        System.out.println("Area of circle: " + a.area(3.5));
    }
}
