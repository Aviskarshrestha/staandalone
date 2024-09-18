import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class HelpPopup{
    public static void main(String args[]){
        JFrame frame=new JFrame("The app");
        frame.setLayout(new FlowLayout());
        JButton button=new JButton("Click me");
        Label label=new Label("hey this is me");

        JMenuBar menubars=new JMenuBar();

        JMenu menu=new JMenu("My menu");
        JMenu menu2=new JMenu("Newmenu");
        JMenuItem item=new JMenuItem("Item1");
        JMenuItem item2=new JMenuItem("Item2");
        JMenuItem item3=new JMenuItem("Item3");
        menu.add(item);
        menu.add(item2);
        menu.add(item3);
        menubars.add(menu);
        menubars.add(menu2);


        frame.add(menubars);

        frame.add(button);
        frame.add(label);
        frame.setSize(400,400);
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Its clicked");
                String x=JOptionPane.showInputDialog("Ebter name");
                JOptionPane.showMessageDialog(frame,"hey How are ay?? "+x);
            }


        });


        frame.setVisible(true);
    }
}