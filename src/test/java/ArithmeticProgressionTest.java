/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import com.diego.inheritance.ArithmeticProgression;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author diego-rom-n
 */
public class ArithmeticProgressionTest {
    @Test
    void progressionUsesIncrementAndStart(){
        
        // Arrange
        ArithmeticProgression progression = new ArithmeticProgression(5,2);
        
        // Assert
        assertEquals(2L, progression.nextValue());
        assertEquals(7L, progression.nextValue());
        assertEquals(12L, progression.nextValue());
        assertEquals(17L, progression.nextValue());                        
    }
}
