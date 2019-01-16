package softwareDesign.newpackage;

import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Date: Jan 9th, 2018
 * @author Matthew
 */
public class ReverseWord {
    
    
    
    public static void main(String[] args)
    {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = sc.nextLine();
        
        char[] letters = new char[word.length()];
        
        for(int i=0; i < word.length(); i++)
        {
            letters[i] = word.charAt(i);
        }

        for(int i=letters.length-1; i>=0; i--)
        {
            System.out.print(letters[i]);
        }
        
        
    }
    
}
