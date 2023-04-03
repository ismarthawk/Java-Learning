
public class Box {
    int height;
    int width;
    int depth;

    public Box(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public Box(Face f) {
        this.height = f.height;
        this.width = f.width;
        this.depth = (f.height + f.width) / 2;
        System.out.println("setting the depth to : " + ((f.height + f.width) / 2));

        // checking the object passing
        f.height = f.width = f.height;
    }

    public int getVolume() {
        return this.height * this.width * this.depth;
    }

    public static void main(String[] args) {
        Face f = new Face(100, 201);
        Box b = new Box(f);

        System.out.println("The volume is : " + b.getVolume());
        System.out.println("the passed face" + f.height + f.width);
    }
}

class Face {
    int height;
    int width;

    public Face(int height, int widht) {
        this.height = height;
        this.width = widht;
    }
}
