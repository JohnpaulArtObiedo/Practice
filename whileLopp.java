import javax.swing.JOptionPane;
import java.util.Scanner;

class whileLopp{
   public static void main(String[] arg){
      //console
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the number: ");
      int ui = in.nextInt();
      
      while(ui <= 10){
         System.out.print("Hello world!\n");
         ui++;
      }
      //GUIs
      String userInput = JOptionPane.showInputDialog(null, "Input the number: ", "Numbers only", JOptionPane.QUESTION_MESSAGE);
      int fn = Integer.parseInt(userInput);
      
      while(fn <= 10){
         JOptionPane.showMessageDialog(null, "Hello world!", "Hi~!", JOptionPane.INFORMATION_MESSAGE);
         fn++;
      }
   }
}