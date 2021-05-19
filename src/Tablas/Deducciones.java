package Tablas;

/**
 * Tablas
 * Nombre_project: NominasJava-marcos
 * Deducciones
 * Created by: MarcosRa
 * Date : 08/05/2021
 * Description:
 **/
public class Deducciones {
    private int idDeduccion;
    private double formacion;
    double desempleo;
    private double horas_extra;
    double horas_extra_fm;
    private double contingenciasComunes;

    public Deducciones() {
    }

    public Deducciones(int idDeduccion) {
        this.idDeduccion = idDeduccion;
    }

    public Deducciones(int idDeduccion, double formacion, double desempleo, double horas_extra, double horas_extra_fm, double contingenciasComunes) {
        this.idDeduccion = idDeduccion;
        this.formacion = formacion;
        this.desempleo = desempleo;
        this.horas_extra = horas_extra;
        this.horas_extra_fm = horas_extra_fm;
        this.contingenciasComunes = contingenciasComunes;
    }

    public int getIdDeduccion() {
        return idDeduccion;
    }

    public void setIdDeduccion(int idDeduccion) {
        this.idDeduccion = idDeduccion;
    }

    public double getFormacion() {
        return formacion;
    }

    public void setFormacion(double formacion) {
        this.formacion = formacion;
    }

    public double getDesempleo() {
        return desempleo;
    }

    public void setDesempleo(double desempleo) {
        this.desempleo = desempleo;
    }

    public double getHoras_extra() {
        return horas_extra;
    }

    public void setHoras_extra(double horas_extra) {
        this.horas_extra = horas_extra;
    }

    public double getHoras_extra_fm() {
        return horas_extra_fm;
    }

    public void setHoras_extra_fm(double horas_extra_fm) {
        this.horas_extra_fm = horas_extra_fm;
    }

    public double getContingenciasComunes() {
        return contingenciasComunes;
    }

    public void setContingenciasComunes(double contingenciasComunes) {
        this.contingenciasComunes = contingenciasComunes;
    }

    @Override
    public String toString() {
        return "Deducciones{" +
                "idDeduccion=" + idDeduccion +
                ", formacion=" + formacion +
                ", desempleo=" + desempleo +
                ", horas_extra=" + horas_extra +
                ", horas_extra_fm=" + horas_extra_fm +
                ", contingenciasComunes=" + contingenciasComunes +
                '}';
    }
}
