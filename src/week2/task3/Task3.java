package week2.task3;


    //TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
    class Quyenvo {
        private String mau;
        private int chieudai;
        private int chieurong;
        private int sotrang;

        public String getMau() {
            return mau;
        }

        public int getChieudai() {
            return chieudai;
        }

        public int getChieurong() {
            return chieurong;
        }

        public int getSotrang() {
            return sotrang;
        }

        public void setMau(String mau) {
            this.mau = mau;
        }

        public void setChieudai(int chieudai) {
            this.chieudai = chieudai;
        }

        public void setChieurong(int chieurong) {
            this.chieurong = chieurong;
        }

        public void setSotrang(int sotrang) {
            this.sotrang = sotrang;
        }

        public int chuvi() {
            return (chieudai + chieurong) * 2;
        }

        public int dientich() {
            return chieudai * chieurong;

        }

        public double thetich() {
            return sotrang * chieurong * chieudai * 0.001;
        }

        public static void main(String args[]) {
            Quyenvo a = new Quyenvo();
            a.setChieudai(18);
            a.setChieurong(6);
            a.setSotrang(100);
            System.out.println(a.thetich());
        }
    }

     class Banhtrungthu
    {
        private int bankinh;
        private int chieucao;
        private String nhan;

        public int getBankinh() {
            return bankinh;
        }

        public int getChieucao() {
            return chieucao;
        }

        public String getNhan() {
            return nhan;
        }

        public void setBankinh(int bankinh) {
            this.bankinh = bankinh;
        }

        public void setChieucao(int chieucao) {
            this.chieucao = chieucao;
        }

        public void setNhan(String nhan) {
            this.nhan = nhan;
        }
        public double dientichday()
        {
            return bankinh*3.14*3.14;

        }
        public double chuviday()
        {
            return bankinh*2*3.14;
        }
        public double thetich()
        {
            return bankinh*3.14*3.14*chieucao;
        }
        public static void main(String args[])
        {
            Banhtrungthu a = new Banhtrungthu();
            a.setBankinh(3);
            a.setChieucao(3);
            a.setNhan("Dauxanh1trung");
            System.out.println(a.chuviday()+a.dientichday()+a.getNhan());
        }
    }
class BMI{
    int cannang;
    int chieucao;
    int nhietdo;

    public int getCannang() {
        return cannang;
    }

    public int getCao() {
        return chieucao;
    }

    public int getNhietdo() {
        return nhietdo;
    }

    public void setCannang(int cannang) {
        this.cannang = cannang;
    }

    public void setCao(int cao) {
        this.chieucao = cao;
    }

    public void setNhietdo(int nhietdo) {
        this.nhietdo = nhietdo;
    }

    public void baohayko()
    {
        if(cannang<50) { System.out.println(" gay ");}
        else if(cannang>70) {System.out.println(" beo ");}
        else {System.out.println(" binh thuong ");}
    }
    public void danhgiacao()
    {
        if(chieucao<140){System.out.println(" thap ");}
        else if(chieucao>190){System.out.println(" cao qua ");}
        else {System.out.println(" binh thong ");}
    }
    public void xetnhietdo()
    {
        if(nhietdo>37.5&&nhietdo<38){System.out.println(" sot nhe ");}
        else if(nhietdo>38&&nhietdo<40){System.out.println(" sot cao");}
        else {System.out.println(" nen nhap vien ");}
    }
    public static void main (String a[])
    {
        BMI b = new BMI();
        b.setNhietdo(10);
        b.xetnhietdo();
    }
    }
