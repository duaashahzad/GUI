import javax.swing.*;

public class GUI{

    /**
     * GUI that takes in the input and calculates the score
     * until the user exits
     */
    public GUI(){
        String inputX, inputY, score;
        int again;
        double x, y;
        do{
            inputX = JOptionPane.showInputDialog("Enter a X coordinate: ");
            inputY = JOptionPane.showInputDialog("Enter a Y coordinate: ");
            x = Double.parseDouble(inputX);
            y = Double.parseDouble(inputY);
            score = "SCORE: " + (int)(x+y); //Darts.score(x, y);
            JOptionPane.showMessageDialog(null, score);
            again = JOptionPane.showConfirmDialog(null, "Do You Want To Restart?");
        }
        while(again == JOptionPane.YES_OPTION);
    }

    /**
     * Driver Class
     * @param args
     */
    public static void main(String[] args){
        GUI panel = new GUI();
    }
}