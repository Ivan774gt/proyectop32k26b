/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Compras;

//Librerias
import java.util.Date;
/**
 *
 * @author Isaias Cedillo 9959-24-1672
 */
public class clsFacturascompras  {
    //Atributos basados en la base de datos de Maria Celeste
private int Faccomid;
private String Faccomnumero;
private Date Faccomfecha;
private int Acrecodigo;
private double Faccomsubtotal;
private double Faccomiva;
private double Faccomtotal;
private String Faccomestado;
// GETTERS
    public int getFaccomid() {
        return Faccomid;
    }

    public String getFaccomnumero() {
        return Faccomnumero;
    }

    public Date getFaccomfecha() {
        return Faccomfecha;
    }

    public int getAcrecodigo() {
        return Acrecodigo;
    }

    public double getFaccomsubtotal() {
        return Faccomsubtotal;
    }

    public double getFaccomiva() {
        return Faccomiva;
    }

    public double getFaccomtotal() {
        return Faccomtotal;
    }

    public String getFaccomestado() {
        return Faccomestado;
    }
//SETTERS

    public void setFaccomid(int Faccomid) {
        this.Faccomid = Faccomid;
    }

    public void setFaccomnumero(String Faccomnumero) {
        this.Faccomnumero = Faccomnumero;
    }

    public void setFaccomfecha(Date Faccomfecha) {
        this.Faccomfecha = Faccomfecha;
    }

    public void setAcrecodigo(int Acrecodigo) {
        this.Acrecodigo = Acrecodigo;
    }

    public void setFaccomsubtotal(double Faccomsubtotal) {
        this.Faccomsubtotal = Faccomsubtotal;
    }

    public void setFaccomiva(double Faccomiva) {
        this.Faccomiva = Faccomiva;
    }

    public void setFaccomtotal(double Faccomtotal) {
        this.Faccomtotal = Faccomtotal;
    }

    public void setFaccomestado(String Faccomestado) {
        this.Faccomestado = Faccomestado;
    }
    //Constructores
    public clsFacturascompras (int Faccomid, String Faccomnumero, Date Faccomfecha, int Acrecodigo, double Faccomsubtotal, double Faccomiva, double Faccomtotal, String Faccomestado) {
    this.Faccomid = Faccomid;
    this.Faccomnumero = Faccomnumero;
    this.Faccomfecha = Faccomfecha;
    this.Acrecodigo = Acrecodigo;
    this.Faccomsubtotal = Faccomsubtotal;
    this.Faccomiva = Faccomiva;
    this.Faccomtotal = Faccomtotal;
    this.Faccomestado = Faccomestado;
}
    public clsFacturascompras () {}
    //Caso especial (ID autogenerado)
    public clsFacturascompras (String Faccomnumero, Date Faccomfecha, int Acrecodigo, double Faccomsubtotal, double Faccomiva, double Faccomtotal, String Faccomestado) {
    this.Faccomnumero = Faccomnumero;
    this.Faccomfecha = Faccomfecha;
    this.Acrecodigo = Acrecodigo;
    this.Faccomsubtotal = Faccomsubtotal;
    this.Faccomiva = Faccomiva;
    this.Faccomtotal = Faccomtotal;
    this.Faccomestado = Faccomestado;
}
    //To String
    @Override
    public String toString() {
        return "clsFacturascompras {" + "Faccomid=" + Faccomid + ", Faccomnumero=" + Faccomnumero + ", Faccomfecha=" + Faccomfecha + ", Acrecodigo=" + Acrecodigo + ", Faccomsubtotal=" + Faccomsubtotal + ", Faccomiva=" + Faccomiva + ", Faccomtotal=" + Faccomtotal + ", Faccomestado=" + Faccomestado + '}';
    }
    
}
