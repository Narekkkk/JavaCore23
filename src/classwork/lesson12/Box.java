package classwork.lesson12;

public class Box {
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth) {

        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }

    boolean equalTo(Box box) {
        return (this.width == box.width
                && this.height == box.height
                && this.depth == box.depth);
    }
}