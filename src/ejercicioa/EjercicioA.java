/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioa;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class EjercicioA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        Alumno david = new Alumno("David", 20, "activo");
        david.modificarCalificaciones(5, 8);
        System.out.println(david.consultarAlumno());
        System.out.println(david.consultarCalificacionFinal());
        
        Alumno maria= new Alumno("maria", 22, "activo");
        maria.modificarCalificaciones(9, 8);
        System.out.println(maria.consultarAlumno());
        System.out.println(maria.consultarCalificacionFinal());
        */
       /*
        MaquinaDeBoletos caja1= new MaquinaDeBoletos(50, 200,10);
        System.out.println(caja1.obtenerPrecio());
        System.out.println(caja1.obtenerSaldo());
        caja1.imprimirBoleto(6);
        System.out.println(caja1.obtenerSaldo());
        caja1.imprimirBoleto(6);
        System.out.println(caja1.obtenerSaldo());
        */
       /*
       Circulo c1 = new Circulo(12.5);
        System.out.println(c1.perimetro());
        System.out.println(c1.area());
        System.out.println(c1.getRadio());
        c1.setRadio(4);
        System.out.println(c1.perimetro());
        System.out.println(c1.area());
        */
       /*
        Estudiante e1 = new Estudiante("juan");
        e1.setParcial1(5);
        e1.setParcial2(8);
        e1.setParcial3(9);
        e1.setTrabajoFinal(7);
        e1.setExamenFinal(8); 
        System.out.println(e1.promedioFinal());
    */
       /*
       Scanner leer = new Scanner(System.in);
       Porcentaje p=null;
        while (true) {  
            
            System.out.println("1 .- Reiniciar o Iniciar programa");
            System.out.println("2.- Mostrar Porcentajes");
            int opcion = leer.nextInt();
            if(opcion==1){
                System.out.println("INgresa numero de hombre y mujeres");
                int h= leer.nextInt();
                int m= leer.nextInt();
                p= new Porcentaje(h, m);
            }else if(opcion==2){
                System.out.println("hombres: "+p.porcentajeHombres());
                System.out.println("mujeres: "+p.porcentajeMujeres());
            }
        }
    */
       /*
       Dolar dolar = new Dolar(18.67f,  6.87f, .9f);
        System.out.println(dolar.aEuros(10));
        System.out.println(dolar.aYuans(10));
        System.out.println(dolar.aPesos(10));
*/
      /*
       CuentaBancaria cb = new CuentaBancaria("juan", 123, 300);
       cb.retirar(500);
       cb.depositar(200);
       cb.retirar(400);
        System.out.println(cb.consultarSaldo());
*/
   
       String m= "mi correo christia@imageninsite.com y "+
               "mi correo cpaco@imageninsite.com y "+
               "mi correo luis@imageninsite.com y "+
                " el del trabajo christian@uttehuacan.edu.mx gracias";
      
       ManejoDeCadenas mc = new ManejoDeCadenas();
        System.out.println(mc.borrarCorreos(m));
        
        String otro= " mas informacion cpn@mas.coreos y otro mas@correo.com ";
        
       System.out.println(mc.borrarCorreos(otro));
    }
    
}
