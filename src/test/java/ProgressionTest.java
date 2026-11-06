/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.diego.inheritance.Progression;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *
 * @author diego-rom-n
 */
public class ProgressionTest {
    @Test
    @DisplayName("The default progression starts at zero")
    void defaultProgressionStartsAtZero(){
        // Arrange
        Progression progression = new Progression();
        
        // Act
       long result = progression.nextValue();
        
        // Assert
        assertEquals(0L, result);
    }
    
     @Test
     @DisplayName("The default progression advances one unit")
     void progressionAdvancesByOne(){
         // Arrange
         Progression progression = new Progression();
         
         // Act and assert
         assertEquals(0L, progression.nextValue());
         assertEquals(1L, progression.nextValue());
         assertEquals(2L, progression.nextValue());
         assertEquals(3L, progression.nextValue());
     }
     
     @Test
     @DisplayName("Progression starts an initial value")
     void progressionAcceptsStartingValue(){
        // Arrange
        Progression progression = new Progression(5);
         
        // Act and assert
        assertEquals(5L, progression.nextValue());
        assertEquals(6L, progression.nextValue());
        assertEquals(7L, progression.nextValue());
     }
     
     @Test
     @DisplayName("Each call to nextValue advances the current state")
     void nextValueChangesCurrentState(){
        // Arrange
        Progression progression = new Progression(10);
         
        // Act
        long first = progression.nextValue();
        long second = progression.nextValue();
        long third = progression.nextValue();
         
        // Assert
        assertEquals(10L, first);
        assertEquals(11L, second);
        assertEquals(12L, third);
         
     }

}
