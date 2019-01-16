/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareDesign.newpackage;

/**
 * January 16th, 2018
 * @author Matthew
 */
public class Cards {
    
    private String suit;
    private int value; //1-13
    
    public String getSuit {
        return suit;
    }
    
    public void setSuit(String suit) {
        if (suit.equals("Hearts") || suit.equals("Diamonds") || suit.equals("Clubs") || suit.equals("Spades"))
        this.suit = suit;
    }
    
    public void setValue (int value)
    {
        if (value < 1) || (value > 13)) 
        {
            
        }
    
    
    }
    
}


