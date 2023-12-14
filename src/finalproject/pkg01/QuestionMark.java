package finalproject.pkg01;

public class QuestionMark extends Shape{
    public QuestionMark(int x, int y,int width,int height) {
        super(x,y,width,height);
    }
    public Shape getShape(){
        ShapeFactory factory = new ShapeFactory();
        /*returns a random number between 0 or 1*/
        int random = (int)(Math.random()*2);
        if(random == 0)
            return factory.getShape("Bomb");
        else
            return factory.getShape("Life");
    }
    
}
