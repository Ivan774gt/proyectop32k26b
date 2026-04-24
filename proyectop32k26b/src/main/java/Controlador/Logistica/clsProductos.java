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
public class clsProductos {
    private int Prdcodigo;
    private String Prdnombre;
    private String Prdestado;
    
    public clsProductos() {
    }
    //constructo con parametros
    public clsProductos(int Prdcodigo, String Prdnombre, String Prdestado) {
        this.Prdcodigo = Prdcodigo;
        this.Prdnombre = Prdnombre;
        this.Prdestado = Prdestado;
    }
    //getters y setters
    public int getPrdcodigo() {
        return Prdcodigo;
    }

    public void setPrdcodigo(int Prdcodigo) {
        this.Prdcodigo = Prdcodigo;
    }

    public String getPrdnombre() {
        return Prdnombre;
    }

    public void setPrdnombre(String Prdnombre) {
        this.Prdnombre = Prdnombre;
    }

    public String getPrdestado() {
        return Prdestado;
    }

    public void setPrdestado(String Prdestado) {
        this.Prdestado = Prdestado;
    }

    @Override
    public String toString() {
        return "Productos{" + "Prdcodigo=" + Prdcodigo + ", Prdnombre=" + Prdnombre + ", Prdestado=" + Prdestado + '}';
    }
}
