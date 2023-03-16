import javax.swing.*;
import java.awt.*;
public class Ball {

    private int x,y;
    private int size;
    private int xSpeed,ySpeed;
    private Color c;

    public Ball(int x, int y, int size){
        this.x = x;
        this.y = y;
        this.size = size;
        xSpeed = (int)(Math.random()*5+1);
        //(int)(Math.random()*50);
        ySpeed = (int)(Math.random()*5+1);
        //(int)(Math.random()*50);
       
       c = new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
      

    }

    public int getX()
    {
        return x;
    }
  public void setX(int newX)
  {
    x = newX;
  }

    public int getY()
    {
        return y;
    }
  public void setY(int newY)
  {
    y = newY;
  }

    public int getSize()
    {
        return size;
    }


    public void drawBall(Graphics b){
        b.fillOval(x,y,size,size);
         b.setColor(c);
    }

    public void moveRight(){
        x += xSpeed;
    }

  public void moveLeft()
  {
    x-= xSpeed;
  }
  public void moveUp()
  {
    y += ySpeed;
  }
  public void moveDown()
  {
    y -= ySpeed;
  }

    public void moveBall(JPanel bPanel){
        x += xSpeed;
        if(x+size >= bPanel.getWidth() || x <= 0){
            xSpeed *= -1;
        }
      
        y += ySpeed;
        if(y+size >= bPanel.getHeight() || y <= 0){
            ySpeed *= -1;
        }

    }

}