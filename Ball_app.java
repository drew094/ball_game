/*
    Drew Heaton
    Software Engineering 1
    April 6, 2015
    Class that defines frame and main controller of the game
*/

package ball_app;

import java.awt.Dimension;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Ball_app extends JFrame {
    
    // main menu object declared
    MainMenu main = new MainMenu(this);

    public Ball_app(String title) {
        
        // set basic attributes of the frame
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle(title);
        setVisible(true);
        add(main);
        setResizable(false);
        setSize(new Dimension(750, 750));
        setLocationRelativeTo(null);
    }
    
    // main method of the program
    public static void main(String[] args) {
        Ball_app game = new Ball_app("Ball Game");
    }
    
    // method to start the game
    public static void playGame(Ball_app game) {
        game.remove(game.main);
//        game.add();
        game.repaint();
    }
    
    // method to return from game screen to menu
    public static void toMenu(Ball_app game) {
//        game.remove();
        game.add(game.main);
        game.repaint();
    }
}
