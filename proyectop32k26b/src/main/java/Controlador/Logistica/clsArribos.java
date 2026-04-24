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
public class clsArribos {
    private int Arrcodigo;
    private int Arrproveedorid;
    private String Arrestado;
    
   // Constructor vacío
    public clsArribos() {
    }

    //constructor de parametros
    public clsArribos(int Arrcodigo, int Arrproveedorid, String Arrestado) {
        this.Arrcodigo = Arrcodigo;
        this.Arrproveedorid = Arrproveedorid;
        this.Arrestado = Arrestado;
    }

    //getters y setters
    public int getArrcodigo() {
        return Arrcodigo;
    }

    public void setArrcodigo(int Arrcodigo) {
        this.Arrcodigo = Arrcodigo;
    }

    public int getArrproveedorid() {
        return Arrproveedorid;
    }

    public void setArrproveedorid(int Arrproveedorid) {
        this.Arrproveedorid = Arrproveedorid;
    }

    public String getArrestado() {
        return Arrestado;
    }

    public void setArrestado(String Arrestado) {
        this.Arrestado = Arrestado;
    }

    @Override
    public String toString() {
        return "Arribos{" + "Arrcodigo=" + Arrcodigo + ", Arrproveedorid=" + Arrproveedorid + ", Arrestado=" + Arrestado + '}';
    }
    
    
}
