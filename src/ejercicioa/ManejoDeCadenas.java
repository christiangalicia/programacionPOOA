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
public class ManejoDeCadenas {
    
    
    public String borrarCorreos(String texto){
          while(texto.indexOf("@") != -1){       
            int p1=texto.indexOf("@"); //21
            int p2 =texto.indexOf(" ", p1); //38
            int p3= texto.lastIndexOf(" ", p1); //12
            texto= texto.replace(texto.substring(p3+1, p2), "****");
          
        }
          return texto;
    }
    
    public String obtenerCURP(String nombre,
            String fechaNacimiento, String estado, String sexo){
        return "";
    }
}
