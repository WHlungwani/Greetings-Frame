/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author GOD IS GOOD
 */
public class GreetingsGUI extends JFrame{
    //panels
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel nameAndsurnamePnl;
    private JPanel greetingsAreaPnl;
    private JPanel btnsPnl;
    private JPanel mainPnl;
    private JPanel headindPnl;
    
    //Labels
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    
    //textFields
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    
    //text areas
    private JTextArea greetingsTxtArea;
    
    //butons
    private JButton greetBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    
    
    public GreetingsGUI()
    {
       //Configure GUI
        setLayout(new BorderLayout());
        setTitle("Greetings UI");
        setSize(700, 750);
        setBackground(Color.YELLOW);
        
        //Creating panels
        namePnl = new JPanel(new FlowLayout());
        surnamePnl = new JPanel(new FlowLayout()); 
        
       nameAndsurnamePnl = new JPanel (new GridLayout(2,1));
       
       greetingsAreaPnl = new JPanel(new FlowLayout());
       greetingsAreaPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE,1),"Greetings"));
       
       btnsPnl = new JPanel(new FlowLayout());
       mainPnl = new JPanel (new FlowLayout());
       
       headindPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
       headindPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
       
       //creating Labels
       headingLbl = new JLabel("Greetings App");
       nameLbl = new JLabel ("Name : ");
       surnameLbl = new JLabel("Surname : ");
       
       //creating text fields
       nameTxtFld = new JTextField(20);
       surnameTxtFld = new JTextField(20);
       
       //creating text area
       greetingsTxtArea = new JTextArea(40,50);
       greetingsTxtArea.setEditable(false);
      greetingsTxtArea.setText("Hello [name] [surname]");
      
      //creating buttons
      greetBtn = new JButton("Greet");
      clearBtn = new JButton("Clear");
      exitBtn = new JButton("Exit");
      
      //add name label textfield to the panel
      
       namePnl.add(nameLbl);
       namePnl.add(nameTxtFld);
       
       //add surname label and textfield to surname panel
       surnamePnl.add(surnameLbl);
       surnamePnl.add(surnameTxtFld);
       
       //add the name and surname panel to the collective panel
       nameAndsurnamePnl.add(namePnl);
       nameAndsurnamePnl.add(surnamePnl);
       
       //add the greetings area to its panel
       greetingsAreaPnl.add(greetingsTxtArea);
       
       //add buttons to their panel
       
       btnsPnl.add(greetBtn);
       btnsPnl.add(clearBtn);
       btnsPnl.add(exitBtn);
       
       //add all the panels to the main panel
       mainPnl.add(nameAndsurnamePnl,BorderLayout.NORTH);
       mainPnl.add(greetingsAreaPnl,BorderLayout.CENTER);
       mainPnl.add(btnsPnl,BorderLayout.SOUTH);
       
       //add the main panel to the frame's panel
       add(headindPnl,BorderLayout.NORTH);
       add(mainPnl,BorderLayout.CENTER);
       
       //Make the Frame visible
        setVisible(true);
               
    }
    
}
