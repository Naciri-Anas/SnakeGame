
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class SnakeGame extends JPanel{
    private class Title{
        int x;
        int y;

        Title(int x , int y){
            this.x = x;
            this.y = y;

        }
    }
    int boardWidth;
    int boardHeight;

    int titlesize = 25;

    Title snakeHead;


    SnakeGame(int boardWidth , int boardHeight){
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        setPreferredSize(new Dimension(this.boardWidth,this.boardHeight));
        setBackground(Color.black);

        snakeHead = new Title(5, 5);



    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }
    public void draw (Graphics g){
        g.setColor(Color.green);
        g.fillRect(snakeHead.x , snakeHead.y, titlesize , titlesize);
    }
}
