package com.csc205.project2;

public class Sphere extends Shape{

    private double radius;

    public Sphere() {
        super();
        this.radius = 0.0;
    }

    public Sphere(double v) {
        super();
        this.radius = v;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sphere {");
        sb.append(String.format("radius=%.1f", this.radius));
        //sb.append(String.format(", surface area=%.2f", surfaceArea()));
        sb.append(", surface area=").append(surfaceArea());
        //sb.append(String.format(", volume=%.2f", volume()));
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
