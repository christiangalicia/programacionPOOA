/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioa;

/**
 *
 * @author Christian
 */
public class Circulo {
    private double radio;
    private final double PI=3.1416;
    
    public Circulo(double radio){
        this.radio=radio;
    }  
    public double area(){
        return radio*radio*PI;
    }
    public double perimetro(){
        return radio*2*PI;
    }   
    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio=radio;
    }
}
