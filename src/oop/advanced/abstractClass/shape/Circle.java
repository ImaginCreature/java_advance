package oop.advanced.abstractClass.shape;

public class Circle extends Shape {
    private double radius;
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "원 색상은" + super.getColor() + "그리고 면적은 : " + this.area();
    }
}
