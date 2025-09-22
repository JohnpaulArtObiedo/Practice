import java.util.Scanner; //For Scanner
import javax.swing.JOptionPane; //For ShowWindowBox or GUIs
class Main{
   public static void odd(){
      System.out.println("The number is Odd");
   }
   
   public static void even(){
      System.out.println("The number is Even");
   }

   public static void main(String[] args){
      Scanner world = new Scanner(System.in);
      Main obj = new Main();
      
      int hello=0;
      
      System.out.println("Odd and Even!");
      
      try{
         System.out.println("Input the number to determine if Odd or Even number\nInput the number: ");
         hello = world.nextInt();
      
         if(hello % 2 != 0){
            odd();
         } else {
            even();
         }
         
      } catch (Exception e){
         System.out.println("Numbers only!");
      }
      
   }
}