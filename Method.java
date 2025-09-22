import javax.swing.JOptionPane;
import java.util.Scanner;

class Method{
   public static void main(String[] args){
      String userInput = JOptionPane.showInputDialog(null, "Input the number: ", "Input", JOptionPane.INFORMATION_MESSAGE);
      
      int convert = Integer.parseInt(userInput);
      
   }
}