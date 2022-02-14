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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      GenericTupla<Integer, Integer> point1 = new GenericTupla<>(2, 2);
        GenericTupla<Integer, Integer> point2 = new GenericTupla<>(2, 2);
        ObjectTupla objTuple = new ObjectTupla(3, "HOLA");
        boolean isEqual = Utilities.compare(point1, point2);
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(objTuple);
        System.out.println("verificando la igualdad usando equals     " + point1.equals(point2));
        System.out.println("verificando la igualdad usando Utilities.compare method:   " + isEqual);
        boolean isEqual2 = Utilities.compare(point1, objTuple);
        System.out.println("comparacion de punto1 y objTuple  " + isEqual2);
    }
    
}
