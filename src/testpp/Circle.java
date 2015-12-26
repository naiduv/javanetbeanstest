/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpp;
/**
 *
 * @author Venkat.Naidu
 */
public class Circle implements Circular{

    /**
     * @param args the command line arguments
     */

    private Circle() {
    }
    
    public Circle(double radius){
        setRadius(radius);
    }
    
    private double _radius = 0;
    private double _area = 0;
   
    @Override
    public void setRadius(double radius) {
        _radius = radius;
        calculateArea();
    }

    
    @Override
    public double getRadius() {
        return _radius;
    }

    @Override
    public void calculateArea() {
        _area =  22*_radius*_radius/7;
    }
    
}
