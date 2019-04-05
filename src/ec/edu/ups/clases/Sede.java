/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ROBER
 */
public class Sede {
    private int codigo;
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Carrera> carrera;
   public Sede(){
         carrera=new ArrayList<>();
     }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDirecS(String direccion) {
        this.direccion = direccion;
    }

    public void setTelfS(String telefono) {
        this.telefono = telefono;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carrera = carreras;
    }
    
    
    //get
    public int getCodigo() {
        return codigo;
    }

    public String getnombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String gettelefono() {
        return telefono;
    }

    public List<Carrera> getCarrera() {
        return carrera;
    }
    
    
    public void agregarCarrera(Carrera carrera){
       carrera.add(Carreras);
    }
}
