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
public class clsTransportista {
    private int Tracodigo;
    private String Tranombre;
    private String Traestado;

   public clsTransportista() {
    }
    //constructor con parametros
    public clsTransportista(int Tracodigo, String Tranombre, String Traestado) {
        this.Tracodigo = Tracodigo;
        this.Tranombre = Tranombre;
        this.Traestado = Traestado;
    }
    //getters y setters
    public int getTracodigo() {
        return Tracodigo;
    }

    public void setTracodigo(int Tracodigo) {
        this.Tracodigo = Tracodigo;
    }

    public String getTranombre() {
        return Tranombre;
    }

    public void setTranombre(String Tranombre) {
        this.Tranombre = Tranombre;
    }

    public String getTraestado() {
        return Traestado;
    }

    public void setTraestado(String Traestado) {
        this.Traestado = Traestado;
    }

    @Override
    public String toString() {
        return "Transportistas{" + "Tracodigo=" + Tracodigo + ", Tranombre=" + Tranombre + ", Traestado=" + Traestado + '}';
    }
}
