/*
    Drew Heaton
    Software Engineering 1
    April 6, 2015
    Class that defines the main menu layout and style. Contains action listeners
        for button click behavior
*/

package ball_app;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;

public class MainMenu extends JPanel {
    
    // menu items declared
    protected ImageIcon cat = new ImageIcon
            (Ball_app.class.getResource("/cat.jpg"));
    MenuButton play = new MenuButton("Play");
    MenuButton options = new MenuButton("Options");
    MenuButton exit = new MenuButton("Exit");
    JLabel buttons = new JLabel();
    
    public MainMenu(Ball_app parent) {

        // set layout to get buttons positioned
        GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(play)
                    .addComponent(options)
                    .addComponent(exit))
                .addContainerGap(317, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(play)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(options)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        
        // calls method from Ball_app to close the main menu and start the game
        play.addActionListener((ActionEvent e) -> {
            Ball_app.playGame(parent);
        });
        
        // actionlistener for options button (does nothing atm)
        options.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
        // actionlistener for exit button
        exit.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
    }
    
    // method to paint the background image onto the panel
    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(cat.getImage(), 0, 0, null);
    }
}
