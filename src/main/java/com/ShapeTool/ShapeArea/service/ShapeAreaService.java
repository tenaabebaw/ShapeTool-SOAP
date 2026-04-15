package com.ShapeTool.ShapeArea.service;

import com.ShapeTool.ShapeArea.exception.InvalidInputException;
import org.springframework.stereotype.Service;

@Service
public class ShapeAreaService {

    public double circle(double radius) {

        if (radius < 0) {
            throw new InvalidInputException("Radius cannot be negative");
        }

        return Math.PI * radius * radius;
    }

    public double square(double side) {

        if (side < 0) {
            throw new InvalidInputException("Side cannot be negative");
        }

        return side * side;
    }

    public double rectangle(double length, double width) {

        if (length < 0 || width < 0) {
            throw new InvalidInputException("Length and Width must be positive");
        }

        return length * width;
    }

    public double triangle(double base, double height) {

        if (base < 0 || height < 0) {
            throw new InvalidInputException("Base and Height must be positive");
        }

        return 0.5 * base * height;
    }

    public double parallelogram(double base, double height) {

        if (base < 0 || height < 0) {
            throw new InvalidInputException("Base and Height must be positive");
        }

        return base * height;
    }
}
