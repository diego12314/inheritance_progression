/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.inheritance;

/**
 *
 * @author diego-roman
 */
public class Progression {
    protected long current;
    
    // Starts a progression that starts from 0
    public Progression(){
        this.current = 0;
    }
    
    // Starts a progression that starts with an initial value
        public Progression(long start){
            this.current = start;
    }
    
    // Returns the initial value y advances the progression
    public long nextValue(){
        long answer = current;
        advance();
        return answer;
    }
    
    protected void advance(){
        current++;
    }
    
    // Prints the next n values
    public void printProgression(int n){
        System.out.print(nextValue());
        
        for (int i = 0; i < n; i++){
            System.out.print(" " + nextValue());
        }
        System.out.println();
    }
}
