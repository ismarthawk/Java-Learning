class Box {
    double width;
    double height;
    double depth;

    public Box(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double getVolume() {
        return this.width * this.height * this.depth;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box b = new Box(100, 200, 300);
        // b.width = 100;
        // b.height = 200;
        // b.depth = 100;

        System.out.println("the dimensions are " + b.width + " " + b.height + " " + b.depth);
        System.out.println("Volume is : " + b.getVolume());
    }
}