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
public class Materia {
    private int codigo;
    private String nombre;
    private int numeroCreditos;
    private int numeroHoras;
    private int nivel;
    private Grupo grupo;
    private Profesor profesor;
    public void setCodigo(int codigo) {
        this.codigo= codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setGrupos(Grupo grupo) {
        this.grupo= grupo;
    }

    public void setProfesores(Profesor profesor) {
        this.profesor = profesor;
    }

    //get
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumCreditos() {
        return numeroCreditos;
    }

    public int getNumHoras() {
        return numeroHoras;
    }

    public int getNivel() {
        return nivel;
    }

    public Grupo getGrupos() {
        return grupo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    
    @Override
    public String toString() {
        return "Materia{" + "codigo=" + codigo + ", nombre=" + nombre + ", numeroCreditos=" + numeroCreditos + ", numeroHoras=" + numeroHoras + ", nivel=" + nivel + ", grupo=" + grupo + ", profesor=" + profesor + '}';
    }
    
}
