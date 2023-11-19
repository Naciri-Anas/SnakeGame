
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

    SnakeGame(int boardWidth , int boardHeight){
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        setPreferredSize(new Dimension(this.boardWidth,this.boardHeight));
        setBackground(Color.black);


    }
}
