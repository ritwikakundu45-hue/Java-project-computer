class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Circle {
    Point center;
    double radius;

    Circle(int x, int y, double r) {
        center = new Point(x, y);
        radius = r;
    }

    void display() {
        double area = Math.PI * radius * radius;

        System.out.println("Center: (" + center.x + ", " + center.y + ")");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Circle c = new Circle(3, 4, 5);
        c.display();
    }
}
