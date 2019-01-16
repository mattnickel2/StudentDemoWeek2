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
public class Exercise3 {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
      
        int value = 4;
        
        int valueCounter = 4;

        
        for (int i = value; i >= 0; i--) 
        {  
           
            
            System.out.println(" ");
            
            
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            
            
            for (int j = 1; j <= valueCounter - i-1; j++)
            {
                System.out.print(j); 
            }
            
            //System.out.println(" ");
            

            valueCounter++;
            
        }
        

    }
    
    
    
}
    
