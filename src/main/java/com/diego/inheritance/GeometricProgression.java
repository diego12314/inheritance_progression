/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diego.inheritance;

/**
 *
 * @author diego-roman
 */
public class GeometricProgression extends Progression{
    protected long base;
    
    // Builds the progression 1, 2, 4, 8, ...
    public GeometricProgression() {
        this(2, 1);
    }

    // Builds the progression 1, b, b², b³, ...
    public GeometricProgression(long base) {
        this(base, 1);
    }

    // Builds a progression with an arbitrary base and initial value
    public GeometricProgression(
            long base,
            long start) {

        super(start);
        this.base = base;
    }
    
    @Override
    protected void advance(){
        current *= base;
    }
}
