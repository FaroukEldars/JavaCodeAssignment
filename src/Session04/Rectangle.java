package Session04;

public class Rectangle {
    private double length;
    private double width;
    private static int counter;

    public Rectangle() {
        counter++;
    }

    public Rectangle(double length, double width) {
        System.out.println("This is parameterized constructor");
        this.length = length;
//        this.width=width;
        setWidth(width);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Rectangle.counter = counter;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return length * 2 + width * 2;
    }
}