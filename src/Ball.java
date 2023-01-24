import javax.swing.*;
import java.awt.*;
public class Ball {

    private int x,y;
    private int size;
    private int xSpeed,ySpeed;

    public Ball(int x, int y, int size){
        this.x = x;
        this.y = y;
        this.size = size;
        xSpeed = (int)(Math.random()*50);
        //(int)(Math.random()*50);
        ySpeed = (int)(Math.random()*50);
        //(int)(Math.random()*50);

    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getSize()
    {
        return size;
    }

    public void drawBall(Graphics b){
        b.fillOval(x,y,size,size);
    }

    public void moveRight(){
        x += xSpeed;
    }

    public void moveBall(JPanel bPanel){
        x += xSpeed;
        if(x >= bPanel.getWidth() || x <= 0){
            xSpeed *= -1;
        }
        y += ySpeed;

        if(y>= bPanel.getHeight() || y<=0){
            ySpeed *= -1;
        }

    }

}