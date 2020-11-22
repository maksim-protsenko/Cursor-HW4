package com.cursor.HW4.Geometry;

import java.util.List;

public class Triangle extends PlaneShape {
    private double x;
    private double y;
    private double w;

    public Triangle(List<Double> vertices, double x, double y, double w) {
        super(vertices);
        this.x = x;
        this.y = y;
        this.w = w;
    }

    @Override
    public List<Double> getVertices() {
        return super.getVertices();
    }

    @Override
    public double getPerimeter() {
        return x + y + w;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - w));
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Triangle {");
        sb.append("x = ").append(x);
        sb.append(", y = ").append(y);
        sb.append(", w = ").append(w);
        sb.append(", vertices of triangle = ").append(vertices);
        sb.append(", perimeter of triangle = ").append(getPerimeter());
        sb.append(", area of triangle = ").append(getArea());
        sb.append("}\n");
        return sb.toString();
    }
}
