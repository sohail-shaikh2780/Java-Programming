class Shape {
    public void area() {
        System.out.println("displays area");
    }

}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }

}

class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

class EquilaterialTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

public class Oops4 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();

    }

}
