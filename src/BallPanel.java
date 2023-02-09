import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import javax.swing.*;
import java.awt.*;
public class BallPanel extends JPanel{
    Ball[] ballArray = new Ball[20];
    Ball ballOne = new Ball(50,50,100);
   // Ball mine;
    public BallPanel(){
        setFocusable(true);
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

                System.out.println(e.getKeyCode());
                int k = e.getKeyCode();
                if(k >= 39) {
                    ballOne.moveRight();
                }
                if(k <= 39)
                {
                    ballOne.moveLeft();
                }



            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        setBackground(Color.blue);
        //mine = new Ball(30,50,10);
        for(int i = 0; i < 20; i ++) {
            ballArray[i] = new Ball((int)(Math.random()*400),(int)(Math.random()*400),(int)(Math.random()*50));
        }

    }

    @Override
    protected void paintComponent(Graphics g){

        super.paintComponent(g);
        //mine.drawBall(g);
        ballOne.drawBall(g);

        for(int i = 0; i < ballArray.length; i++){

            ballArray[i].drawBall(g);
            ballArray[i].moveBall(this);


        }

        //g.fillOval(10,20,10,10);
        //newBall.drawBall(g);
        //newBall.moveBall();

        try{
            Thread.sleep(20);
        }

        catch(Exception e){
            System.out.println(e);
        }

        repaint();



    }



}
