import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *  This program demonstrates different types of
 *  dialog boxes.
 */

public class TestAverageDialog
{
   public static void main(String[] args)
   {
      int score1, score2, score3; // Three test scores
      String strInput;  // String input
      double average;   // Average test score
      int repeat;       // Confirm dialog button clicked
      
      DecimalFormat formatter = new DecimalFormat("#0.00");
      
         // Get the first test score.
         strInput = JOptionPane.showInputDialog(null, 
                                   "Enter score #1.", "Suicide Squad-Input 1", JOptionPane.INFORMATION_MESSAGE);
         score1 = Integer.parseInt(strInput);

         // Get the second test score.
         strInput = JOptionPane.showInputDialog(null, 
                                   "Enter score #2.", "Captain America-Input 2", JOptionPane.INFORMATION_MESSAGE
        		 );
         score2 = Integer.parseInt(strInput);

         // Get the third test score.
         strInput = JOptionPane.showInputDialog(null,
                                   "Enter score #3.", "The Purge", JOptionPane.INFORMATION_MESSAGE);
         score3 = Integer.parseInt(strInput);

         // Calculate and display the average test score.
         average = (score1 + score2 + score3) / 3.0;
         JOptionPane.showMessageDialog(null,
                         "The average is " + formatter.format(average));
         
      System.exit(0);
   }
}
