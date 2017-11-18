package com.company;

public class Point {
    public Point(int x, int y, CartesianPanel.POINT point) {
        this.x = x;
        this.y = y;
        this.point = point;
    }

    private int x;
    private int y;

    public CartesianPanel.POINT getPoint() {
        return point;
    }

    public void setPoint(CartesianPanel.POINT point) {
        this.point = point;
    }

    private CartesianPanel.POINT point;

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
