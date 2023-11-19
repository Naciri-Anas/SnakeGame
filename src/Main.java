import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        int boarHeight = 600;
        int boardWidth = boarHeight;

JFrame frame = new JFrame("Snake");
frame.setVisible(true);
frame.setSize(boardWidth,boarHeight);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}