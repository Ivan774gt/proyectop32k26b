//Ferdynan Monroy abril 2026
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Logistica;

/**
 *
 * @author ferito
 */
public class clsPedidos {
    private int Pedcodigo;
    private int Pedclienteid;
    private String Pedestado;

    public clsPedidos() {
    }
    //cosntructor con parametros
    public clsPedidos(int Pedcodigo, int Pedclienteid, String Pedestado) {
        this.Pedcodigo = Pedcodigo;
        this.Pedclienteid = Pedclienteid;
        this.Pedestado = Pedestado;
    }
    //getters y setters
    public int getPedcodigo() {
        return Pedcodigo;
    }

    public void setPedcodigo(int Pedcodigo) {
        this.Pedcodigo = Pedcodigo;
    }

    public int getPedclienteid() {
        return Pedclienteid;
    }

    public void setPedclienteid(int Pedclienteid) {
        this.Pedclienteid = Pedclienteid;
    }

    public String getPedestado() {
        return Pedestado;
    }

    public void setPedestado(String Pedestado) {
        this.Pedestado = Pedestado;
    }

    @Override
    public String toString() {
        return "Pedidos{" + "Pedcodigo=" + Pedcodigo + ", Pedclienteid=" + Pedclienteid + ", Pedestado=" + Pedestado + '}';
    }
}
