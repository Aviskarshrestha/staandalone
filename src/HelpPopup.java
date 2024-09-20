import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class HelpPopup{

    //[0,1,2,3,4,5,6,7,8]
    public static String logic(String[] arr){
        //row
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        for(int i :new int[]{0,3,6}){
            if(arr[i]!=null && Objects.equals(arr[i], arr[i + 1]) && Objects.equals(arr[i], arr[i + 2])){
                System.out.println("I am here1");
                return arr[i];
            }
        }
        //column
        for(int i :new int[]{0,1,2}){
            if(arr[i]!=null && Objects.equals(arr[i], arr[i + 3]) && Objects.equals(arr[i], arr[i + 6])){
                System.out.println("I am here2");
                return arr[i];
            }
        }
        //diagonal
        if(arr[4]!=null && Objects.equals(arr[4], arr[0]) && Objects.equals(arr[4], arr[8])){
            System.out.println("I am here3");
            return arr[4];
        }
        if(arr[4]!=null && Objects.equals(arr[4], arr[2]) && Objects.equals(arr[4], arr[6])){
            System.out.println("I am here4");
            return arr[4];

        }
        System.out.println("The logic winner is");
        return "";
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
        //array representation of the game
        String[] rep=new String[9];

        JLabel label =new JLabel("This is a label");

        ImageIcon cross=new ImageIcon("C:/Users/Avishkar Shrestha/Downloads/cross.jpeg");
        ImageIcon zero=new ImageIcon("C:/Users/Avishkar Shrestha/Downloads/zero.jpeg");
        final boolean[] turn = {false};
        for(int i=0;i<List.length;i++){

            int finalI = i;
            final String[] winner = new String[1];
            List[i].addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){

                    if(turn[0]){
                        List[finalI].setIcon(cross);
                        rep[finalI]="X";

                    }
                    else{
                        List[finalI].setIcon(zero);
                        rep[finalI]="0";
                    }
                    turn[0] =!turn[0];
                    winner[0] =HelpPopup.logic(rep);
                    if(winner[0] !=""){

                        JOptionPane.showMessageDialog(frame,"The winner is"+winner[0]);
                    }
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