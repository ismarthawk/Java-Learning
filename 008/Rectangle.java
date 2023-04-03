import MyPackage.*;

public class Rectangle implements ShapeInterface {

    String color;
    int height;
    int width;

    public Rectangle(int height, int width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    @Override
    public void showColor() {
        System.out.println("the color is : " + this.color);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(20, 30, "Green");
        r.showColor();
    }

}
