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
public class Profesor extends Persona {
    private String titulo;
    private double salario;
    private String cargo;
     public void  setTitulo(String titulo){  
       this.titulo =titulo ;     
        }
      public void setSalario (double salario ){  
       this.salario = salario ;     
        }
      public void setCargo (String cargo){
       this.cargo = cargo;
       }
         public String gettitulo() {
        return this.titulo;
    }

    public double getsalario() {
        return this.salario;
    }

    public String getcargo() {
        return this.cargo;
    }
    public Profesor(String titulo, double salario, String cargo, int codigo, String nombre, String cedula, String telefono, String direccion, String correo, Sede sede) {
        super(codigo, nombre, cedula, telefono, direccion, correo, sede);
        this.titulo = titulo;
        this.salario = salario;
        this.cargo = cargo;
    }
    public double getSalario(int horasTrabajadas,double valorPorHora)
    {
        return salario + horasTrabajadas+valorPorHora;
    }
    public double getSalario(double comision)
    {
        return comision;
    }
    
}
