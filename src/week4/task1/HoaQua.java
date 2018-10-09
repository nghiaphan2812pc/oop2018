package week4.task1;

public class HoaQua {
    // TODO: khai báo các thuộc tính cho HoaQua
        private int Gia;
        private double SoCan;
        private int SoLuong;
        private String LoaiQua;
    // TODO: khởi tạo giá trị cho các thuộc tính của HoaQua
        public HoaQua(){
            Gia = 0;
            SoCan =0;
            SoLuong =0;
            LoaiQua = "";
        }
        public HoaQua(String loaiQua){
            Gia = 0;
            SoCan =0;
            SoLuong =0;
            LoaiQua = loaiQua;
        }

    // TODO: khai báo các phương thức getter, setter cho HoaQua
        public void setGia(int gia) {
            this.Gia = gia;
        }
        public void setSoLuong(int soLuong) {
            this.SoLuong = soLuong;
        }
        public void setSoCan(double soCan) {
            this.SoCan = soCan;
        }
        public void setLoaiQua(String loaiQua) {
            this.LoaiQua = loaiQua;
        }

        public int getGia() {
            return Gia;
        }
        public double getSoCan() {
            return SoCan;
        }
        public int getSoLuong() {
            return SoLuong;
        }
        public String getLoaiQua() {
            return LoaiQua;
        }

        public static void main(String[] args){
            Cam qc = new Cam();
            qc.setGia(200);
            CamThanhPhong ctp = new CamThanhPhong();
            ctp.setGia(200000);
            ctp.getInfo();
            ctp.setSoLuong(900);
            Tao qt = new Tao();
            qt.setGia(90000);
            qt.setSoCan(6.5);
            qt.setLoai(1);
            qt.tinhGiatien();
            CamSanh cs = new CamSanh();
            cs.setMau("xanh");
            cs.getInfo();
        }
}
