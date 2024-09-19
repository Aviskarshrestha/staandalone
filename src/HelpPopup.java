import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelpPopup{
    public void Logic(){

    }

    public static void main(String args[]){
        JFrame frame=new JFrame("New Window");
        frame.setSize(400,400);
        frame.setLayout(new GridLayout(4,3));

        JMenu menu=new JMenu("Settings");
        JMenuItem item=new JMenuItem("item1");
        JMenuBar bar=new JMenuBar();
        menu.add(item);
        bar.add(menu);

        JButton button=new JButton("ClickMe");
        JButton button1=new JButton("ClickMe");
        JButton button2=new JButton("ClickMe");
        JButton button3=new JButton("ClickMe");
        JButton button4=new JButton("ClickMe");
        JButton button5=new JButton("ClickMe");
        JButton button6=new JButton("ClickMe");
        JButton button7=new JButton("ClickMe");
        JButton button8=new JButton("ClickMe");
        JButton[] List =new JButton[]{button,button1,button2,button3,button4,button5,button6,button7,button8};
        JLabel label =new JLabel("This is a label");

        ImageIcon cross=new ImageIcon("C:/Users/Avishkar Shrestha/Downloads/cross.jpeg");
        ImageIcon zero=new ImageIcon("C:/Users/Avishkar Shrestha/Downloads/zero.jpeg");
        final boolean[] turn = {false};
        for(int i=0;i<List.length;i++){

            int finalI = i;
            List[i].addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){

                    if(turn[0]){
                        List[finalI].setIcon(cross);

                    }
                    else{
                        List[finalI].setIcon(zero);
                    }
                    turn[0] =!turn[0];
                }
            });
        }
        for(int i=0;i<List.length;i++){
            frame.add(List[i]);
        }
        frame.add(bar);
        frame.add(label);

        frame.setVisible(true);

    }
}