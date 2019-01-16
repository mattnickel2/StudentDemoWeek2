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
public class Exercise2 {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        int valueCounter = 1;

        
        for (int j = 1; j <= 4; j++)
        {
        
        System.out.println(" ");
        
             
        for (int i = 1; i < j+valueCounter; i++) {
        
            System.out.print(i);
        
        }
        
        valueCounter++;
        
        
    }
    }
    
    
}