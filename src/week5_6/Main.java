package week5_6;

public class Main {
    public static void main(String args[]){
        Diagram diagram = new Layer();
        Layer layer1  = new Layer();
        layer1.nhapLayer();
        layer1.in();
        layer1.removeTriangle();
        layer1.in();
        diagram.themlayer(1);
        ((Layer) diagram).nhapLayer();
        ((Layer) diagram).in();
        ((Layer) diagram).removeCircle();
        ((Layer) diagram).in();
    }
}

