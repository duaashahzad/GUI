//********************************************************************
// PushCounterPanel.java Java Foundations
//
// Demonstrates a graphical user interface and an event listener.
//********************************************************************
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PushCounterPanel extends JPanel
{
    private int count;
    private JButton push;
    private JLabel label;
    PushCounterPanel p;
    //-----------------------------------------------------------------
// Constructor: Sets up the GUI.
//-----------------------------------------------------------------
    public PushCounterPanel()
    {
        p = new PushCounterPanel();
        count = 0;
        push = new JButton("Push Me!");
        push.addActionListener(new ButtonListener());
p.add(push);
//p.add(label);

        //add(label);
        setBackground(Color.cyan);
        setPreferredSize(new Dimension(300, 40));
    }
    //*****************************************************************
// Represents a listener for button push (action) events.
//*****************************************************************
    private class ButtonListener implements ActionListener
    {
        //--------------------------------------------------------------
// Updates the counter and label when the button is pushed.
//--------------------------------------------------------------
        public void actionPerformed(ActionEvent event)
        {
            count++;
            label.setText("Pushes: " + count);
        }
    }
}