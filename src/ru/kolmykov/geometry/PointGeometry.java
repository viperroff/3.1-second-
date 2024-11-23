package ru.kolmykov.geometry;

public class PointGeometry {
    private int x;
    private int y;

    public PointGeometry(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

