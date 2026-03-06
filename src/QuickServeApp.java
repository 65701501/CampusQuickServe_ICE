
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
  
JOptionPane.showMessageDialog(null, """
                                    \tThank you for ordering on our App!
                                    \tPlease presss OK to receive your Reciept""");
//Another thing added to make it feel like a real app

        
        //Get inputs for calculations here -----> send to custom class, calulate there ------> Send back for display
         // Use final double in custom class for VAT (0.15)    
         
         //Does this CURRENT class count as a "At least ONE custom class" ???
         
         
         
//---------------------------------------- Calculations -----------------------------------------

final double vat = 0.15d; //constant value cause vat will never change

   double subTotal = quantity * pricePI ; //Total price of goods before anychanges

   double vatApplied = subTotal * vat;//Total  of VAT that will be applied to total
      
   double totalFinal = subTotal + vatApplied;//Final Total that will be paid by the customer
   
   //--------------------------------- End of Calculations -----------------------------------------
         







        
        
        
        
        
        
        
        
        
    }
    
}
