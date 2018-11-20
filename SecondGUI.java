import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alast on 17/11/2018.
 * It is hoped this GUI will return the full/short details of a competitor that the user asks for
 */
public class SecondGUI extends JFrame implements ActionListener
{

    JButton searchList,close;


    public SecondGUI(){

        //Set up title
        setTitle("List of Competitors");

        setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        setLocation(300,300);

        //createNorthPanel();
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

    private void createSouthernPanel(){

        JPanel southernPanel = new JPanel();
        southernPanel.setLayout(new GridLayout(1,3));



        JLabel getID = new JLabel("Enter Competitor Number");
        JTextField search = new JTextField(5);

        searchList = new JButton("Search");
        searchList.addActionListener(this);

        close = new JButton("Close");
        close.addActionListener(this);

        southernPanel.add(getID);
        southernPanel.add(search);
        southernPanel.add(searchList);
        southernPanel.add(close);

        JTextField result = new JTextField(25);
        result.setEditable(false);


        southernPanel.add(result);

        this.add(southernPanel, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == searchList){
            JOptionPane.showMessageDialog(this,
                    "You have chosen to see the full details for number: " );
        }
        else if (e.getSource() == close){
            JOptionPane.showMessageDialog(this,
                    "Goodbye");
            System.exit(0);
        }
    }

    public static void main(String [] args){
        SecondGUI sg = new SecondGUI();
        sg.setSize(700,700);

    }
}
