public class Face {
    private int height;
    private int width;

    public Face(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Face(Face f) {
        this.height = f.getHeight();
        this.width = f.getWidth();
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    int getArea() {
        return this.height * this.width;
    }

    protected void printObject() {
        System.out.println("The dimensions are : ");
        System.out.println("Height : " + this.height);
        System.out.println("Width : " + this.width);
    }
}