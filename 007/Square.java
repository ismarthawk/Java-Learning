import java.lang.*;

public class Square extends Shape implements Cloneable {

    String color;
    int side;

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public void showColor() {
        System.out.println("the color of the shape is : " + this.color);
    }

    @Override
    public void showArea() {
        System.out.println("The area of the square is : " + (this.side * this.side));
        return;
    }

    public static void main(String[] args) {
        Square s = new Square(20, "Red");
        s.showArea();
        s.showColor();

        // object clone
        try {

            Square s2 = (Square) s.clone();
            System.out.println(s.equals(s2));
        } catch (Exception e) {
            System.out.println("Error is" + e.toString());
        }

    }

}
