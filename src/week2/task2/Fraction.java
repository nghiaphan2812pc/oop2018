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

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction phanso = new Fraction(0,0);
        phanso.num=((this.getNum()*other.getDen()) + (other.getNum()*this.getDen()));
        phanso.den=this.getDen()*other.getDen();
        return phanso;
    }

    public Fraction subtract(Fraction other)
    {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction phanso = new Fraction(0,0);
        phanso.num=((this.getNum()*other.getDen())-(this.getDen()*other.getNum()));
        phanso.den=(other.den*this.den);
        if(phanso.den<0) phanso.den=-phanso.den;

        return phanso;
    }

    public Fraction multiply(Fraction other) {
        Fraction phanso = new Fraction(0,0);
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        phanso.num=(other.num*num);
        phanso.den=(other.den*den);

        return phanso;
    }

    public Fraction divide(Fraction other) {
        Fraction phanso = new Fraction(0,0);
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        phanso.setNum(num*other.den);
        phanso.setDen(den*other.num);
        return phanso;
    }
    public boolean equals ( Object obj )
    {
        Fraction n = (Fraction) obj ;
        return num*n.den == den*n.num ;
    }
