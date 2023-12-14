package finalproject.pkg01;

public class Life extends Shape{
    private static int count = 3;
    private static final int maxCount = 3;
    private static final int minCount = 0;
    public Life(int x, int y,int width,int height) {
        super(x,y,width,height);
    }
    public void addLife(){
        if (count<maxCount)
            count++;
        else
            System.out.println("you have already 3 lives");
    }
    public void removeLife(){
        if (count>minCount)
            count--;
        else
            System.out.println("game over");
    }
}
