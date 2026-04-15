package com.ShapeTool.ShapeArea.service;

import org.springframework.stereotype.Service;

@Service
public class ShapeAreaService {

    public double circle(double radius) {
        return Math.PI * radius * radius;
    }

    public double square(double side) {
        return side * side;
    }

    public double rectangle(double length, double width) {
        return length * width;
    }

    public double triangle(double base, double height) {
        return 0.5 * base * height;
    }

    public double parallelogram(double base, double height) {
        return base * height;
    }
}
