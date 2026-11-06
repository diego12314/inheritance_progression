/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diego-rom-n
 */

import com.diego.inheritance.GeometricProgression;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GeometricProgressionTest {
    @Test
    @DisplayName("The arithmetic progression uses by default base 2")
    void defaultGeometricProgressionUsesBaseTwo(){
        GeometricProgression progression = new GeometricProgression();
        
        assertEquals(1L, progression.nextValue());
        assertEquals(2L, progression.nextValue());
        assertEquals(4L, progression.nextValue());
        assertEquals(8L, progression.nextValue());   
    }
    
    @Test
    @DisplayName("The progression receives a given base")
    void progressionUsesGivenBase(){
        GeometricProgression progression = new GeometricProgression(3);
        
        assertEquals(1L, progression.nextValue());
        assertEquals(3L, progression.nextValue());
        assertEquals(9L, progression.nextValue());
        assertEquals(27L, progression.nextValue());
    }
    
    @Test
    @DisplayName("The progression receives a given base and initial value")
    void progressionUsesBaseAndStart(){
        GeometricProgression progression = new GeometricProgression(3,2);
        
        assertEquals(2L, progression.nextValue());
        assertEquals(6L, progression.nextValue());
        assertEquals(18L, progression.nextValue());
        assertEquals(54L, progression.nextValue());
    }
}
