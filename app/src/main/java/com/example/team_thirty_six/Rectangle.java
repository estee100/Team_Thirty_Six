package com.example.team_thirty_six;

public class Rectangle extends Shape {
    private final int area;

    public Rectangle(int x, int y) {
        super(x, y);
        this.area = x*y;
    }

    public int getArea() {
        return area;
    }

}
