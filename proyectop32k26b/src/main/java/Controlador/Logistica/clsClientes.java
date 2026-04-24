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
public class clsClientes {

    private int Clicodigo;
    private String Clinombre;
    private String Cliestado;
    
    public clsClientes() {
    }
    //constructor con parametros
    public clsClientes(int Clicodigo, String Clinombre, String Cliestado) {
        this.Clicodigo = Clicodigo;
        this.Clinombre = Clinombre;
        this.Cliestado = Cliestado;
    }
    //getters y setters
    public int getClicodigo() {
        return Clicodigo;
    }

    public void setClicodigo(int Clicodigo) {
        this.Clicodigo = Clicodigo;
    }

    public String getClinombre() {
        return Clinombre;
    }

    public void setClinombre(String Clinombre) {
        this.Clinombre = Clinombre;
    }

    public String getCliestado() {
        return Cliestado;
    }

    public void setCliestado(String Cliestado) {
        this.Cliestado = Cliestado;
    }

    @Override
    public String toString() {
        return Clinombre; //mostrara el nombre del cliente
    }
}
