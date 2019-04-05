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
public class Grupo {
    private int codigo;
    private String nombre;
    private int cupo;
     public void setCodigoG(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    //get
    public int getCodigo() {
        return codigo;
    }

    public String getNommbre() {
        return nombre;
    }

    public int getCupo() {
        return cupo;
    }
}
