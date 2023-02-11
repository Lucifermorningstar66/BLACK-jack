import java.util.Scanner;

import java.util.Random;

import javax.swing.DefaultBoundedRangeModel;
public class BLACKjack {

    public static Scanner scan = new Scanner(System.in);

 public static void main(String[] args) {

    System.out.println("\n• Welcome to Java Casino...press STh to continue...");
                      scan.nextLine();
    System.out.println("• Do you have a knack for Black Jack...?");
    System.out.println("• We shall see...");
    System.out.println("\n• READY??? press anything to start...");
                       scan.nextLine();
 
                       int card1 = drawRandCard();
                       int card2 = drawRandCard();
                       System.out.println("\n You get a \n" + cardString(card1) + "\n and a \n" + cardString(card2));

                       int total = Math.min(card1 , 10) + Math.min(card2 , 10);
                       System.out.println("Your Total is " + total);

                       int dealerCard1 = drawRandCard();
                       int dealerCard2 = drawRandCard();
                       System.out.println("\n The Dealer Shows \n" + cardString(dealerCard1) + "\n and \n" + cardString(dealerCard2) + "\n and \n" + faceDown());

                       int dealerTotal = Math.min(dealerCard1 , 10) + Math.min(dealerCard2 , 10);
                       System.out.println("THE DEALER's TOTAL IS HIDDEN FOR NOW");

                       while(true)
                       {
                        String option = hitOrstay();

                        if(option.equals("stay"))
                        {
                            break;
                        }

                        int newCard = drawRandCard();
                        total += Math.min(newCard , 10);
                        System.out.println("\n You get a \n" + cardString(newCard));
                        System.out.println("your total is " + total);

                        if(total > 21)
                        {
                            System.out.println("BUST!!...Playe Loses...");
                            System.exit(404);
                        }
                       }

                       System.out.println("\nDealer's turn...");
                       System.out.println("\nThe dealer's card are \n" + cardString(dealerCard1) + "\n and \n" + cardString(dealerCard2));
                       

                       while(dealerTotal < 17)
                       {
                        int newCard = drawRandCard();

                        dealerTotal += Math.min(newCard , 10);
                        System.out.println("\nDealer gets a \n" + cardString(newCard));
                        System.out.println("Dealer's total is " + dealerTotal);
                       }

                       if(dealerTotal > 21)
                       {
                        System.out.println("BUST!!!...Dealer Loses...");
                        System.exit(404);
                       }

                       if(total > dealerTotal)
                       {
                        System.out.println("Player WINS...!!");
                       }
                       else
                       {
                            System.out.println("Dealer WINS... :|");
                       }
                    }



 public static int drawRandCard()
 {
    Random rand = new Random();

                   int randomNum = rand.nextInt(13);
                   randomNum += 1;
                   return randomNum;
 }



 public static String cardString(int cardNum)
 {
    switch(cardNum)
    {
        case 1: return 
        "   _____ \n"+
        "  |A _  |\n"+ 
        "  | ( ) |\n"+
        "  |(_'_)|\n"+
        "  |  |  |\n"+
        "  |____V|\n";

case 2: return  
         "   _____\n"+              
        "  |2    |\n"+ 
        "  |  o  |\n"+
        "  |     |\n"+
        "  |  o  |\n"+
        "  |____Z|\n";
    
case 3: return 
        "   _____\n" +
        "  |3    |\n"+
        "  | o o |\n"+
        "  |     |\n"+
        "  |  o  |\n"+
        "  |____E|\n";

case 4: return 
        "   _____\n" +
        "  |4    |\n"+
        "  | o o |\n"+
        "  |     |\n"+
        "  | o o |\n"+
        "  |____h|\n";

case 5: return   
        "   _____ \n" +
        "  |5    |\n" +
        "  | o o |\n" +
        "  |  o  |\n" +
        "  | o o |\n" +
        "  |____S|\n";

case 6: return   
        "   _____ \n" +
        "  |6    |\n" +
        "  | o o |\n" +
        "  | o o |\n" +
        "  | o o |\n" +
        "  |____6|\n";

case 7: return    
        "   _____ \n" +
        "  |7    |\n" +
        "  | o o |\n" +
        "  |o o o|\n" +
        "  | o o |\n" +
        "  |____7|\n";

case 8: return    
        "   _____ \n" +
        "  |8    |\n" +
        "  |o o o|\n" +
        "  | o o |\n" +
        "  |o o o|\n" +
        "  |____8|\n";

case 9: return    
        "   _____ \n" +
        "  |9    |\n" +
        "  |o o o|\n" +
        "  |o o o|\n" +
        "  |o o o|\n" +
        "  |____9|\n";

case 10: return  
        "   _____ \n" +
        "  |10  o|\n" +
        "  |o o o|\n" +
        "  |o o o|\n" +
        "  |o o o|\n" +
        "  |___10|\n";

case 11: return   
        "   _____\n" +
        "  |J  ww|\n"+ 
        "  | o {)|\n"+ 
        "  |o o% |\n"+ 
        "  | | % |\n"+ 
        "  |__%%[|\n";

case 12: return   
        "   _____\n" +
        "  |Q  ww|\n"+ 
        "  | o {(|\n"+ 
        "  |o o%%|\n"+ 
        "  | |%%%|\n"+ 
        "  |_%%%O|\n";

case 13: return    
        "   _____\n" +
        "  |K  WW|\n"+ 
        "  | o {)|\n"+ 
        "  |o o%%|\n"+ 
        "  | |%%%|\n"+ 
        "  |_%%%>|\n";

default: return "InVaLiD";
    }
 }



 public static String faceDown()
    {
        return
        "   _____ \n" +
        "  |     |\n" +
        "  |  J  |\n" +
        "  | JJJ |\n" +
        "  |  J  |\n" +
        "  |____ |\n";
    }
 


    public static String hitOrstay()
    {
        System.out.println("Would you like HIT or STAY???");
          String response = scan.nextLine();

          while(!(response.equalsIgnoreCase("hit") || response.equalsIgnoreCase("stay")))
          {
            System.out.println("Please type hit or stay...");
            response = scan.nextLine();
          }
      return response;
}
}