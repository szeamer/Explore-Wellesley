import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Write a description of class NavBar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NavBar extends JPanel
{
    JButton home;
    JButton map;
    JButton enter;
    JButton about;
    WellesleyAdventure w;
    
    public NavBar(){
        initNavBar();
    }
    
    public void initNavBar(){
        //create buttons
        home = new NavButton("Home");
        map = new NavButton("Map");
        enter = new NavButton("Return");
        about = new NavButton("About");
        
        //add the buttons
        add(home);add(map);add(enter);add(about);
        
        //add action listeners
        //home.addActionListener(new NavListener());
        
        //set the layout
        setLayout(new GridLayout(4,1));
        setPreferredSize(new Dimension(500,250));
        setVisible(true);
        setBackground(new Color(19,63,132));
    }
    
    public JButton getHome(){
        return home;
    }
    
    public JButton getMap(){
        return map;
    }
    
    public JButton getEnter(){
        return enter;
    }
    
    public JButton getAbout(){
        return about;
    }
}
