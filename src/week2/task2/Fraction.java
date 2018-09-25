package week2.task2;

import jdk.internal.org.objectweb.asm.tree.FrameNode;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private int num,den;
    public Fraction(int numerator, int denominator)
    {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
    this.den=denominator;
    this.num=numerator;

    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public static int gcd(int a, int b)
    {
        // TODO: Tính ước chung lớn nhất của 2 số a, b

        while (a != b)
        {
            if (a > b)
            {
                a = a - b;
            }
            else
            {
                b = b - a;
            }
        }
        return a;
    }
    public void toigian()
    {
        int i = gcd(this.getNum(), this.getDen());
        this.setNum(this.getNum() / i);
        this.setDen(this.getDen() / i);
    }
    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction phanso = new Fraction(0,0);
        phanso.num=((this.getNum()*other.getDen()) + (other.getNum()*this.getDen()));
        phanso.den=this.getDen()*other.getDen();
        System.out.println(phanso.num + "/" + phanso.den);
        return phanso;
    }

    public Fraction subtract(Fraction other)
    {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction phanso = new Fraction(0,0);
        phanso.num=((other.getNum()*this.getDen())-(other.getDen()*this.getNum()));
        phanso.den=(other.den*this.den);
        if(phanso.den<0) phanso.den=-phanso.den;
        System.out.println(phanso.num + "/" + phanso.den);
        return phanso;
    }

    public Fraction multiply(Fraction other) {
        Fraction phanso = new Fraction(0,0);
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        phanso.num=(other.num*num);
        phanso.den=(other.den*den);
        System.out.println(phanso.num + "/" + phanso.den);
        return phanso;
    }

    public Fraction divide(Fraction other) {
        Fraction phanso = new Fraction(0,0);
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        phanso.num=(other.num*den);
        phanso.den=(other.den*num);
        System.out.println(phanso.num + "/" + phanso.den);
        return phanso;
    }
    public boolean equals ( Object obj )
    {
        Fraction n = (Fraction) obj ;
        return num*n.den > den*n.num ;
    }
    public static void main (String args[])
    {
        Fraction phanso1 = new Fraction(0,0);
        Fraction phanso2 = new Fraction(0,0);
        Fraction phanso3 = new Fraction(0,0);
        if(phanso1.num!= 0 )
        {
            phanso1.toigian();
        }
        if(phanso2.num!= 0 || phanso2.den == 0 )
        {
            phanso2.toigian();
        }
        phanso3=phanso1.add(phanso2);
        System.out.println(phanso3.num + "/" + phanso3.den);
        if(phanso1.equals(phanso2)) System.out.println("true");
        else System.out.println("false");
    }
}
