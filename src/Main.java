import javax.swing.*;
import java.awt.*;
public class Main{
    public static void main (String[] args){
        JFrame myFrame = new JFrame();
        myFrame.setSize(500,500);
        BallPanel bPanel = new BallPanel();
        //DrawingPanel myPanel = new DrawingPanel();


        myFrame.add(bPanel);
        myFrame.setVisible(true);
    }
}
