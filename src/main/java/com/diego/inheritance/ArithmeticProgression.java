/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.inheritance;

/**
 *
 * @author diego-roman
 */
public class ArithmeticProgression extends Progression {
    protected long increment;
    
    public ArithmeticProgression(){
        super(0);
        this.increment = 1;
    }
    
    public ArithmeticProgression(long stepsize){
        super(0);
        this.increment = stepsize;
    }
    
    public ArithmeticProgression(long stepsize, long start){
        super(start);
        this.increment = stepsize;
    }
    
    @Override
    protected void advance(){
        current += increment;
    }
}
