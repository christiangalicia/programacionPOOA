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
public class CuentaBancaria {
    private String nombre;
    private int noCuenta;
    private float saldo;

    public CuentaBancaria(String nombre, int noCuenta, float saldo) {
        this.nombre = nombre;
        this.noCuenta = noCuenta;
        this.saldo = saldo;
    }
    public void depositar(float monto){
        if( monto>0){
            saldo+=monto;
        }
    }
    public void retirar(float monto ){
        if(monto<=saldo){
            saldo= saldo-monto;
        }
    }
    public String consultarSaldo(){
        return "Nombre: "+ nombre+ " Cuenta: "+noCuenta+
                " saldo: "+saldo;
    }
    
}
