import javax.swing.JOptionPane;
import java.util.Scanner;

class doWhileLoop{
   public static void main(String[] arg){
      //console
      Scanner in = new Scanner(System.in);
      
      System.out.println("Enter the number: ");
      int ui = in.nextInt();
      
      do {
         System.out.println("Hello world!");
         ui--;
      } while(ui > 10);
      
      //GUIs
      //Questionable
      /*String userInput = JOptionPane.showInputDialog(null, "Input the number: ", "@#%!*#^", JOptionPane.QUESTION_MESSAGE);
      int fn = Integer.parseInt(userInput);
      
      do {
         JOptionPane.showMessageDialog(null, "Hello world!");
         ui--;
      } while(fn >= 10);*/
   }
}