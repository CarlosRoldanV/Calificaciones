/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.List;

/**
 *
 * @author ROBER
 */
public class Carrera {
    private int codigo;
    private String nombre;
    private List<Materia> materia;
    private int numeroSemestres;
    private int numeroEstudiantes;
    private String titulo; 
     public void setCodigo (int codigo){  
       this.codigo = codigo;    
}
        public void setNombre (String nombre ){  
       this.nombre = nombre;     
        }
         public void  setMateria(List<Materia> materia ){  
       this.materia = materia ;     
        }
}
