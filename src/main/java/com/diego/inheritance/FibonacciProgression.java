/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.inheritance;

/**
 *
 * @author diego-roman
 */
public class FibonacciProgression extends Progression{
    protected long previous;
    
    // Builds the progression 0,1,1,2,3
    public FibonacciProgression(){
        this(0,1);
    }
   
    // Builds a progression with two initial values
    public FibonacciProgression(long first, long second){
        super(first);
        this.previous = second - first;
    }
    
    @Override
    protected void advance(){
        long temporary = previous;
        
        previous = current;
        current += temporary;
    }
}
