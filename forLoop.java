import javax.swing.JOptionPane;
import java.util.Scanner;

class forLoop{
   public static void main(String[] arg){
      //console
      Scanner in = new Scanner(System.in);
      System.out.println("Input the number: ");
      int fn = in.nextInt();
      
      for(int sn = fn; sn < 10; sn++){
         System.out.print("Hello world!\n");
      }
      //GUIs
      String userInput = JOptionPane.showInputDialog(null, "Input the Number: ");
      int num = Integer.parseInt(userInput);
      
      for(int sn = num; num <= 10; num++){
         JOptionPane.showMessageDialog(null, "Hello World!", "WARNING", JOptionPane.WARNING_MESSAGE);
      }
   }
}