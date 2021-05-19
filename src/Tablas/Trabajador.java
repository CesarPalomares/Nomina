package Tablas;


import java.sql.Date;

/**
 * Tablas
 * Nombre_project: JDBC
 * Trabajador
 * Created by: MarcosRa
 * Date : 28/04/2021
 * Description:
 **/
public class Trabajador {
    private String DNI_Trabajador;
    private String nombre;
    private String apellido;
    private String apellido2;
    private Date fechaInicio;
    private int edad;
    private String puesto;
    private double irpf;
    private int idConvenio;


    public Trabajador() {
    }

    public Trabajador(String DNI_Trabajador) {
        this.DNI_Trabajador = DNI_Trabajador;
    }

    public Trabajador(String DNI_Trabajador, String nombre, String apellido, String apellido2, Date fechaInicio, int edad, String puesto, double irpf, int idConvenio) {
        this.DNI_Trabajador = DNI_Trabajador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.apellido2 = apellido2;
        this.fechaInicio = fechaInicio;
        this.edad = edad;
        this.puesto = puesto;
        this.irpf = irpf;
        this.idConvenio = idConvenio;
    }

    public String getDNI_Trabajador() {
        return DNI_Trabajador;
    }

    public void setDNI_Trabajador(String DNI_Trabajador) {
        this.DNI_Trabajador = DNI_Trabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getIrpf() {
        return irpf;
    }

    public void setIrpf(double irpf) {
        this.irpf = irpf;
    }

    public int getIdConvenio() {
        return idConvenio;
    }

    public void setIdConvenio(int idConvenio) {
        this.idConvenio = idConvenio;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "DNI_Trabajador='" + DNI_Trabajador + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", edad=" + edad +
                ", puesto='" + puesto + '\'' +
                ", irpf=" + irpf +
                ", idConvenio=" + idConvenio +
                '}';
    }
}
