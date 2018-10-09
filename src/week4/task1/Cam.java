package week4.task1;

public class Cam extends HoaQua {
    // TODO: khai báo các thuộc tính cho Cam
    String nguonGoc;
    String vi;

    public Cam(){
        // TODO: khởi tạo giá trị cho các thuộc tính cho Cam
        new HoaQua();
        nguonGoc = "";
        vi = "";
    }
    // TODO: khai báo các phương thức getter, setter cho Cam
    public void setNguongoc(String nguongoc) {
        this.nguonGoc = nguongoc;
    }
    public void setVi(String vi) {
        this.vi = vi;
    }
    public String getNguongoc() {
        return nguonGoc;
    }
    public String getVi() {
        return vi;
    }
}
