package week5_6;
import java.util.ArrayList;
import java.util.Scanner;

public class Layer extends Diagram {
    private String name;
    private String color;
    private boolean descendible;

    ArrayList<Shape> layer = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void nhapLayer(){
        System.out.println("nhap so phan tu cua layer");
        int n = scan.nextInt();
        for(int i =0;i<n;i++){
        System.out.println("menu:");
        System.out.println("nhap 0 neu muon them Circle");
        System.out.println("nhap 1 neu muon them Rectangle");
        System.out.println("nhap 2 neu muon them Square");
        System.out.println("nhap 3 neu muon them Triangle");
            int a = scan.nextInt();
            switch(a){
                case 0:
                    Shape c = new Circle();
                    ((Circle) c).nhap();
                    layer.add(c);
                    break;
                case 1:
                    Shape rg = new Rectangle();
                    ((Rectangle) rg).nhap();
                    layer.add(rg);
                    break;
                case 2:
                    Shape sq = new Square();
                    ((Square) sq).nhap();
                    layer.add(sq);
                    break;
                case 3:
                    Shape tr = new Triangle();
                    ((Triangle) tr).setDoDaiCanh();
                    layer.add(tr);
                    break;
                default: break;
            }
        }
    }
    public void nhap(){
        System.out.println("Nhap ten Layer :");
        name = scan.nextLine();
        System.out.println("Nhap co the di chuyen hay ko:");
        descendible = scan.nextBoolean();
    }
    public void in(){
        System.out.println("NameLayer : " + getName());
        for(int i =0; i< layer.size(); i++){
            layer.get(i).InToado();
        }
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDescendible(boolean descendible) {
        this.descendible = descendible;
    }

    public void setLayer(ArrayList<Shape> layer) {
        this.layer = layer;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public boolean isDescendible() {
        return descendible;
    }

    public ArrayList<Shape> getLayer() {
        return layer;
    }

    public void removeTriangle(){
        for(int i = layer.size()-1;i>=0;i--){
            if(getLayer().get(i) instanceof  Triangle){
                getLayer().remove(i);
            }
        }
    }
    public void removeCircle(){
        for(int i = 0; i < layer.size(); i++){
            if(getLayer().get(i) instanceof Circle) {
                getLayer().remove(i);
                i--;
            }
        }
    }
}
