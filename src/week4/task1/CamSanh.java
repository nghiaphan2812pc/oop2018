package week4.task1;

public class CamSanh extends Cam {
    // TODO: khai báo các thuộc tính cho CamSanh
    private String mau;
    public CamSanh(){
        // TODO: khởi tạo giá trị cho các thuộc tính của CamSanh
        this.setLoaiQua("Cam Sanh");
        this.setVi(" chua");
    }
    // TODO: khai báo các phương thức getter, setter cho CamSanh

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public void getInfo (){
        System.out.println("Loại quả :"+ this.getLoaiQua());
        System.out.println("màu quả :"+ this.getMau());
        System.out.println("Vị: " + this.getVi());
        System.out.println("Giá: "+ this.getGia());
    }
}
