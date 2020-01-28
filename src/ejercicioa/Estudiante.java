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
public class Estudiante {
    private String nombre;
    private int parcial1;
    private int parcial2;
    private int parcial3;
    private int trabajoFinal;
    private int examenFinal;
    
    public Estudiante(String nombre){
        this.nombre=nombre;
    }
    public void setParcial1(int parcial1){
        this.parcial1=parcial1;
    }
    public void setParcial2(int parcial2){
        this.parcial2=parcial2;
    }
    public void setParcial3(int parcial3){
        this.parcial3=parcial3;
    }
    public void setExamenFinal(int examenFinal){
        this.examenFinal= examenFinal;
    }
    public void setTrabajoFinal(int trabajoFinal){
        this.trabajoFinal= trabajoFinal;
    }
    public double promedioFinal(){
        double p=((parcial1+parcial2+parcial3)/3)*.5;
        return p+ examenFinal*.3+trabajoFinal*.2;
    }
    
}
