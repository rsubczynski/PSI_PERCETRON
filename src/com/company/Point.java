package com.company;

public class Point {
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int x;
    int y;

    public int getX() {
        return (x*55)+50;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return 600-(y*55);
    }

    public void setY(int y) {
        this.y = y;
    }
}
