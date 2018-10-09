package week4.task2;

public class Rectangle extends Shape {

    // TODO: khai báo các thuộc tính cho Rectangle

    public double width;
    public double length;

    // TODO: khởi tạo giá trị cho các thuộc tính của Rectangle

    public Rectangle(String color, boolean filled){
        super(color, filled);
    }
    public Rectangle(){
        width= 1.0;
        length=1.0;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length,String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // TODO: khai báo các phương thức getter, setter cho Rectangle

    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
