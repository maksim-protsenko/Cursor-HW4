package com.cursor.HW4.Geometry;

import com.cursor.HW4.Geometry.interfaces.AreaMeasurable;
import com.cursor.HW4.Geometry.interfaces.PerimeterMeasurable;

import java.util.List;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

    public PlaneShape(List<Double> vertices) {
        super(vertices);
        this.vertices = vertices;
    }

    public List<Double> getVertices() {
        return vertices;
    }

    public double getDistanceBetween2Vertices(PlaneShape shape) {
        return Math.sqrt(Math.pow(vertices.get(0) - shape.getVertices().get(0), 2) +
                Math.pow(vertices.get(1) - shape.getVertices().get(1), 2));
    }

}
