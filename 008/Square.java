import MyPackage.*;

public class Square extends Shape {

    int side;
    String color;

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public void showColor() {
        System.out.println("The color of the shape is : " + this.color);
    }

    public static void main(String[] args) {
        Square s = new Square(20, "Red");
        s.showColor();
    }

}
