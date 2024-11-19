package main;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args){

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(true);
        window.setTitle("2D Adventure");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        //object as argument to a method of another object
        //JFrame's window object doesn't care about what JPanel's gamePanel object will bring, it just provides frame for gamePanel.
        //independent of each other. BEAUTY OF OBJECT ORIENTED PROGRAMMING.

        window.pack();

        gamePanel.startGameThread();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

    }
}
