import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class BallPanel extends JPanel{
    Ball[] ballArray = new Ball[20];
    ArrayList<Ball> blah = new ArrayList<Ball>();
    Ball ballOne = new Ball(50,50,50);

JButton button = new JButton("Push");
  
   // Ball mine;
    public BallPanel(){
        setFocusable(true);




      
button.addActionListener(new ActionListener() {

  @Override
public void actionPerformed(ActionEvent e) {

blah.add(new Ball((int)(Math.random()*400),(int)(Math.random()*400),(int)(Math.random()*50)));
  
}
  
});
      
  this.add(button);
      
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

                System.out.println(e.getKeyCode());
                int k = e.getKeyCode();
                if(k == 39)
                {
                    ballOne.moveRight();
                }
                if(k == 37)
                {
                ballOne.moveLeft();
                }
                if(k == 40)
                {
                  ballOne.moveUp();
                }
                if(k == 38)
                {
                  ballOne.moveDown();
                }

            
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        setBackground(Color.black);
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
      //System.out.println(ballOne.getY());

      if(ballOne.getX() < 0)
      {
        ballOne.setX(500);
      }

      if (ballOne.getX() > 500)
      {
        ballOne.setX(0);
      }

      if(ballOne.getY() < 0)
      {
        ballOne.setY(0);
      }
      if(ballOne.getY() > 500)
      {
        ballOne.setY(500);
      }


        // for(int i = 0; i < ballArray.length; i++){

        //     ballArray[i].drawBall(g);
          
        //     ballArray[i].moveBall(this);

          

        // }

      for(int i= 0; i < blah.size(); i++)
        {
          blah.get(i).drawBall(g);
          blah.get(i).moveBall(this);
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
