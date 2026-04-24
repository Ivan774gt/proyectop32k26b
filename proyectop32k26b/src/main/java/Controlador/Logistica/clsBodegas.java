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
public class clsBodegas {
    private int Bodcodigo;
    private String Bodnombre;
    private String Bodestado;
    
    public clsBodegas() {
    }
    //constructo de parametros
    public clsBodegas(int Bodcodigo, String Bodnombre, String Bodestado) {
        this.Bodcodigo = Bodcodigo;
        this.Bodnombre = Bodnombre;
        this.Bodestado = Bodestado;
    }
    //getters y setters
    public int getBodcodigo() {
        return Bodcodigo;
    }

    public void setBodcodigo(int Bodcodigo) {
        this.Bodcodigo = Bodcodigo;
    }

    public String getBodnombre() {
        return Bodnombre;
    }

    public void setBodnombre(String Bodnombre) {
        this.Bodnombre = Bodnombre;
    }

    public String getBodestado() {
        return Bodestado;
    }

    public void setBodestado(String Bodestado) {
        this.Bodestado = Bodestado;
    }

    @Override
    public String toString() {
        return "Bodegas{" + "Bodcodigo=" + Bodcodigo + ", Bodnombre=" + Bodnombre + ", Bodestado=" + Bodestado + '}';
    }
}
