package finalproject.pkg01;

import java.awt.Color;

public class Plate extends Shape {
    private Color color;

    public Plate(int x, int y,int width,int height, Color color) {
        super(x,y,width,height);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}
