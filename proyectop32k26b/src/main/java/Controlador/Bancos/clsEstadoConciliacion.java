//Karina Alejandra Arriaza Ortiz 9959-24-14190
package Controlador.Bancos;

/**
 * Clase que representa un estado de conciliación bancaria.
 * Define si una conciliación está pendiente, conciliada o con diferencia.
 * 
 * @author Proyecto Final - Sistema Bancario
 */
public class clsEstadoConciliacion {

    // Identificador único del estado
    private int Catesid;

    // Nombre del estado de conciliación
    private String Catesnombreestado;

    /**
     * Constructor con parámetros.
     * 
     * @param id Identificador del estado
     * @param nombre Nombre del estado de conciliación
     */
    public clsEstadoConciliacion(int id, String nombre) {
        this.Catesid = id;
        this.Catesnombreestado = nombre;
    }

    // Métodos getters y setters

    public int getCatesid() { return Catesid; }
    public void setCatesid(int Catesid) { this.Catesid = Catesid; }

    public String getCatesnombreestado() { return Catesnombreestado; }
    public void setCatesnombreestado(String Catesnombreestado) { this.Catesnombreestado = Catesnombreestado; }

    /**
     * Devuelve una representación en texto del estado de conciliación.
     * 
     * @return Información básica del estado
     */
    @Override
    public String toString() {
        return "EstadoConciliacion{ id=" + Catesid
                + ", estado=" + Catesnombreestado + " }";
    }
}