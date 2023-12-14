package finalproject.pkg01;

import java.awt.Color;

public class ShapeFactory {
    public ShapeFactory(){
    }
    
    public Shape getShape(String shape){
        return switch(shape){
            case "Life" -> new Life(0,0,0,0);
            case "Bomb" -> new Bomb(0,0,0,0);
            case "Plate" -> new Plate(0,0,0,0,getColor());
            case "Ball" -> new Ball(0,0,0,0,getColor());
            case "Magnet" -> new Magnet(0,0,0,0);
            case "QuestionMark" -> new QuestionMark(0,0,0,0);   
            default -> null;
        };
    }
    /*returns a random color*/
    public Color getColor(){
        Color[] colors = {Color.RED,Color.BLUE,Color.GREEN,Color.YELLOW,Color.MAGENTA};
        int random = (int)(Math.random()*colors.length);
        return colors[random];
    }
}
