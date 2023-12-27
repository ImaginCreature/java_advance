package oop.advanced.abstractClass.shape;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }

    @Override
    public String toString() {
        return "직사각형 색상은" + super.getColor() + "그리고 면적은 : " + this.area();
    }
}
