//Karina Alejandra Arriaza Ortiz 9959-24-14190
package Controlador.Bancos;
import java.util.Date;

/**
 * Clase que representa una conciliación bancaria.
 * Permite comparar el saldo del sistema con el saldo del banco.
 * 
 * @author Proyecto Final - Sistema Bancario
 */
public class clsConciliacionBancaria {

    // Identificador único de la conciliación
    private int Conbid;

    // Fecha en la que se realiza la conciliación
    private Date conbfecha;

    // Saldo registrado en el sistema
    private double Conbsaldosistema;

    // Saldo reportado por el banco
    private double Conbsaldobanco;

    // Diferencia entre ambos saldos
    private double Conbdiferencia;

    // Identificador de la cuenta bancaria
    private int CBANid;

    // Identificador del estado de conciliación
    private int Catesid;

    /**
     * Constructor con parámetros.
     * 
     * @param id Identificador de la conciliación
     * @param fecha Fecha de la conciliación
     * @param sistema Saldo del sistema
     * @param banco Saldo del banco
     * @param diferencia Diferencia entre saldos
     * @param cuenta Cuenta bancaria asociada
     * @param estado Estado de la conciliación
     */
    public clsConciliacionBancaria(int id, Date fecha, double sistema,
                                   double banco, double diferencia,
                                   int cuenta, int estado) {
        this.Conbid = id;
        this.conbfecha = fecha;
        this.Conbsaldosistema = sistema;
        this.Conbsaldobanco = banco;
        this.Conbdiferencia = diferencia;
        this.CBANid = cuenta;
        this.Catesid = estado;
    }

    /**
     * Devuelve una representación en texto de la conciliación.
     * 
     * @return Información básica de la conciliación
     */
    @Override
    public String toString() {
        return "Conciliacion{ id=" + Conbid
                + ", saldoSistema=" + Conbsaldosistema
                + ", saldoBanco=" + Conbsaldobanco + " }";
    }
}
