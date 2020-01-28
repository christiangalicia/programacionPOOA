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
public class Alumno {
    private String nombre;
    private int edad;
    private String estatus;
    private double calificacionP1;
    private double calificacionP2;
    
    public Alumno(String nombre, int edad,String estatus){
        this.nombre= nombre;
        this.edad= edad;
        this.estatus=estatus;
    }
    public String consultarAlumno(){
        return nombre+" "+ edad+" "+ estatus;
    }
    public void modificarCalificaciones(double p1, double p2){
        calificacionP1= p1;
        calificacionP2=p2;
    }
    public double consultarCalificacionFinal(){
        return (calificacionP1+calificacionP2)/2;
    }
}
