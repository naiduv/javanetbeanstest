/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpp;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Venkat.Naidu
 */
public class driver {
     public static void main(String[] args) {

        System.out.println("Enter a radius: ");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        double radius = reader.nextDouble(); // Scans the next token of the input as an int.
        
        Circle cicle = new Circle(radius);
        Vector circleVector = new Vector(10);
       
        circleVector.add(new Circle(10));
     }
}
