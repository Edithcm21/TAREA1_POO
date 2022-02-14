/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

/**
 *
 * @author edith
 */
public class Utilities {
    
     public static <T, U> boolean compare(T firstTuple, U secondTuple) {
         
         
        if (firstTuple instanceof GenericTupla && secondTuple instanceof GenericTupla) {
            
            
            GenericTupla myTuple = (GenericTupla) firstTuple;
            GenericTupla anotherTuple = (GenericTupla) secondTuple;
            return myTuple.getKey().equals(anotherTuple.getKey()) && myTuple.getValue().equals(anotherTuple.getValue());
            
            
        }
        
        return false;
        
    }
     
    
}
