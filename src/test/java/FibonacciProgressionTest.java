/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.diego.inheritance.FibonacciProgression;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *  
 * @author diego-rom-n
 */
public class FibonacciProgressionTest {
    @Test
    @DisplayName("The default progression")
    void defaultProgressionGeneratesFibonacci(){
        FibonacciProgression progression = new FibonacciProgression();
        
        assertEquals(0L, progression.nextValue());
        assertEquals(1L, progression.nextValue());
        assertEquals(1L, progression.nextValue());
        assertEquals(2L, progression.nextValue());
        assertEquals(3L, progression.nextValue());
        assertEquals(5L, progression.nextValue());
    }
    
    @Test
    @DisplayName("The progression accepts two initial values")
    void progressionUsesGivenStartingValues(){
        FibonacciProgression progression = new FibonacciProgression(4,6);
        
        assertEquals(4L, progression.nextValue());
        assertEquals(6L, progression.nextValue());
        assertEquals(10L, progression.nextValue());
        assertEquals(16L, progression.nextValue());
        assertEquals(26L, progression.nextValue());
    }
}
