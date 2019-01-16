import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * January 11th, 2018
 * @author Matthew
 */
public class LargestNum {
    
    
    
    public static void main(String[] args) {
        
    //Create the array of 10 numbers  
    int[] numbers = new int[10];
    
    //Initalize the 'LargestNum' variable
    int largestNum = 0;
    
    //Start of for loop
    for (int i = 0; i <= numbers.length-1; i++) {
    
    Random rand = new Random(); 
    numbers[i] = rand.nextInt(1000);   
    
    
    System.out.print(numbers[i]+" ");

    
    if (numbers[i] > largestNum)
    {
        largestNum = numbers[i];
    }

    
    }
    
    System.out.println();
    System.out.println("Largest Number = "+largestNum);
        
    }
    
    
    
}
