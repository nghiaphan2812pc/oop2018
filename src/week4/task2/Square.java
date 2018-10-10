package week4.task2;

public class Square extends Rectangle {

    // TODO: khai báo các thuộc tính cho Square

    public double side;

    // TODO: khởi tạo giá trị cho các thuộc tính của Square

    public Square(String color, boolean filled) {
        super(color, filled);
    }
    public Square(double side){
        super(side,side);
    }
    public Square (double side, String color, boolean filled){
        super(side,side,color,filled);
    }

    // TODO: khai báo các phương thức getter, setter cho Square

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    public double getSide() {
        return side;
    }


    public void setWidth(double side) {
        this.setSide(side);
    }

    public void setLength(double side) {

        this.setSide(side);
    }


    public String toString() {
        return "Square{" +
                "side= " + side +
                '}';
    }
}
