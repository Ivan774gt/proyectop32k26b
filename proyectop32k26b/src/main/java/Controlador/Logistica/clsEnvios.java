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
public class clsEnvios {
    private int Envcodigo;
    private int Envpedidoid;
    private int Envtransportistaid;
    private String Envestado;
    
    public clsEnvios() {
    }
    //constructor con parametros
    public clsEnvios(int Envcodigo, int Envpedidoid, int Envtransportistaid, String Envestado) {
        this.Envcodigo = Envcodigo;
        this.Envpedidoid = Envpedidoid;
        this.Envtransportistaid = Envtransportistaid;
        this.Envestado = Envestado;
    }
    //getters y setters
    public int getEnvcodigo() {
        return Envcodigo;
    }

    public void setEnvcodigo(int Envcodigo) {
        this.Envcodigo = Envcodigo;
    }

    public int getEnvpedidoid() {
        return Envpedidoid;
    }

    public void setEnvpedidoid(int Envpedidoid) {
        this.Envpedidoid = Envpedidoid;
    }

    public int getEnvtransportistaid() {
        return Envtransportistaid;
    }

    public void setEnvtransportistaid(int Envtransportistaid) {
        this.Envtransportistaid = Envtransportistaid;
    }

    public String getEnvestado() {
        return Envestado;
    }

    public void setEnvestado(String Envestado) {
        this.Envestado = Envestado;
    }

    @Override
    public String toString() {
        return "Envios{" + "Envcodigo=" + Envcodigo + ", Envpedidoid=" + Envpedidoid + ", Envtransportistaid=" + Envtransportistaid + ", Envestado=" + Envestado + '}';
    }
}
