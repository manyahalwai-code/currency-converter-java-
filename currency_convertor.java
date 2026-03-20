/** Currency Converter: Converts INR to multiple currencies (USD, EUR, CAD, JPY, QAR)*/

import java.util.*;
public class currency_convertor
{
    public static void main (String args[])
    {
        int choice; //defining variables
        double inr,currency;
        char cont = 'Y';
        Scanner sc=new Scanner(System.in);
        
        do
        {
          System.out.println("# Currency Convertor"); 
          
          System.out.println("\n1.US Dollar \n2.Euro \n3.Canadian Dollar \n4.Japanese Yen \n5.Qatari Riyal"); //menu system
          System.out.println();
          
          System.out.println("Select the currency you want to convert INR to:");
          choice=sc.nextInt();
          
          System.out.println("Enter amount in INR");
          inr=sc.nextDouble();
          
          if(inr <= 0)
          { 
              System.out.println("Please enter a positive amount.");
            continue;
          }
          
          switch(choice) //switch case
          {
              case 1:currency = 0.01083*inr;
              System.out.printf("INR %.2f = USD %.2f%n", inr, currency);
              break;
              
              case 2:currency = 0.0093*inr;
              System.out.printf("INR %.2f = EUR %.2f%n", inr, currency);
              break;
              
              case 3:currency = 0.015*inr;
              System.out.printf("INR %.2f = CAD %.2f%n", inr, currency);
              break;
              
              case 4:currency = 1.72*inr;
              System.out.printf("INR %.2f = JPY %.2f%n", inr, currency);
              break;
              
              case 5:currency = 0.04*inr;
              System.out.printf("INR %.2f = QAR %.2f%n", inr, currency);
              break;
              
              default:System.out.println("Please choose a valid option");
          }
          System.out.println(); 
          System.out.println("Would you like to continue ?");
          System.out.println("If yes, press Y else N.");
          
          cont = sc.next().toUpperCase().charAt(0);  
        }
        while(cont=='Y');
        System.out.println("Conversion complete. See you next time!");
    }
}
