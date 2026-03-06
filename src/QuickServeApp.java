
import javax.swing.JOptionPane;


public class QuickServeApp {

    public static void main(String[] args) {

        
        JOptionPane.showMessageDialog(null,"       Welcome to Campus QuickServe", "Welcome",  JOptionPane.PLAIN_MESSAGE);

        
//-------------------------------- JOptionPane Inputs -------------------------------------------

        String customersName = JOptionPane.showInputDialog(null, "Please enter your name:", "First Question", JOptionPane.QUESTION_MESSAGE);
        //For the imput of customers name
        
        String customersSchoolNum = JOptionPane.showInputDialog(null, "Enter your School Number:", "Second Question", JOptionPane.QUESTION_MESSAGE);
        //For input of customers School Number
        int schoolNum = Integer.parseInt(customersSchoolNum); // Casting School Number String into a integer
        
        JOptionPane.showMessageDialog(null, """
                                            Thank you for logging into our Campus QuickServe App!
                                            Please press OK to Continue""","LOGGED IN", JOptionPane.PLAIN_MESSAGE);
        //Just a small thank you after entering info to make it seem like a more realistic application
        
        String customersItemOrdered = JOptionPane.showInputDialog(null, "What Item did you order?", "Third Question", JOptionPane.QUESTION_MESSAGE);
        //Input for Item Ordered
        
        String itemQuantity = JOptionPane.showInputDialog(null, "How many of this Item did you order?", "Fourth Question", JOptionPane.QUESTION_MESSAGE);
        //Input for Quantity
        int quantity = Integer.parseInt(itemQuantity); // Casting the quantity string into a integer
        
        String pricePerItem = JOptionPane.showInputDialog(null, "What was the price of the item?", "Final Question", JOptionPane.QUESTION_MESSAGE);
        //Input for the Price per Item
        double pricePI = Double.parseDouble(pricePerItem); // Casting Price Per Item String into Integer
        
        
//----------------------------------------- End of Inputs -----------------------------------------        
        
        
        
        
        
        
        
        
        
        
    }
    
}
