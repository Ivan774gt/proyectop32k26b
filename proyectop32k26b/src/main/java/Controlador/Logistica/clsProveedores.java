//Ferdynand Monroy abril 2026
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Logistica;

/**
 *
 * @author ferito
 */
public class clsProveedores {

    private int Procodigo;
    private String Pronombre;
    private String Proestado;
    
   public clsProveedores() {
    }
    //constructor parametros
    public clsProveedores(int Procodigo, String Pronombre, String Proestado) {
        this.Procodigo = Procodigo;
        this.Pronombre = Pronombre;
        this.Proestado = Proestado;
    }
    //getters y setters
    public int getProcodigo() {
        return Procodigo;
    }

    public void setProcodigo(int Procodigo) {
        this.Procodigo = Procodigo;
    }

    public String getPronombre() {
        return Pronombre;
    }

    public void setPronombre(String Pronombre) {
        this.Pronombre = Pronombre;
    }

    public String getProestado() {
        return Proestado;
    }

    public void setProestado(String Proestado) {
        this.Proestado = Proestado;
    }

    @Override
    public String toString() {
        return Pronombre; // Retornamos el nombre para que se vea bien en ComboBox de Swing
    }
}
