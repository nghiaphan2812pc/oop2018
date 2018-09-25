package week2.task3;

public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
public class conmeo {
    private String chungloai;
    private String maulong;
    private int tuoi;
    public void setChungloai(String chungloai){
        this.chungloai = chungloai;
    }
    public void setMaulong(String maulong){
        this.maulong = maulong;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public String getChungloai(){
        return chungloai;
    }
    public String getMaulong(){
        return maulong;
    }
    public int getTuoi(){
        return tuoi;
    }
}
public  class toipham
{
    private String mautoc;
    private int chieucao;
    private int tuoi;

    public String getMautoc() {
        return mautoc;
    }

    public int getChieucao() {
        return chieucao;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setMautoc(String mautoc) {
        this.mautoc = mautoc;
    }

    public void setChieucao(int chieucao) {
        this.chieucao = chieucao;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
}
public class nhac
{
        private String ten;
        private String caSi;
        private String nhacSi;
        private int chatLuong;
        private int view;
        private String dongNhac;

        public String getTen() {
            return ten;
        }

        public String getCaSi() {
            return caSi;
        }

        public String getNhacSi() {
            return nhacSi;
        }

        public int getChatLuong() {
            return chatLuong;
        }

        public int getView() {
            return view;
        }

        public String getDongNhac() {
            return dongNhac;
        }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setCaSi(String caSi) {
        this.caSi = caSi;
    }

    public void setNhacSi(String nhacSi) {
        this.nhacSi = nhacSi;
    }

    public void setChatLuong(int chatLuong) {
        this.chatLuong = chatLuong;
    }

    public void setView(int view) {
        this.view = view;
    }

    public void setDongNhac(String dongNhac) {
        this.dongNhac = dongNhac;
    }
}