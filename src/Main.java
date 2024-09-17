import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{
    public static void main(String args[]){
        JFrame frame = new JFrame("My first app");
        frame.setSize(400,400);
        //setting the layout ?? No idea
        frame.setLayout(new BorderLayout());
        //
        frame.add(new JButton("North"),BorderLayout.NORTH);
        frame.add(new JButton("South"),BorderLayout.SOUTH);
        frame.add(new JButton("East"),BorderLayout.EAST);
        frame.add(new JButton("WEST"),BorderLayout.WEST);
        frame.add(new JButton("cENTER"),BorderLayout.CENTER);
//        creating components
        JButton button=new JButton("Click Me man");
        JLabel label=new JLabel("hello");
//      adding events
        button.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){

                label.setText("Button click");
            }

        });
        //adding components
        frame.add(button);
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);



    }
}