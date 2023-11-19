
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class SnakeGame extends JPanel implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();

    }

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
    //snake
    Title snakeHead;
    //food
    Title food;
    Random random;

    //game Logic
    Timer gameLoop;





    SnakeGame(int boardWidth , int boardHeight){
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        setPreferredSize(new Dimension(this.boardWidth,this.boardHeight));
        setBackground(Color.black);

        snakeHead = new Title(5, 5);

        food = new Title(10,10);

        random  = new Random();
        PlaceFood();

        gameLoop = new Timer(100,this);
        gameLoop.start();



    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }
    public void draw (Graphics g){
        //grid
        for (int i = 0;i<boardWidth/titlesize; i++) {
            g.drawLine(i*titlesize , 0,i*titlesize,boardHeight);
            g.drawLine(0,i*titlesize, boardWidth, i*titlesize);

        }

        //food
        g.setColor(Color.red);
        g.fillRect(food.x * titlesize , food.y * titlesize , titlesize ,titlesize);
        //snake
        g.setColor(Color.green);
        g.fillRect(snakeHead.x * titlesize , snakeHead.y * titlesize, titlesize , titlesize);
    }

    public void PlaceFood(){
        food.x = random.nextInt(boardWidth/titlesize); //600/25 = 24
        food.y = random.nextInt(boardHeight/titlesize);

    }
}
