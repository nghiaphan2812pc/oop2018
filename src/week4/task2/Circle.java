package week4.task2;

public class Circle extends Shape {

    // TODO: khai báo các thuộc tính cho Circle

    private double radius;
    private final double pi = Math.PI;

    // TODO: khởi tạo giá trị cho các thuộc tính của Circle

    public Circle(String color, boolean filled) {
        super(color, filled);
    }
    public void Circle() {
        radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle (double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // TODO: khai báo các phương thức getter, setter cho Circle

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }


    public double getArea(){
        return pi*radius*radius;
    }
    public double getPerimeter(){
        return 2*pi*radius;
    }

    public String toString() {
        return "Circle{" +
                "radius= " + radius +
                ", pi=" + pi +
                ", color= " + getColor() +
                ", filled= " + isFilled()+
                '}';
    }
}
