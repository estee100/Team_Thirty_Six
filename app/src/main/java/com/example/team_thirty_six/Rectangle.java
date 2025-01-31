package com.example.team_thirty_six;

public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(int x, int y) {
        super(x, y);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}