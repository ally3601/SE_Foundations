import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alast on 17/11/2018.
 * This GUI will allow the user to sort the list by different attributes.
 */
public class ThirdGUI extends JFrame implements ActionListener {

    JButton searchList, close, sortListByCompNum, sortListByName;

    public ThirdGUI() {

    /* Set up title */
        setTitle("List of Competitors");


        setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);

        setLocation(300, 300);


        pack();

        createNorthPanel();
        createSouthernPanel();

        JTextArea displayCompetitorList = new JTextArea(15, 20);
        Font f = new Font
                (Font.MONOSPACED, Font.PLAIN, 14);
        displayCompetitorList.setFont(f);
        displayCompetitorList.setEditable(false);
        //JScrollPane scrollList;
        //scrollList = new JScrollPane(displayCompetitorList);
        //this.add(scrollList,BorderLayout.CENTER);

        this.add(displayCompetitorList, BorderLayout.CENTER);

        setVisible(true);
    }

    public void createNorthPanel(){
        JPanel northernPanel = new JPanel();
        northernPanel.setLayout(new GridLayout(1,2));

        sortListByCompNum = new JButton("List by Competitor Number");
        sortListByCompNum.addActionListener(this);

        sortListByName = new JButton("List by Name");
        sortListByName.addActionListener(this);

        close = new JButton("Close");
        close.addActionListener(this);

        northernPanel.add(sortListByName);
        northernPanel.add(sortListByCompNum);
        northernPanel.add(close);

        this.add(northernPanel, BorderLayout.NORTH);


    }
    public void createSouthernPanel(){
        JPanel southernPanel = new JPanel();
        southernPanel.setLayout(new GridLayout(2,1));

        JPanel subSouthernPanel = new JPanel();
        subSouthernPanel.setLayout(new GridLayout(1,3));


        southernPanel.add(subSouthernPanel);


        this.add(southernPanel, BorderLayout.SOUTH);

    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == sortListByCompNum){
            JOptionPane.showMessageDialog(this,
                    "The list will now be sorted by the competitor number.");
        }
        else if (e.getSource() == sortListByName){
            JOptionPane.showMessageDialog(this,
                    "The list will now be organised by the competitors names.");
        }
        else if (e.getSource() == close){
            JOptionPane.showMessageDialog(this,
                    "Goodbye");
            System.exit(0);
        }
    }

    public static void main (String [] args){
        ThirdGUI tg = new ThirdGUI();
        tg.setSize(700,700);
    }
}
