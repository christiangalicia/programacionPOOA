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
public class MaquinaDeBoletos {
    private int precioBoleto;
    private int saldo;
    private int numeroDeBoletos;
    
    public MaquinaDeBoletos(int precioBoleto, int saldo, 
                                    int numeroDeBoletos){
        this.precioBoleto= precioBoleto;
        this.saldo= saldo;
        this.numeroDeBoletos= numeroDeBoletos;
    }
    public int obtenerPrecio(){
        return precioBoleto;
    }
    public int obtenerSaldo(){
        return saldo;
    }
    public void ingresarDinero(int cantidad){
        if( cantidad>0){
            saldo=saldo+cantidad;
        }
    }
    public void imprimirBoleto(int cantidadBoletos){
        if(cantidadBoletos<= numeroDeBoletos){
          System.out.println(cantidadBoletos +"Boletos entregados");
          saldo=saldo+(precioBoleto*cantidadBoletos);
          numeroDeBoletos=numeroDeBoletos-cantidadBoletos;
        }
    }
}
