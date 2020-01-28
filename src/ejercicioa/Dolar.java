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
public class Dolar {
    private float pesos;
    private float yuans;
    private float euros;

    public Dolar(float pesos, float yuans, float euros) {
        this.pesos = pesos;
        this.yuans = yuans;
        this.euros = euros;
    }
    public float aEuros(float cantidadDolares){
        return cantidadDolares*euros;
    }
    public float aPesos(float cantidadDolares){
        return cantidadDolares*pesos;
    }
    public float aYuans(float cantidadDolares){
        return cantidadDolares*yuans;
    }
    
    
}
