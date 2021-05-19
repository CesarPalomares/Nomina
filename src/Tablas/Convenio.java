package Tablas;

/**
 * Tablas
 * Nombre_project: NominasJava-marcos
 * Covenio
 * Created by: MarcosRa
 * Date : 30/04/2021
 * Description:
 **/
public class Convenio {
    private int idConvenio;
    private String nombreConvenio;
    private double plusConvenio;
    private int añosAntiguedad;
    private double salarioBase;

    public Convenio() {
    }

    public Convenio(int idConvenio) {
        this.idConvenio = idConvenio;
    }

    public Convenio(int idConvenio, String nombreConvenio, double plusConvenio, int añosAntiguedad, double salarioBase) {
        this.idConvenio = idConvenio;
        this.nombreConvenio = nombreConvenio;
        this.plusConvenio = plusConvenio;
        this.añosAntiguedad = añosAntiguedad;
        this.salarioBase = salarioBase;
    }

    public int getIdConvenio() {
        return idConvenio;
    }

    public void setIdConvenio(int idConvenio) {
        this.idConvenio = idConvenio;
    }

    public String getNombreConvenio() {
        return nombreConvenio;
    }

    public void setNombreConvenio(String nombreConvenio) {
        this.nombreConvenio = nombreConvenio;
    }

    public double getPlusConvenio() {
        return plusConvenio;
    }

    public void setPlusConvenio(double plusConvenio) {
        this.plusConvenio = plusConvenio;
    }

    public int getAñosAntiguedad() {
        return añosAntiguedad;
    }

    public void setAñosAntiguedad(int añosAntiguedad) {
        this.añosAntiguedad = añosAntiguedad;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Convenio{" +
                "idConvenio=" + idConvenio +
                ", nombreConvenio='" + nombreConvenio + '\'' +
                ", plusConvenio=" + plusConvenio +
                ", añosAntiguedad=" + añosAntiguedad +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
