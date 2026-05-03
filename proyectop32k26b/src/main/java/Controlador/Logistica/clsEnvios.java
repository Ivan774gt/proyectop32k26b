//Ferdynand Monroy abril 2026
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Logistica;
import java.sql.Timestamp;
/**
 *
 * @author ferito
 */
public class clsEnvios {

    private int Envid;
    private int Peid;
    private int Tranid;
    private Timestamp Envfechasalida;
    private String Envnumeroguia;
    
    //constructor vacio
    public clsEnvios() {
    }
    //constructor con parametros
    public clsEnvios(int Envid, int Peid, int Tranid, Timestamp Envfechasalida, String Envnumeroguia) {
        this.Envid = Envid;
        this.Peid = Peid;
        this.Tranid = Tranid;
        this.Envfechasalida = Envfechasalida;
        this.Envnumeroguia = Envnumeroguia;
    }
    //getters y setters
    public int getEnvid() {
        return Envid;
    }

    public void setEnvid(int Envid) {
        this.Envid = Envid;
    }

    public int getPeid() {
        return Peid;
    }

    public void setPeid(int Peid) {
        this.Peid = Peid;
    }

    public int getTranid() {
        return Tranid;
    }

    public void setTranid(int Tranid) {
        this.Tranid = Tranid;
    }

    public Timestamp getEnvfechasalida() {
        return Envfechasalida;
    }

    public void setEnvfechasalida(Timestamp Envfechasalida) {
        this.Envfechasalida = Envfechasalida;
    }

    public String getEnvnumeroguia() {
        return Envnumeroguia;
    }

    public void setEnvnumeroguia(String Envnumeroguia) {
        this.Envnumeroguia = Envnumeroguia;
    }

    @Override
    public String toString() {
        return "clsEnvios{" + "Envid=" + Envid + ", Peid=" + Peid + ", Tranid=" + Tranid + ", Envfechasalida=" + Envfechasalida + ", Envnumeroguia=" + Envnumeroguia + '}';
    }
    
}
