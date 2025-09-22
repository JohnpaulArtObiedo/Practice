import javax.swing.JOptionPane;
import java.util.Scanner;

class Switch{
   public static void main(String[] arg){
      String fn = JOptionPane.showInputDialog(null, "Input the number: ");
      
      int userInput = Integer.parseInt(fn);
      
      switch(userInput){
         case 1:
            JOptionPane.showMessageDialog(null, "Monday!");
            break;
         case 2:
            JOptionPane.showMessageDialog(null, "Tuesday");
            break;
         default:
            JOptionPane.showMessageDialog(null, "????");
            break;
      }
   }
}