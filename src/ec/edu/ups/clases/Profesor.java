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
        return titulo;
    }

    public double getsalario() {
        return salario;
    }

    public String getcargo() {
        return cargo;
    }
    public double getsalario (int horasTrabajadas, double valorPorHora){
        return salario +(horasTrabajadas * valorPorHora);
    }
}
