package week4.task1;

public class Tao extends HoaQua {
    // TODO: khai báo các thuộc tính cho Tao
    private int loaiHang;

    public Tao(){
        // TODO: khởi tạo giá trị cho các thuộc tính của Tao
        new HoaQua();
        loaiHang = 0;
    }
    // TODO: khai báo các phương thức getter, setter cho Tao
    public void setLoai(int loai) {
        this.loaiHang = loai;
    }

    public int getLoai() {
        return loaiHang;
    }
    public void tinhGiatien() {
        double giaban;
        if(loaiHang == 1) {
            giaban = (getGia()+2000)*getSoCan();
        }
        else {
            giaban = getGia()*getSoCan();
        }
        System.out.println("Số tiền táo loại "+loaiHang+ " là "+giaban);
    }
}
