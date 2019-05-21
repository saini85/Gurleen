/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * modified by  Gurleen Saini studentID 991542513
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()*13+1));         
            //c.setValue(insert call to random number generator here)
            c.setSuit(Card.SUITS[(int)(Math.random()*3+0)]);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
             magicHand[i]=c;
        }
        System.out.println("Enter card and suit");
        int a=in.nextInt();
        String b=in.nextLine();
        for(int i=0;i<magicHand.length;i++){
            if(magicHand[i].getValue()== a && magicHand[i].getSuit() == b)
                System.out.println("You are lucky this time");
            else
                System.out.println("Sorry , try again");
        }
       
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        Cars luckyCard=new Cards();
        luckyCard.setValue=7;
        
    }
    
}
