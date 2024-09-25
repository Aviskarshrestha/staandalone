import javax.swing.*;
import java.io.FileWriter;

public class Player {
    String L;
    String name;
    Player(String letter){
        L=letter;
        this.authenticate();


    }
    public Boolean isLetter(String l){
        return l==this.L;
    }
    public void authenticate(){
        this.name=JOptionPane.showInputDialog(null,"Enter your name","Input Dialog",JOptionPane.QUESTION_MESSAGE);
        if(name!=null){
            this.uploadName(name);
        }
        else{
            System.out.println("Name not provided");
        }
    }
    private Boolean uploadName(String name){
        try{
            FileWriter writer=new FileWriter("C:\\Users\\Avishkar Shrestha\\IdeaProjects\\JavaStandalone\\src\\Names");
            writer.write(name);
            writer.flush();
            writer.close();
            return true;
        }catch(Exception e){
            System.out.println("Problem with Upload");
            e.printStackTrace();
            return false;
        }
    }

}
