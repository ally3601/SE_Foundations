/**
 * Created by alast on 17/11/2018.
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * This GUI will allow the user to sort the list by different, predefined parameters
 */

public class Manager extends JFrame implements ActionListener{


    // create all the buttons
    JButton Amateur, Novice, Expert, Veteran,  searchList, close;

    public Manager(){

        //Set up title
        setTitle("List of Competitors");

        setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        setLocation(300,300);

        createNorthPanel();
        createSouthernPanel();

        pack();
        setVisible(true);

        JTextArea displayCompetitorList = new JTextArea(15,20);
        Font f = new Font
                (Font.MONOSPACED,Font.PLAIN, 14);
        displayCompetitorList.setFont(f);
        displayCompetitorList.setEditable(false);
        //JScrollPane scrollList;
        //scrollList = new JScrollPane(displayCompetitorList);
        //this.add(scrollList,BorderLayout.CENTER);
        this.add(displayCompetitorList ,BorderLayout.CENTER);

    }

    private void createNorthPanel(){

        //code for the North Panel
        JPanel northPanel = new JPanel();

        //sortListByCompNum = new JButton("List by Competitor Number");
        //sortListByCompNum.addActionListener(this);

        //sortListByName = new JButton("List by Name");
        //sortListByName.addActionListener(this);

        close = new JButton("Close");
        close.addActionListener(this);

        //northPanel.add(sortListByCompNum);
        //northPanel.add(sortListByName);
        northPanel.add(close);

        this.add(northPanel, BorderLayout.NORTH);

    }

    private void createSouthernPanel(){

        JPanel southernPanel = new JPanel();
        southernPanel.setLayout(new GridLayout(2,1));

        JPanel subSouthernPanel = new JPanel();
        subSouthernPanel.setLayout(new GridLayout(1,3));

        JLabel selectLevel = new JLabel("Select a level of competitor");

        Amateur = new JButton("Amateur");
        Amateur.addActionListener(this);

        Novice = new JButton("Novice");
        Novice.addActionListener(this);

        Expert = new JButton("Expert");
        Expert.addActionListener(this);

        Veteran = new JButton("Veteran");
        Veteran.addActionListener(this);

        subSouthernPanel.add(selectLevel);
        subSouthernPanel.add(Amateur);
        subSouthernPanel.add(Novice);
        subSouthernPanel.add(Expert);
        subSouthernPanel.add(Veteran);

        JTextField result = new JTextField(25);
        result.setEditable(false);


        southernPanel.add(subSouthernPanel);
        southernPanel.add(result);

        this.add(southernPanel, BorderLayout.SOUTH);
    }
    private JLabel createOneLabel (String s, Color c) {
        Font f = new Font(Font.SANS_SERIF, Font.BOLD, 18);
        JLabel label= new JLabel(s, JLabel.CENTER);
        label.setFont(f);
        label.setBackground(c);
        label.setOpaque(true);
        return label;
    }

    //
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == Amateur){
            JOptionPane.showMessageDialog(this, "You have selected level Amateur");
        }
        else if (e.getSource() == Novice) {
            JOptionPane.showMessageDialog(this, "You have selected level Novice");
        }
        else if (e.getSource() == close) {
                JOptionPane.showMessageDialog(this,
                        "Goodbye");
                System.exit(0);
            }
    }



    public static void main(String [] args)
    {
        Manager bf = new Manager();
        bf.setSize(300,320);
        //pack works out the best size of the frame for itself
        //based on what components there are



    }


}
