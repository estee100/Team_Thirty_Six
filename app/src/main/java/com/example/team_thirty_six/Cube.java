package com.example.team_thirty_six;

public class Cube extends Shape {
    private int volume;

    public Cube(int x, int y) {
        super(x, y);
        this.volume = x*y*x;
    }

    public int getVolume() {
        return volume;
    }

}
