package week4.task1;

public class CamThanhPhong extends Cam {
    // TODO: khai báo các thuộc tính cho CamThanhPhong
    public CamThanhPhong(){
        // TODO: khởi tạo giá trị cho các thuộc tính của Cam
        this.setLoaiQua("Cam Thanh Phong");
        this.setNguongoc("Thanh Phong");
    }
    public void getInfo (){
        this.setVi("Ngọt");
        System.out.println("Loại quả "+ this.getLoaiQua());
        System.out.println("Nguồn gốc"+ this.getNguongoc());
        System.out.println("Vị " + this.getVi());
        System.out.println("Giá tiền " +this.getGia()+"/kg");
    }
}
