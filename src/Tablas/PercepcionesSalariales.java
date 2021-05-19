package Tablas;

/**
 * Tablas
 * Nombre_project: NominasJava-marcos
 * PercepcionesSalariales
 * Created by: MarcosRa
 * Date : 08/05/2021
 * Description:
 **/
public class PercepcionesSalariales {
    private int idPercepcion;
    private double horasExtra;
    private double horasExtraFM;
    private double plusAntiguedad;
    private int idConvenio;

    public PercepcionesSalariales() {
    }

    public PercepcionesSalariales(int idConvenio) {
        this.idConvenio = idConvenio;
    }

    public PercepcionesSalariales(int idPercepcion, double horasExtra, double horasExtraFM, double plusAntiguedad, int idConvenio) {
        this.idPercepcion = idPercepcion;
        this.horasExtra = horasExtra;
        this.horasExtraFM = horasExtraFM;
        this.plusAntiguedad = plusAntiguedad;
        this.idConvenio = idConvenio;
    }

    public int getIdPercepcion() {
        return idPercepcion;
    }

    public void setIdPercepcion(int idPercepcion) {
        this.idPercepcion = idPercepcion;
    }

    public double getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(double horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getHorasExtraFM() {
        return horasExtraFM;
    }

    public void setHorasExtraFM(double horasExtraFM) {
        this.horasExtraFM = horasExtraFM;
    }

    public double getPlusAntiguedad() {
        return plusAntiguedad;
    }

    public void setPlusAntiguedad(double plusAntiguedad) {
        this.plusAntiguedad = plusAntiguedad;
    }



    public int getIdConvenio() {
        return idConvenio;
    }

    public void setIdConvenio(int idConvenio) {
        this.idConvenio = idConvenio;
    }

    @Override
    public String toString() {
        return "PercepcionesSalariales{" +
                "idPercepcion=" + idPercepcion +
                ", horasExtra=" + horasExtra +
                ", horasExtraFM=" + horasExtraFM +
                ", plusAntiguedad=" + plusAntiguedad +
                ", idConvenio=" + idConvenio +
                '}';
    }
}
