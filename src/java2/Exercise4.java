package java2;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Date: Jan 8th, 2018
 * @author Matthew
 */
public class Exercise4 {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
      
        int value = 4;

        
        for (int i = value; i > 0; i--) 
        {  
           
            System.out.println(" ");
            
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= value - i + 1; k++)
            {
            System.out.print(k); 
            }
            
            for (int l = value - i; l > 0; l--)
            {
            System.out.print(l); 
            }
            
            
        }
        

    }
    
    
    
}