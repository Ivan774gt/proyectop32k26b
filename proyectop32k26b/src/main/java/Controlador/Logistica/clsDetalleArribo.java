//Ferdynand Monroy mayo 2026
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Logistica;

/**
 *
 * @author ferito
 */
public class clsDetalleArribo {

    private int Detallearriboid;
    private int Arriboid;
    private int Proid;
    private int Detarribocantidad;
    private char Detarribopreciounitariocompra;
    
    //constructor vacio
    public clsDetalleArribo() {
    }
    
    //constructor con parametros
    public clsDetalleArribo(int Detallearriboid, int Arriboid, int Proid, int Detarribocantidad, char Detarribopreciounitariocompra) {
        this.Detallearriboid = Detallearriboid;
        this.Arriboid = Arriboid;
        this.Proid = Proid;
        this.Detarribocantidad = Detarribocantidad;
        this.Detarribopreciounitariocompra = Detarribopreciounitariocompra;
    }
    //getters y setters
    public int getDetallearriboid() {
        return Detallearriboid;
    }

    public void setDetallearriboid(int Detallearriboid) {
        this.Detallearriboid = Detallearriboid;
    }

    public int getArriboid() {
        return Arriboid;
    }

    public void setArriboid(int Arriboid) {
        this.Arriboid = Arriboid;
    }

    public int getProid() {
        return Proid;
    }

    public void setProid(int Proid) {
        this.Proid = Proid;
    }

    public int getDetarribocantidad() {
        return Detarribocantidad;
    }

    public void setDetarribocantidad(int Detarribocantidad) {
        this.Detarribocantidad = Detarribocantidad;
    }

    public char getDetarribopreciounitariocompra() {
        return Detarribopreciounitariocompra;
    }

    public void setDetarribopreciounitariocompra(char Detarribopreciounitariocompra) {
        this.Detarribopreciounitariocompra = Detarribopreciounitariocompra;
    }

    @Override
    public String toString() {
        return "clsDetalleArribo{" + "Detallearriboid=" + Detallearriboid + ", Arriboid=" + Arriboid + ", Proid=" + Proid + ", Detarribocantidad=" + Detarribocantidad + ", Detarribopreciounitariocompra=" + Detarribopreciounitariocompra + '}';
    }
    
}
