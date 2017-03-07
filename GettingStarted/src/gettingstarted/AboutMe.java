/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gettingstarted;

import javax.swing.*;
import java.awt.*;

/**
 * File Name:	About Me Programmer:	Your name here q Date:	Current date here
 * Description:	This program demonstrates the use of graphics.
 *
 */
public class AboutMe extends JFrame {

    public AboutMe() {
        super("About Me");
       
        // setting the window size
        setSize(1000, 70);
       
        // I don't know what this does
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        // Opens the frame at the defined width and height.
        setVisible(true);
      
        // About me and some of my information
        JLabel infromation = new JLabel("My name is Louise " + " I go to the school called HHSS " + " I Don't have any favourite tv show at the moment " + " My favourite colour is Blue" + "and I like to play the game called osu!");
       
        // I don't know that this does
        FlowLayout flo = new FlowLayout();
       
        // I don't know that this does
        setLayout(flo);
       
        // adding the desicription and information about me
        add(infromation);
      
        // tells the program (true) to show the information 
        setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AboutMe hw = new AboutMe();
    }
}
