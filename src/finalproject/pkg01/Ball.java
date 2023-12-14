package finalproject.pkg01;

import java.awt.Color;

public class Ball extends Shape {
    private Color color;

    public Ball(int x, int y,int width,int height, Color color) {
        super(x,y,width,height);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}
