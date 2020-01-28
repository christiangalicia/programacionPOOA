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
public class Porcentaje {
    private int hombres;
    private int mujeres;
    
    public Porcentaje(int hombres, int mujeres){
        this.hombres=hombres;
        this.mujeres= mujeres;
    }
    public double porcentajeHombres(){
        return  (double)hombres*100/(hombres+mujeres);
    }
    public double porcentajeMujeres(){
        return (double)mujeres*100/(hombres+mujeres);
    }
    public void setHombres(int hombres){
        this.hombres=hombres;
    }
    public int getHombres(){
        return hombres;
    }
    
}
