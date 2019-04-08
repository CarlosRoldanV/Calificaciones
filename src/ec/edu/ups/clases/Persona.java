/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author ROBER
 */
public class Persona {
    private int codigo;
    private String nombre;
    private String cedula;
    private String telefono;
    private String direccion;
    private String correo;
    private Sede sede;
      public void setCodigo (int codigo ){  
       this.codigo = codigo ;
}
      public void setNombre (String nombre  ){  
       this.nombre = nombre ;
}
      public void setCedula (String cedula  ){  
       this.cedula = cedula;
}
      public void setTelefono (String telefono  ){  
       this.telefono = telefono;
}
      public void setDireccion (String direccion){  
       this.direccion = direccion ;
}
      public void setCorreo (String correo){  
       this.correo = correo ;
}
      public int getCodigo(){
       return this.codigo;
       }
      public String getNombre(){
       return this.nombre;
       }
      public String getCedula (){
       return this.cedula;
       }
      public String getTelefono(){
       return this.telefono;
       }
      public String getDireccion(){
       return this.direccion;
       }
      public String getCorreo (){
       return this.correo;
       }
      public Sede getSede(){
       return this.sede;
       }
 public Persona(int codigo){
        this.setCodigo(codigo);
    }

    public Persona(int codigo, String nombre, String cedula) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public Persona(int codigo, String nombre, String cedula, String telefono, String direccion, String correo, Sede sede) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.sede = sede;
    }

    @Override
    public String toString() {
        return "Persona{" + "codigo=" + codigo + ", nombre=" + nombre + ", cedula=" + cedula + ", telefono=" + telefono + ", direccion=" + direccion + ", correo=" + correo + ", sede=" + sede + '}';
    }
    
    
}
