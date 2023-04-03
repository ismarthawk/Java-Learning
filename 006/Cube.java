public class Cube extends Face {
    int depth;

    public Cube(int height, int width, int depth) {
        super(height, width);
        this.depth = depth;
    }

    public Cube(Face f, int depth) {
        super(f);
        this.depth = depth;
    }

    public int getVolume() {
        return getArea() * this.depth;
    }

    protected void printObject() {
        super.printObject();
        System.out.println("Depth : " + this.depth);
    }

    public static void main(String[] args) {
        // Cube c = new Cube(20, 30, 40);
        // System.out.println(c.getVolume());
        // c.printObject();

        Face f = new Face(20, 30);
        Cube c = new Cube(f, 20);

        c.printObject();
        f.printObject();

    }

}
