package br.com.ClassesAbstratas.metodosAbstratos;

public class Circle extends Shape {
    private Double radius;

    private Circle() {

    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
       return Math.PI * Math.pow(radius, 2);
    }
}
