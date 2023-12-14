package finalproject.pkg01;

import eg.edu.alexu.csd.oop.game.GameObject;
import java.awt.image.BufferedImage;

public class Player implements GameObject{
    private static Player player = null;
    
    private static final int width = 50;
    private static final int height = 50;
    private int x;
    private int y;
    boolean visible;

    private Player(int x, int y) {
    }

    public static Player getInstance() {
        if (player == null) {
            player = new Player(0,0);
        }
        return player;
    }
    
    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public boolean isVisible() {
        return visible;
    }

    @Override
    public BufferedImage[] getSpriteImages() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
