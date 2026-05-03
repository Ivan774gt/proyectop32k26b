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
public class clsDetallePedidos {

    private int Detallepedidoid;
    private int Peid;
    private int Proid;
    private int Detallepedidocantidad;
    
    //constructor vacio
    public clsDetallePedidos() {
    }
    //constructor con parametros
    public clsDetallePedidos(int Detallepedidoid, int Peid, int Proid, int Detallepedidocantidad) {
        this.Detallepedidoid = Detallepedidoid;
        this.Peid = Peid;
        this.Proid = Proid;
        this.Detallepedidocantidad = Detallepedidocantidad;
    }
    //getters y setters
    public int getDetallepedidoid() {
        return Detallepedidoid;
    }

    public void setDetallepedidoid(int Detallepedidoid) {
        this.Detallepedidoid = Detallepedidoid;
    }

    public int getPeid() {
        return Peid;
    }

    public void setPeid(int Peid) {
        this.Peid = Peid;
    }

    public int getProid() {
        return Proid;
    }

    public void setProid(int Proid) {
        this.Proid = Proid;
    }

    public int getDetallepedidocantidad() {
        return Detallepedidocantidad;
    }

    public void setDetallepedidocantidad(int Detallepedidocantidad) {
        this.Detallepedidocantidad = Detallepedidocantidad;
    }

    @Override
    public String toString() {
        return "clsDetallePedidos{" + "Detallepedidoid=" + Detallepedidoid + ", Peid=" + Peid + ", Proid=" + Proid + ", Detallepedidocantidad=" + Detallepedidocantidad + '}';
    }
    
}
